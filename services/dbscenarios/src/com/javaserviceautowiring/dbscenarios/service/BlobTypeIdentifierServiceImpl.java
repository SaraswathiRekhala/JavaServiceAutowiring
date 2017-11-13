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

import com.javaserviceautowiring.dbscenarios.BlobTypeIdentifier;


/**
 * ServiceImpl object for domain model class BlobTypeIdentifier.
 *
 * @see BlobTypeIdentifier
 */
@Service("dbscenarios.BlobTypeIdentifierService")
@Validated
public class BlobTypeIdentifierServiceImpl implements BlobTypeIdentifierService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlobTypeIdentifierServiceImpl.class);


    @Autowired
    @Qualifier("dbscenarios.BlobTypeIdentifierDao")
    private WMGenericDao<BlobTypeIdentifier, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<BlobTypeIdentifier, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
	public BlobTypeIdentifier create(BlobTypeIdentifier blobTypeIdentifier) {
        LOGGER.debug("Creating a new BlobTypeIdentifier with information: {}", blobTypeIdentifier);
        BlobTypeIdentifier blobTypeIdentifierCreated = this.wmGenericDao.create(blobTypeIdentifier);
        return blobTypeIdentifierCreated;
    }

	@Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
	public BlobTypeIdentifier getById(Integer blobtypeidentifierId) throws EntityNotFoundException {
        LOGGER.debug("Finding BlobTypeIdentifier by id: {}", blobtypeidentifierId);
        BlobTypeIdentifier blobTypeIdentifier = this.wmGenericDao.findById(blobtypeidentifierId);
        if (blobTypeIdentifier == null){
            LOGGER.debug("No BlobTypeIdentifier found with id: {}", blobtypeidentifierId);
            throw new EntityNotFoundException(String.valueOf(blobtypeidentifierId));
        }
        return blobTypeIdentifier;
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
	public BlobTypeIdentifier findById(Integer blobtypeidentifierId) {
        LOGGER.debug("Finding BlobTypeIdentifier by id: {}", blobtypeidentifierId);
        return this.wmGenericDao.findById(blobtypeidentifierId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "dbscenariosTransactionManager")
	@Override
	public BlobTypeIdentifier update(BlobTypeIdentifier blobTypeIdentifier) throws EntityNotFoundException {
        LOGGER.debug("Updating BlobTypeIdentifier with information: {}", blobTypeIdentifier);
        this.wmGenericDao.update(blobTypeIdentifier);

        Integer blobtypeidentifierId = blobTypeIdentifier.getId();

        return this.wmGenericDao.findById(blobtypeidentifierId);
    }

    @Transactional(value = "dbscenariosTransactionManager")
	@Override
	public BlobTypeIdentifier delete(Integer blobtypeidentifierId) throws EntityNotFoundException {
        LOGGER.debug("Deleting BlobTypeIdentifier with id: {}", blobtypeidentifierId);
        BlobTypeIdentifier deleted = this.wmGenericDao.findById(blobtypeidentifierId);
        if (deleted == null) {
            LOGGER.debug("No BlobTypeIdentifier found with id: {}", blobtypeidentifierId);
            throw new EntityNotFoundException(String.valueOf(blobtypeidentifierId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "dbscenariosTransactionManager")
	@Override
	public Page<BlobTypeIdentifier> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all BlobTypeIdentifiers");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Page<BlobTypeIdentifier> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all BlobTypeIdentifiers");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service dbscenarios for table BlobTypeIdentifier to {} format", exportType);
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

