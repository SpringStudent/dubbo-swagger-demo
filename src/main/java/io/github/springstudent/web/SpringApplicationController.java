package io.github.springstudent.web;

import io.github.springstudent.util.ApplicationContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周宁
 * @Date 2019-12-11 15:33
 */
@RestController("/spring")
public class SpringApplicationController{

    @GetMapping("/getBeanNames")
    public String[] getBeanNames(){
        return ApplicationContextHolder.getApplicationContext().getBeanDefinitionNames();
    }
}
