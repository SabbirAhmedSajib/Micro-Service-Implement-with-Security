package com.banking_solution.casa.module.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/v1")
public class TestController {

    @GetMapping
    private String Hello(){
        return "Hello Account Opening Saving Checking";
    }
}
