/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leo.example.gitIntelij.rest;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static leo.example.gitIntelij.GitIntelijApplication.APPLICATION_START_TIME;
import static leo.example.gitIntelij.GitIntelijApplication.DEVELOPMENT_VERSION;

/**
 * @author odzhara-ongom
 */
@RestController
@RequestMapping(value = {"/api"})
public class AppAPI {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AppAPI.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, Object> test() {
        Map<String, Object> result = new HashMap<>();
        result.put("application", "iOS App Microservice");
        result.put("version", DEVELOPMENT_VERSION);
        result.put("applicationStart", new Date(APPLICATION_START_TIME).toString());
        return result;
    }

}
