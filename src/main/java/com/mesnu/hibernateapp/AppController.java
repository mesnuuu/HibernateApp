package com.mesnu.hibernateapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {
 
    @Autowired
    private ProductService service;
     
    // handler methods...
}
