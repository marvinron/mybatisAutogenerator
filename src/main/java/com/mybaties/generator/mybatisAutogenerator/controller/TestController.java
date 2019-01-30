package com.mybaties.generator.mybatisAutogenerator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    private String driverClass;
    @RequestMapping("/test")
    public void getName(){
        System.out.println("==="+driverClass);

    }

    @RequestMapping("/404.html")
    public Map<String,Object> handlePageNotFound(HttpStatus status,
                                                 HttpServletRequest request,
                                                 Throwable throwable) {

        Map<String,Object> errors = new HashMap<>();

        errors.put("statusCode",
                request.getAttribute("javax.servlet.error.status_code"));
        errors.put("requestUri",
                request.getAttribute("javax.servlet.error.request_uri"));

        return errors;
    }
}
