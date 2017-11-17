package com.jeffery.template.mvc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  JEFFERY YEW
 * @since   17 NOV 2017
 */
@RequestMapping("/api/v1")
@RestController
public class HelloWorldController {

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getHelloWorld() {
        return "Hello World!";
    }
}