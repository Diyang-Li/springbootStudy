package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Diyang Li
 * @create 2022-06-06 11:45 AM
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country1;
    @GetMapping
    public String getById(){
        System.out.println("springboot is running1221...");
        System.out.println(country1);
        return "springboot is running...12112";
    }
}
