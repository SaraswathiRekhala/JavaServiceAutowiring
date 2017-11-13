/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.dbscenarios.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wavemaker.commons.json.serializer.ByteArrayToStringSerializer;
import com.wavemaker.commons.json.views.JsonViews.BlobAsUrlView;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class SvGetByLoggedInIdResponse implements Serializable {


    @ColumnAlias("PK ID")
    private Integer pkId;

    @ColumnAlias("BYTE COL")
    private Short byteCol;

    @ColumnAlias("SHORT COL")
    private Short shortCol;

    @ColumnAlias("INT COL")
    private Integer intCol;

    @ColumnAlias("LONG COL")
    private Long longCol;

    @ColumnAlias("FLOAT COL")
    private Float floatCol;

    @ColumnAlias("DOUBLE COL")
    private Double doubleCol;

    @ColumnAlias("BIGDEC COL")
    private BigDecimal bigdecCol;

    @ColumnAlias("BIGINT COL")
    private Long bigintCol;

    @ColumnAlias("CHAR COL")
    private String charCol;

    @ColumnAlias("STRING COL")
    private String stringCol;

    @ColumnAlias("TEXT COL")
    private String textCol;

    @ColumnAlias("CLOB COL")
    private String clobCol;

    @ColumnAlias("DATE COL")
    private Date dateCol;

    @ColumnAlias("TIME COL")
    private Time timeCol;

    @ColumnAlias("DATETIME COL")
    private LocalDateTime datetimeCol;

    @ColumnAlias("TIMESTAMP COL")
    private Timestamp timestampCol;

    @ColumnAlias("BOOLEAN COL")
    private Boolean booleanCol;

        @JsonView(BlobAsUrlView.class)
    @JsonSerialize(using = ByteArrayToStringSerializer.class)
    @JsonProperty(access = Access.READ_ONLY)
    @ColumnAlias("BLOB COL")
    private byte[] blobCol;

    public Integer getPkId() {
        return this.pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public Short getByteCol() {
        return this.byteCol;
    }

    public void setByteCol(Short byteCol) {
        this.byteCol = byteCol;
    }

    public Short getShortCol() {
        return this.shortCol;
    }

    public void setShortCol(Short shortCol) {
        this.shortCol = shortCol;
    }

    public Integer getIntCol() {
        return this.intCol;
    }

    public void setIntCol(Integer intCol) {
        this.intCol = intCol;
    }

    public Long getLongCol() {
        return this.longCol;
    }

    public void setLongCol(Long longCol) {
        this.longCol = longCol;
    }

    public Float getFloatCol() {
        return this.floatCol;
    }

    public void setFloatCol(Float floatCol) {
        this.floatCol = floatCol;
    }

    public Double getDoubleCol() {
        return this.doubleCol;
    }

    public void setDoubleCol(Double doubleCol) {
        this.doubleCol = doubleCol;
    }

    public BigDecimal getBigdecCol() {
        return this.bigdecCol;
    }

    public void setBigdecCol(BigDecimal bigdecCol) {
        this.bigdecCol = bigdecCol;
    }

    public Long getBigintCol() {
        return this.bigintCol;
    }

    public void setBigintCol(Long bigintCol) {
        this.bigintCol = bigintCol;
    }

    public String getCharCol() {
        return this.charCol;
    }

    public void setCharCol(String charCol) {
        this.charCol = charCol;
    }

    public String getStringCol() {
        return this.stringCol;
    }

    public void setStringCol(String stringCol) {
        this.stringCol = stringCol;
    }

    public String getTextCol() {
        return this.textCol;
    }

    public void setTextCol(String textCol) {
        this.textCol = textCol;
    }

    public String getClobCol() {
        return this.clobCol;
    }

    public void setClobCol(String clobCol) {
        this.clobCol = clobCol;
    }

    public Date getDateCol() {
        return this.dateCol;
    }

    public void setDateCol(Date dateCol) {
        this.dateCol = dateCol;
    }

    public Time getTimeCol() {
        return this.timeCol;
    }

    public void setTimeCol(Time timeCol) {
        this.timeCol = timeCol;
    }

    public LocalDateTime getDatetimeCol() {
        return this.datetimeCol;
    }

    public void setDatetimeCol(LocalDateTime datetimeCol) {
        this.datetimeCol = datetimeCol;
    }

    public Timestamp getTimestampCol() {
        return this.timestampCol;
    }

    public void setTimestampCol(Timestamp timestampCol) {
        this.timestampCol = timestampCol;
    }

    public Boolean getBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(Boolean booleanCol) {
        this.booleanCol = booleanCol;
    }

    public byte[] getBlobCol() {
        return this.blobCol;
    }

    public void setBlobCol(byte[] blobCol) {
        this.blobCol = blobCol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SvGetByLoggedInIdResponse)) return false;
        final SvGetByLoggedInIdResponse svGetByLoggedInIdResponse = (SvGetByLoggedInIdResponse) o;
        return Objects.equals(getPkId(), svGetByLoggedInIdResponse.getPkId()) &&
                Objects.equals(getByteCol(), svGetByLoggedInIdResponse.getByteCol()) &&
                Objects.equals(getShortCol(), svGetByLoggedInIdResponse.getShortCol()) &&
                Objects.equals(getIntCol(), svGetByLoggedInIdResponse.getIntCol()) &&
                Objects.equals(getLongCol(), svGetByLoggedInIdResponse.getLongCol()) &&
                Objects.equals(getFloatCol(), svGetByLoggedInIdResponse.getFloatCol()) &&
                Objects.equals(getDoubleCol(), svGetByLoggedInIdResponse.getDoubleCol()) &&
                Objects.equals(getBigdecCol(), svGetByLoggedInIdResponse.getBigdecCol()) &&
                Objects.equals(getBigintCol(), svGetByLoggedInIdResponse.getBigintCol()) &&
                Objects.equals(getCharCol(), svGetByLoggedInIdResponse.getCharCol()) &&
                Objects.equals(getStringCol(), svGetByLoggedInIdResponse.getStringCol()) &&
                Objects.equals(getTextCol(), svGetByLoggedInIdResponse.getTextCol()) &&
                Objects.equals(getClobCol(), svGetByLoggedInIdResponse.getClobCol()) &&
                Objects.equals(getDateCol(), svGetByLoggedInIdResponse.getDateCol()) &&
                Objects.equals(getTimeCol(), svGetByLoggedInIdResponse.getTimeCol()) &&
                Objects.equals(getDatetimeCol(), svGetByLoggedInIdResponse.getDatetimeCol()) &&
                Objects.equals(getTimestampCol(), svGetByLoggedInIdResponse.getTimestampCol()) &&
                Objects.equals(getBooleanCol(), svGetByLoggedInIdResponse.getBooleanCol()) &&
                Objects.equals(getBlobCol(), svGetByLoggedInIdResponse.getBlobCol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPkId(),
                getByteCol(),
                getShortCol(),
                getIntCol(),
                getLongCol(),
                getFloatCol(),
                getDoubleCol(),
                getBigdecCol(),
                getBigintCol(),
                getCharCol(),
                getStringCol(),
                getTextCol(),
                getClobCol(),
                getDateCol(),
                getTimeCol(),
                getDatetimeCol(),
                getTimestampCol(),
                getBooleanCol(),
                getBlobCol());
    }
}
