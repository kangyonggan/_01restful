package com.kangyonggan.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangyonggan
 * @since 2019-09-19
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("name")
    public String name(String name) {
        return "hello " + name;
    }

}
