/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.dbscenarios.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponse implements Serializable {


    @ColumnAlias("content")
    private List<ProcedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponseContent> content;

    public List<ProcedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponseContent> getContent() {
        return this.content;
    }

    public void setContent(List<ProcedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponseContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponse)) return false;
        final ProcedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponse procedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponse = (ProcedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponse) o;
        return Objects.equals(getContent(), procedureGetAllTypesWithAliasesInsertQueryWithSysParamsResponse.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent());
    }
}