/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.javaserviceautowiring.sv_getbyloggedinid.controller;

import com.javaserviceautowiring.sv_getbyloggedinid.SV_GetByLoggedInId;
import org.springframework.data.domain.Pageable;
import com.javaserviceautowiring.dbscenarios.models.query.SvGetByLoggedInIdResponse;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/sV_GetByLoggedInId")
public class SV_GetByLoggedInIdController {

    @Autowired
    private SV_GetByLoggedInId sV_GetByLoggedInId;

    @RequestMapping(value = "/byLoggedInId", method = RequestMethod.GET)
    public Page<SvGetByLoggedInIdResponse> getByLoggedInId(Pageable pageable) {
        return sV_GetByLoggedInId.getByLoggedInId(pageable);
    }
}
