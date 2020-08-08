package com.fixasset.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bypt-dev-laptop-9
 */
@RestController
@RequestMapping(value = "")
public class MainController {
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getHome() {
        return new String("<h1> Welcome to Micro Services Demo Project</h1> ");
    }
    
}
