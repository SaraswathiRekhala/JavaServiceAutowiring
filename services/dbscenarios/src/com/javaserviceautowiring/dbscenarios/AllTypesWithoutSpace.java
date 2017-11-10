/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.dbscenarios;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * AllTypesWithoutSpace generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`AllTypesWithoutSpace`")
public class AllTypesWithoutSpace implements Serializable {

    private Integer pkid;
    private Short bytecol;
    private Short shortcol;
    private Integer intcol;
    private Float floatcol;
    private Long longcol;
    private Double doublecol;
    private Long bigintcol;
    private BigDecimal bigdeccol;
    private String charcol;
    private String stringcol;
    private String textcol;
    private String clobcol;
    private Date datecol;
    @Type(type = "DateTime")
    private LocalDateTime datetimecol;
    private Time timecol;
    private Timestamp timestampcol;
    private Boolean booleancol;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] blobcol;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`PKID`", nullable = false, scale = 0, precision = 10)
    public Integer getPkid() {
        return this.pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    @Column(name = "`BYTECOL`", nullable = true, scale = 0, precision = 5)
    public Short getBytecol() {
        return this.bytecol;
    }

    public void setBytecol(Short bytecol) {
        this.bytecol = bytecol;
    }

    @Column(name = "`SHORTCOL`", nullable = true, scale = 0, precision = 5)
    public Short getShortcol() {
        return this.shortcol;
    }

    public void setShortcol(Short shortcol) {
        this.shortcol = shortcol;
    }

    @Column(name = "`INTCOL`", nullable = true, scale = 0, precision = 10)
    public Integer getIntcol() {
        return this.intcol;
    }

    public void setIntcol(Integer intcol) {
        this.intcol = intcol;
    }

    @Column(name = "`FLOATCOL`", nullable = true, scale = 4, precision = 8)
    public Float getFloatcol() {
        return this.floatcol;
    }

    public void setFloatcol(Float floatcol) {
        this.floatcol = floatcol;
    }

    @Column(name = "`LONGCOL`", nullable = true, scale = 0, precision = 19)
    public Long getLongcol() {
        return this.longcol;
    }

    public void setLongcol(Long longcol) {
        this.longcol = longcol;
    }

    @Column(name = "`DOUBLECOL`", nullable = true, scale = 8, precision = 18)
    public Double getDoublecol() {
        return this.doublecol;
    }

    public void setDoublecol(Double doublecol) {
        this.doublecol = doublecol;
    }

    @Column(name = "`BIGINTCOL`", nullable = true, scale = 0, precision = 19)
    public Long getBigintcol() {
        return this.bigintcol;
    }

    public void setBigintcol(Long bigintcol) {
        this.bigintcol = bigintcol;
    }

    @Column(name = "`BIGDECCOL`", nullable = true, scale = 15, precision = 35)
    public BigDecimal getBigdeccol() {
        return this.bigdeccol;
    }

    public void setBigdeccol(BigDecimal bigdeccol) {
        this.bigdeccol = bigdeccol;
    }

    @Column(name = "`CHARCOL`", nullable = true, length = 1)
    public String getCharcol() {
        return this.charcol;
    }

    public void setCharcol(String charcol) {
        this.charcol = charcol;
    }

    @Column(name = "`STRINGCOL`", nullable = true, length = 255)
    public String getStringcol() {
        return this.stringcol;
    }

    public void setStringcol(String stringcol) {
        this.stringcol = stringcol;
    }

    @Column(name = "`TEXTCOL`", nullable = true, length = 2147483647)
    public String getTextcol() {
        return this.textcol;
    }

    public void setTextcol(String textcol) {
        this.textcol = textcol;
    }

    @Column(name = "`CLOBCOL`", nullable = true, length = 2147483647)
    public String getClobcol() {
        return this.clobcol;
    }

    public void setClobcol(String clobcol) {
        this.clobcol = clobcol;
    }

    @Column(name = "`DATECOL`", nullable = true)
    public Date getDatecol() {
        return this.datecol;
    }

    public void setDatecol(Date datecol) {
        this.datecol = datecol;
    }

    @Column(name = "`DATETIMECOL`", nullable = true)
    public LocalDateTime getDatetimecol() {
        return this.datetimecol;
    }

    public void setDatetimecol(LocalDateTime datetimecol) {
        this.datetimecol = datetimecol;
    }

    @Column(name = "`TIMECOL`", nullable = true)
    public Time getTimecol() {
        return this.timecol;
    }

    public void setTimecol(Time timecol) {
        this.timecol = timecol;
    }

    @Column(name = "`TIMESTAMPCOL`", nullable = false)
    public Timestamp getTimestampcol() {
        return this.timestampcol;
    }

    public void setTimestampcol(Timestamp timestampcol) {
        this.timestampcol = timestampcol;
    }

    @Column(name = "`BOOLEANCOL`", nullable = true)
    public Boolean getBooleancol() {
        return this.booleancol;
    }

    public void setBooleancol(Boolean booleancol) {
        this.booleancol = booleancol;
    }

    @Column(name = "`BLOBCOL`", nullable = true)
    public byte[] getBlobcol() {
        return this.blobcol;
    }

    public void setBlobcol(byte[] blobcol) {
        this.blobcol = blobcol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AllTypesWithoutSpace)) return false;
        final AllTypesWithoutSpace allTypesWithoutSpace = (AllTypesWithoutSpace) o;
        return Objects.equals(getPkid(), allTypesWithoutSpace.getPkid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPkid());
    }
}

