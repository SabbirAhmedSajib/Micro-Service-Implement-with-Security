package com.banking_solution.Teller.Module.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test1/v1")
public class TestController {

    @GetMapping
    private String Hello(){
        return "Hello Teller";
    }
}
