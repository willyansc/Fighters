package com.anonymous.whale.sample.controller;

import com.anonymous.whale.common.enums.ResultStatus;
import com.anonymous.whale.common.model.APIResult;
import com.anonymous.whale.common.utils.APIUtils;
import com.anonymous.whale.sample.domain.Sample;
import com.anonymous.whale.sample.service.ISampleService;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qinliujie on 15-1-6.
 */
@Controller
@RequestMapping("/sample")
public class SapController {
    @Autowired
    private ISampleService sampleServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public APIResult getAllProvinces() {
        Sample sample = sampleServiceImpl.getById(1);
        return APIUtils.getResponse(sample);
    }
}

