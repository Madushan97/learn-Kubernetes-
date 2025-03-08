package com.madushan.Kubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {

    @GetMapping
    public String getGreeting() {
        return "Make sure table names (rule, rule_configuration, table_list) and column names match your DB schema";
    }
}
