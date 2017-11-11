package com.tutorial.demo.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping(value="/listProducts", method = RequestMethod.GET)
    public void getProducts(){

    }
}
