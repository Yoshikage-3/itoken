package com.funtl.itoken.service.digiccy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController(value = "/v1/digiccy")
public class DigiccyController {

    /**
     * 交易所列表
     * @return
     */
    @RequestMapping(value = "/exchange",method = RequestMethod.GET)
    public String exchange(){

        return null;
    }
}
