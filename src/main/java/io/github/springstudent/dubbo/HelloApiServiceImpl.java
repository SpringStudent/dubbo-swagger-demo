package io.github.springstudent.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 周宁
 */
@Service(interfaceClass = HelloApiService.class)
@Component
public class HelloApiServiceImpl implements HelloApiService {
    @Override
    public String say(String message) {
        return message;
    }

    @Override
    public void print(List<String> stringList) {
        String result="";
        for(String str : stringList){
            result = result + str+",";
        }
        System.out.println(result);
    }
}
