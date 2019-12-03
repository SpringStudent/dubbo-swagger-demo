package io.github.springstudent.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周宁
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "hello world";
    }
}
