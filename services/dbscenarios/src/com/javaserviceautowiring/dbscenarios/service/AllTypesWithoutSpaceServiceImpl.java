/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.dbscenarios.service;

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

import com.javaserviceautowiring.dbscenarios.AllTypesWithoutSpace;


/**
 * ServiceImpl object for domain model class AllTypesWithoutSpace.
 *
 * @see AllTypesWithoutSpace
 */
@Service("dbscenarios.AllTypesWithoutSpaceService")
@Validated
public class AllTypesWithoutSpaceServiceImpl implements AllTypesWithoutSpaceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllTypesWithoutSpaceServiceImpl.class);


    @Autowired
    @Qualifier("dbscenarios.AllTypesWithoutSpaceDao")
    private WMGenericDao<AllTypesWithoutSpace, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<AllTypesWithoutSpace, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
	public AllTypesWithoutSpace create(AllTypesWithoutSpace allTypesWithoutSpace) {
        LOGGER.debug("Creating a new AllTypesWithoutSpace with information: {}", allTypesWithoutSpace);
        AllTypesWithoutSpace allTypesWithoutSpaceCreated = this.wmGenericDao.create(allTypesWithoutSpace);
        return allTypesWithoutSpaceCreated;
    }

	@Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
	public AllTypesWithoutSpace getById(Integer alltypeswithoutspaceId) throws EntityNotFoundException {
        LOGGER.debug("Finding AllTypesWithoutSpace by id: {}", alltypeswithoutspaceId);
        AllTypesWithoutSpace allTypesWithoutSpace = this.wmGenericDao.findById(alltypeswithoutspaceId);
        if (allTypesWithoutSpace == null){
            LOGGER.debug("No AllTypesWithoutSpace found with id: {}", alltypeswithoutspaceId);
            throw new EntityNotFoundException(String.valueOf(alltypeswithoutspaceId));
        }
        return allTypesWithoutSpace;
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
	public AllTypesWithoutSpace findById(Integer alltypeswithoutspaceId) {
        LOGGER.debug("Finding AllTypesWithoutSpace by id: {}", alltypeswithoutspaceId);
        return this.wmGenericDao.findById(alltypeswithoutspaceId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "dbscenariosTransactionManager")
	@Override
	public AllTypesWithoutSpace update(AllTypesWithoutSpace allTypesWithoutSpace) throws EntityNotFoundException {
        LOGGER.debug("Updating AllTypesWithoutSpace with information: {}", allTypesWithoutSpace);
        this.wmGenericDao.update(allTypesWithoutSpace);

        Integer alltypeswithoutspaceId = allTypesWithoutSpace.getPkid();

        return this.wmGenericDao.findById(alltypeswithoutspaceId);
    }

    @Transactional(value = "dbscenariosTransactionManager")
	@Override
	public AllTypesWithoutSpace delete(Integer alltypeswithoutspaceId) throws EntityNotFoundException {
        LOGGER.debug("Deleting AllTypesWithoutSpace with id: {}", alltypeswithoutspaceId);
        AllTypesWithoutSpace deleted = this.wmGenericDao.findById(alltypeswithoutspaceId);
        if (deleted == null) {
            LOGGER.debug("No AllTypesWithoutSpace found with id: {}", alltypeswithoutspaceId);
            throw new EntityNotFoundException(String.valueOf(alltypeswithoutspaceId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
	public Page<AllTypesWithoutSpace> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all AllTypesWithoutSpaces");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Page<AllTypesWithoutSpace> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all AllTypesWithoutSpaces");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service dbscenarios for table AllTypesWithoutSpace to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

