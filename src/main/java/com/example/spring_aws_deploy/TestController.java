package com.example.spring_aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/demo")
public class TestController {

        @GetMapping("/data")
        public String getData() {
                return "First message from AWS ECS";
        }
}
