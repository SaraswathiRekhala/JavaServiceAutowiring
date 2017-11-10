/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.dbscenarios.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ProcedureInsertAndGetQueryRequest implements Serializable {


    @JsonProperty("BYTECOL")
    @NotNull
    private Byte bytecol;

    @JsonProperty("SHORTCOL")
    @NotNull
    private Short shortcol;

    @JsonProperty("INTCOL")
    @NotNull
    private Integer intcol;

    @JsonProperty("LONGCOL")
    @NotNull
    private Long longcol;

    @JsonProperty("FLOATCOL")
    @NotNull
    private Float floatcol;

    @JsonProperty("DOUBLECOL")
    @NotNull
    private Double doublecol;

    @JsonProperty("BIGDECCOL")
    @NotNull
    private BigDecimal bigdeccol;

    @JsonProperty("BIGINTCOL")
    @NotNull
    private BigInteger bigintcol;

    @JsonProperty("CHARCOL")
    @NotNull
    private Character charcol;

    @JsonProperty("STRINGCOL")
    @NotNull
    private String stringcol;

    @JsonProperty("CLOBCOL")
    @NotNull
    private String clobcol;

    @JsonProperty("TEXTCOL")
    @NotNull
    private String textcol;

    @JsonProperty("DATECOL")
    @NotNull
    private Date datecol;

    @JsonProperty("TIMECOL")
    @NotNull
    private Time timecol;

    @JsonProperty("DATETIMECOL")
    @NotNull
    private LocalDateTime datetimecol;

    @JsonProperty("TIMESTAMPCOL")
    @NotNull
    private Timestamp timestampcol;

    @JsonProperty("BOOLEANCOL")
    @NotNull
    private Boolean booleancol;

    @JsonProperty(value = "BLOBCOL", access = Access.READ_ONLY)
    private byte[] blobcol;

    public Byte getBytecol() {
        return this.bytecol;
    }

    public void setBytecol(Byte bytecol) {
        this.bytecol = bytecol;
    }

    public Short getShortcol() {
        return this.shortcol;
    }

    public void setShortcol(Short shortcol) {
        this.shortcol = shortcol;
    }

    public Integer getIntcol() {
        return this.intcol;
    }

    public void setIntcol(Integer intcol) {
        this.intcol = intcol;
    }

    public Long getLongcol() {
        return this.longcol;
    }

    public void setLongcol(Long longcol) {
        this.longcol = longcol;
    }

    public Float getFloatcol() {
        return this.floatcol;
    }

    public void setFloatcol(Float floatcol) {
        this.floatcol = floatcol;
    }

    public Double getDoublecol() {
        return this.doublecol;
    }

    public void setDoublecol(Double doublecol) {
        this.doublecol = doublecol;
    }

    public BigDecimal getBigdeccol() {
        return this.bigdeccol;
    }

    public void setBigdeccol(BigDecimal bigdeccol) {
        this.bigdeccol = bigdeccol;
    }

    public BigInteger getBigintcol() {
        return this.bigintcol;
    }

    public void setBigintcol(BigInteger bigintcol) {
        this.bigintcol = bigintcol;
    }

    public Character getCharcol() {
        return this.charcol;
    }

    public void setCharcol(Character charcol) {
        this.charcol = charcol;
    }

    public String getStringcol() {
        return this.stringcol;
    }

    public void setStringcol(String stringcol) {
        this.stringcol = stringcol;
    }

    public String getClobcol() {
        return this.clobcol;
    }

    public void setClobcol(String clobcol) {
        this.clobcol = clobcol;
    }

    public String getTextcol() {
        return this.textcol;
    }

    public void setTextcol(String textcol) {
        this.textcol = textcol;
    }

    public Date getDatecol() {
        return this.datecol;
    }

    public void setDatecol(Date datecol) {
        this.datecol = datecol;
    }

    public Time getTimecol() {
        return this.timecol;
    }

    public void setTimecol(Time timecol) {
        this.timecol = timecol;
    }

    public LocalDateTime getDatetimecol() {
        return this.datetimecol;
    }

    public void setDatetimecol(LocalDateTime datetimecol) {
        this.datetimecol = datetimecol;
    }

    public Timestamp getTimestampcol() {
        return this.timestampcol;
    }

    public void setTimestampcol(Timestamp timestampcol) {
        this.timestampcol = timestampcol;
    }

    public Boolean getBooleancol() {
        return this.booleancol;
    }

    public void setBooleancol(Boolean booleancol) {
        this.booleancol = booleancol;
    }

    public byte[] getBlobcol() {
        return this.blobcol;
    }

    public void setBlobcol(byte[] blobcol) {
        this.blobcol = blobcol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInsertAndGetQueryRequest)) return false;
        final ProcedureInsertAndGetQueryRequest procedureInsertAndGetQueryRequest = (ProcedureInsertAndGetQueryRequest) o;
        return Objects.equals(getBytecol(), procedureInsertAndGetQueryRequest.getBytecol()) &&
                Objects.equals(getShortcol(), procedureInsertAndGetQueryRequest.getShortcol()) &&
                Objects.equals(getIntcol(), procedureInsertAndGetQueryRequest.getIntcol()) &&
                Objects.equals(getLongcol(), procedureInsertAndGetQueryRequest.getLongcol()) &&
                Objects.equals(getFloatcol(), procedureInsertAndGetQueryRequest.getFloatcol()) &&
                Objects.equals(getDoublecol(), procedureInsertAndGetQueryRequest.getDoublecol()) &&
                Objects.equals(getBigdeccol(), procedureInsertAndGetQueryRequest.getBigdeccol()) &&
                Objects.equals(getBigintcol(), procedureInsertAndGetQueryRequest.getBigintcol()) &&
                Objects.equals(getCharcol(), procedureInsertAndGetQueryRequest.getCharcol()) &&
                Objects.equals(getStringcol(), procedureInsertAndGetQueryRequest.getStringcol()) &&
                Objects.equals(getClobcol(), procedureInsertAndGetQueryRequest.getClobcol()) &&
                Objects.equals(getTextcol(), procedureInsertAndGetQueryRequest.getTextcol()) &&
                Objects.equals(getDatecol(), procedureInsertAndGetQueryRequest.getDatecol()) &&
                Objects.equals(getTimecol(), procedureInsertAndGetQueryRequest.getTimecol()) &&
                Objects.equals(getDatetimecol(), procedureInsertAndGetQueryRequest.getDatetimecol()) &&
                Objects.equals(getTimestampcol(), procedureInsertAndGetQueryRequest.getTimestampcol()) &&
                Objects.equals(getBooleancol(), procedureInsertAndGetQueryRequest.getBooleancol()) &&
                Objects.equals(getBlobcol(), procedureInsertAndGetQueryRequest.getBlobcol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBytecol(),
                getShortcol(),
                getIntcol(),
                getLongcol(),
                getFloatcol(),
                getDoublecol(),
                getBigdeccol(),
                getBigintcol(),
                getCharcol(),
                getStringcol(),
                getClobcol(),
                getTextcol(),
                getDatecol(),
                getTimecol(),
                getDatetimecol(),
                getTimestampcol(),
                getBooleancol(),
                getBlobcol());
    }
}
