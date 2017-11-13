/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.db123__.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.javaserviceautowiring.db123__.DefaultValues;


/**
 * ServiceImpl object for domain model class DefaultValues.
 *
 * @see DefaultValues
 */
@Service("db123__.DefaultValuesService")
@Validated
public class DefaultValuesServiceImpl implements DefaultValuesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultValuesServiceImpl.class);


    @Autowired
    @Qualifier("db123__.DefaultValuesDao")
    private WMGenericDao<DefaultValues, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<DefaultValues, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
	public DefaultValues create(DefaultValues defaultValues) {
        LOGGER.debug("Creating a new DefaultValues with information: {}", defaultValues);
        DefaultValues defaultValuesCreated = this.wmGenericDao.create(defaultValues);
        return defaultValuesCreated;
    }

	@Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
	public DefaultValues getById(Integer defaultvaluesId) throws EntityNotFoundException {
        LOGGER.debug("Finding DefaultValues by id: {}", defaultvaluesId);
        DefaultValues defaultValues = this.wmGenericDao.findById(defaultvaluesId);
        if (defaultValues == null){
            LOGGER.debug("No DefaultValues found with id: {}", defaultvaluesId);
            throw new EntityNotFoundException(String.valueOf(defaultvaluesId));
        }
        return defaultValues;
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
	public DefaultValues findById(Integer defaultvaluesId) {
        LOGGER.debug("Finding DefaultValues by id: {}", defaultvaluesId);
        return this.wmGenericDao.findById(defaultvaluesId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "db123__TransactionManager")
	@Override
	public DefaultValues update(DefaultValues defaultValues) throws EntityNotFoundException {
        LOGGER.debug("Updating DefaultValues with information: {}", defaultValues);
        this.wmGenericDao.update(defaultValues);

        Integer defaultvaluesId = defaultValues.getAssignedId();

        return this.wmGenericDao.findById(defaultvaluesId);
    }

    @Transactional(value = "db123__TransactionManager")
	@Override
	public DefaultValues delete(Integer defaultvaluesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting DefaultValues with id: {}", defaultvaluesId);
        DefaultValues deleted = this.wmGenericDao.findById(defaultvaluesId);
        if (deleted == null) {
            LOGGER.debug("No DefaultValues found with id: {}", defaultvaluesId);
            throw new EntityNotFoundException(String.valueOf(defaultvaluesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
	public Page<DefaultValues> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all DefaultValues");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<DefaultValues> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all DefaultValues");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service db123__ for table DefaultValues to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

