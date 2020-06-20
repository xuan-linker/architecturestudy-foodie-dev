package com.xlccc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linker
 * @date 2020/6/21 0:20
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object Hello() {
        return "Hello World";
    }
}
