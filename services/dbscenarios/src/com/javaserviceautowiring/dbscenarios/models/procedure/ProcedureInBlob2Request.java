/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.dbscenarios.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ProcedureInBlob2Request implements Serializable {


    @JsonProperty(value = "BLOBCOL", access = Access.READ_ONLY)
    private byte[] blobcol;

    @JsonProperty("DESCRIPTION")
    @NotNull
    private String description;

    public byte[] getBlobcol() {
        return this.blobcol;
    }

    public void setBlobcol(byte[] blobcol) {
        this.blobcol = blobcol;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInBlob2Request)) return false;
        final ProcedureInBlob2Request procedureInBlob2request = (ProcedureInBlob2Request) o;
        return Objects.equals(getBlobcol(), procedureInBlob2request.getBlobcol()) &&
                Objects.equals(getDescription(), procedureInBlob2request.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBlobcol(),
                getDescription());
    }
}
