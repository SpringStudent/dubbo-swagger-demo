package io.github.springstudent;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import io.github.springstudent.core.EnableDubboSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@EnableDubboSwagger(classPackage = "io.github.springstudent.web",includeApis = {"HelloApiService"})
public class Application {
    public static void main(String[] args) {
         SpringApplication.run(Application.class, args);
    }

}
