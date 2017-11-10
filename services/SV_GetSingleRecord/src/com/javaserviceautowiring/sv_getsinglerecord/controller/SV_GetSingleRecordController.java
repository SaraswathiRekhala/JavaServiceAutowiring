/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.javaserviceautowiring.sv_getsinglerecord.controller;

import com.javaserviceautowiring.sv_getsinglerecord.SV_GetSingleRecord;
import com.javaserviceautowiring.dbscenarios.models.query.SvGetAllTypesSingleResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/sV_GetSingleRecord")
public class SV_GetSingleRecordController {

    @Autowired
    private SV_GetSingleRecord sV_GetsingleRecord;

    @RequestMapping(value = "/singleRecord", method = RequestMethod.GET)
    public SvGetAllTypesSingleResponse getSingleRecord() {
        return sV_GetsingleRecord.getSingleRecord();
    }
}