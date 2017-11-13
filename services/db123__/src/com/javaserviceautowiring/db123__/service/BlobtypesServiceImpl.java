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

import com.javaserviceautowiring.db123__.Blobtypes;


/**
 * ServiceImpl object for domain model class Blobtypes.
 *
 * @see Blobtypes
 */
@Service("db123__.BlobtypesService")
@Validated
public class BlobtypesServiceImpl implements BlobtypesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlobtypesServiceImpl.class);


    @Autowired
    @Qualifier("db123__.BlobtypesDao")
    private WMGenericDao<Blobtypes, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Blobtypes, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
	public Blobtypes create(Blobtypes blobtypes) {
        LOGGER.debug("Creating a new Blobtypes with information: {}", blobtypes);
        Blobtypes blobtypesCreated = this.wmGenericDao.create(blobtypes);
        return blobtypesCreated;
    }

	@Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
	public Blobtypes getById(Integer blobtypesId) throws EntityNotFoundException {
        LOGGER.debug("Finding Blobtypes by id: {}", blobtypesId);
        Blobtypes blobtypes = this.wmGenericDao.findById(blobtypesId);
        if (blobtypes == null){
            LOGGER.debug("No Blobtypes found with id: {}", blobtypesId);
            throw new EntityNotFoundException(String.valueOf(blobtypesId));
        }
        return blobtypes;
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
	public Blobtypes findById(Integer blobtypesId) {
        LOGGER.debug("Finding Blobtypes by id: {}", blobtypesId);
        return this.wmGenericDao.findById(blobtypesId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "db123__TransactionManager")
	@Override
	public Blobtypes update(Blobtypes blobtypes) throws EntityNotFoundException {
        LOGGER.debug("Updating Blobtypes with information: {}", blobtypes);
        this.wmGenericDao.update(blobtypes);

        Integer blobtypesId = blobtypes.getPkId();

        return this.wmGenericDao.findById(blobtypesId);
    }

    @Transactional(value = "db123__TransactionManager")
	@Override
	public Blobtypes delete(Integer blobtypesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Blobtypes with id: {}", blobtypesId);
        Blobtypes deleted = this.wmGenericDao.findById(blobtypesId);
        if (deleted == null) {
            LOGGER.debug("No Blobtypes found with id: {}", blobtypesId);
            throw new EntityNotFoundException(String.valueOf(blobtypesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "db123__TransactionManager")
	@Override
	public Page<Blobtypes> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Blobtypes");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<Blobtypes> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Blobtypes");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service db123__ for table Blobtypes to {} format", exportType);
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

