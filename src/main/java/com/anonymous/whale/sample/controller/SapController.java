package com.anonymous.whale.sample.controller;

import com.anonymous.whale.common.enums.ResultStatus;
import com.anonymous.whale.common.model.APIResult;
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

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public APIResult getAllProvinces() {
        return APIResult.getInstance(ResultStatus.SUCCESS);
    }
}

