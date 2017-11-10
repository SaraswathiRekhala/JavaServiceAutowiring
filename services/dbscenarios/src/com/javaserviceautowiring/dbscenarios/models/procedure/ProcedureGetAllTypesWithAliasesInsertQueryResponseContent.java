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

public class ProcedureGetAllTypesWithAliasesInsertQueryResponseContent implements Serializable {


    @ColumnAlias("PK_ID_COLUMN")
    private Integer pkIdColumn;

    @ColumnAlias("BYTE_COLUMN")
    private Short byteColumn;

    @ColumnAlias("SHORT_COLUMN")
    private Short shortColumn;

    @ColumnAlias("LONG_COLUMN")
    private Long longColumn;

    @ColumnAlias("DOUBLE_COLUMN")
    private BigDecimal doubleColumn;

    @ColumnAlias("BIGINT_COLUMN")
    private Long bigintColumn;

    @ColumnAlias("BIGDEC_COLUMN")
    private BigDecimal bigdecColumn;

    @ColumnAlias("CHAR_COLUMN")
    private String charColumn;

    @ColumnAlias("STRING_COLUMN")
    private String stringColumn;

    @ColumnAlias("TEXT_COLUMN")
    private String textColumn;

    @ColumnAlias("CLOB_COLUMN")
    private String clobColumn;

    @ColumnAlias("DATE_COLUMN")
    private Date dateColumn;

    @ColumnAlias("TIME_COLUMN")
    private Time timeColumn;

    @ColumnAlias("DATETIME_COLUMN")
    private LocalDateTime datetimeColumn;

    @ColumnAlias("TIMESTAMP_COLUMN")
    private Timestamp timestampColumn;

    @ColumnAlias("BOOLEAN_COLUMN")
    private Boolean booleanColumn;

    @JsonProperty(access = Access.READ_ONLY)
    @ColumnAlias("BLOB_COLUMN")
    private byte[] blobColumn;

    public Integer getPkIdColumn() {
        return this.pkIdColumn;
    }

    public void setPkIdColumn(Integer pkIdColumn) {
        this.pkIdColumn = pkIdColumn;
    }

    public Short getByteColumn() {
        return this.byteColumn;
    }

    public void setByteColumn(Short byteColumn) {
        this.byteColumn = byteColumn;
    }

    public Short getShortColumn() {
        return this.shortColumn;
    }

    public void setShortColumn(Short shortColumn) {
        this.shortColumn = shortColumn;
    }

    public Long getLongColumn() {
        return this.longColumn;
    }

    public void setLongColumn(Long longColumn) {
        this.longColumn = longColumn;
    }

    public BigDecimal getDoubleColumn() {
        return this.doubleColumn;
    }

    public void setDoubleColumn(BigDecimal doubleColumn) {
        this.doubleColumn = doubleColumn;
    }

    public Long getBigintColumn() {
        return this.bigintColumn;
    }

    public void setBigintColumn(Long bigintColumn) {
        this.bigintColumn = bigintColumn;
    }

    public BigDecimal getBigdecColumn() {
        return this.bigdecColumn;
    }

    public void setBigdecColumn(BigDecimal bigdecColumn) {
        this.bigdecColumn = bigdecColumn;
    }

    public String getCharColumn() {
        return this.charColumn;
    }

    public void setCharColumn(String charColumn) {
        this.charColumn = charColumn;
    }

    public String getStringColumn() {
        return this.stringColumn;
    }

    public void setStringColumn(String stringColumn) {
        this.stringColumn = stringColumn;
    }

    public String getTextColumn() {
        return this.textColumn;
    }

    public void setTextColumn(String textColumn) {
        this.textColumn = textColumn;
    }

    public String getClobColumn() {
        return this.clobColumn;
    }

    public void setClobColumn(String clobColumn) {
        this.clobColumn = clobColumn;
    }

    public Date getDateColumn() {
        return this.dateColumn;
    }

    public void setDateColumn(Date dateColumn) {
        this.dateColumn = dateColumn;
    }

    public Time getTimeColumn() {
        return this.timeColumn;
    }

    public void setTimeColumn(Time timeColumn) {
        this.timeColumn = timeColumn;
    }

    public LocalDateTime getDatetimeColumn() {
        return this.datetimeColumn;
    }

    public void setDatetimeColumn(LocalDateTime datetimeColumn) {
        this.datetimeColumn = datetimeColumn;
    }

    public Timestamp getTimestampColumn() {
        return this.timestampColumn;
    }

    public void setTimestampColumn(Timestamp timestampColumn) {
        this.timestampColumn = timestampColumn;
    }

    public Boolean getBooleanColumn() {
        return this.booleanColumn;
    }

    public void setBooleanColumn(Boolean booleanColumn) {
        this.booleanColumn = booleanColumn;
    }

    public byte[] getBlobColumn() {
        return this.blobColumn;
    }

    public void setBlobColumn(byte[] blobColumn) {
        this.blobColumn = blobColumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureGetAllTypesWithAliasesInsertQueryResponseContent)) return false;
        final ProcedureGetAllTypesWithAliasesInsertQueryResponseContent procedureGetAllTypesWithAliasesInsertQueryResponseContent = (ProcedureGetAllTypesWithAliasesInsertQueryResponseContent) o;
        return Objects.equals(getPkIdColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getPkIdColumn()) &&
                Objects.equals(getByteColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getByteColumn()) &&
                Objects.equals(getShortColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getShortColumn()) &&
                Objects.equals(getLongColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getLongColumn()) &&
                Objects.equals(getDoubleColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getDoubleColumn()) &&
                Objects.equals(getBigintColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getBigintColumn()) &&
                Objects.equals(getBigdecColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getBigdecColumn()) &&
                Objects.equals(getCharColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getCharColumn()) &&
                Objects.equals(getStringColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getStringColumn()) &&
                Objects.equals(getTextColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getTextColumn()) &&
                Objects.equals(getClobColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getClobColumn()) &&
                Objects.equals(getDateColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getDateColumn()) &&
                Objects.equals(getTimeColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getTimeColumn()) &&
                Objects.equals(getDatetimeColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getDatetimeColumn()) &&
                Objects.equals(getTimestampColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getTimestampColumn()) &&
                Objects.equals(getBooleanColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getBooleanColumn()) &&
                Objects.equals(getBlobColumn(), procedureGetAllTypesWithAliasesInsertQueryResponseContent.getBlobColumn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPkIdColumn(),
                getByteColumn(),
                getShortColumn(),
                getLongColumn(),
                getDoubleColumn(),
                getBigintColumn(),
                getBigdecColumn(),
                getCharColumn(),
                getStringColumn(),
                getTextColumn(),
                getClobColumn(),
                getDateColumn(),
                getTimeColumn(),
                getDatetimeColumn(),
                getTimestampColumn(),
                getBooleanColumn(),
                getBlobColumn());
    }
}
