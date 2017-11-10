/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.javaserviceautowiring.db123__.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.BlobContentNotFoundException;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.file.model.Downloadable;

import com.javaserviceautowiring.db123__.models.query.*;

@Service
public class Db123__QueryExecutorServiceImpl implements Db123__QueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Db123__QueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("db123__WMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<SvDefaultValuesResponse> executeSV_DefaultValues(Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.executeNamedQuery("SV_DefaultValues", params, SvDefaultValuesResponse.class, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public InputStream getBlobColContentForSV_DefaultValues(Integer assignedId, Time timeCol) throws EntityNotFoundException {
        Map params = new HashMap(0);

        params.put("assignedId", assignedId);
        params.put("timeCol", timeCol);

        SvDefaultValuesResponse _result =  queryExecutor.executeNamedQuery("SV_DefaultValues__identifier", params, SvDefaultValuesResponse.class);
        if(_result.getBlobCol() == null) {
            LOGGER.debug("Blob content not exists for blobCol in query SV_DefaultValues");
            throw new BlobContentNotFoundException("Blob content not found for blobCol in query SV_DefaultValues");
        }
        return new ByteArrayInputStream(_result.getBlobCol());
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Downloadable exportSV_DefaultValues(ExportType exportType, Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.exportNamedQueryData("SV_DefaultValues", params, exportType, SvDefaultValuesResponse.class, pageable);
    }

}


