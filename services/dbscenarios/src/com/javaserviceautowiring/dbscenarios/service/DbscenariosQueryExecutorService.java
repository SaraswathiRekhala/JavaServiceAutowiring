/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.javaserviceautowiring.dbscenarios.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.InputStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.file.model.Downloadable;

import com.javaserviceautowiring.dbscenarios.models.query.*;

public interface DbscenariosQueryExecutorService {

    Integer executeSV_InsertWithBlob(SvInsertWithBlobRequest svInsertWithBlobRequest);

    Page<SvGetAllTypesResponse> executeSV_GetAllTypes(Pageable pageable);

    InputStream getBlobColContentForSV_GetAllTypes(Integer pkId) throws EntityNotFoundException;

    Downloadable exportSV_GetAllTypes(ExportType exportType, Pageable pageable);

    SvGetAllTypesSingleResponse executeSV_GetAllTypesSingle();

    InputStream getBlobColContentForSV_GetAllTypesSingle() throws EntityNotFoundException;

    SvGetLoggedInIdByPkIdResponse executeSV_GetLoggedInIdByPkId();

    InputStream getBlobColContentForSV_GetLoggedInIdByPkId() throws EntityNotFoundException;

    Integer executeSV_InsertQuery(SvInsertQueryRequest svInsertQueryRequest);

    Page<SvAllTypesWithoutSpaceResponse> executeSV_AllTypesWithoutSpace(Pageable pageable);

    InputStream getBlobcolContentForSV_AllTypesWithoutSpace(Integer pkid) throws EntityNotFoundException;

    Downloadable exportSV_AllTypesWithoutSpace(ExportType exportType, Pageable pageable);

    Page<SvGetByLoggedInIdResponse> executeSV_GetByLoggedInId(Pageable pageable);

    InputStream getBlobColContentForSV_GetByLoggedInId() throws EntityNotFoundException;

    Downloadable exportSV_GetByLoggedInId(ExportType exportType, Pageable pageable);

}


