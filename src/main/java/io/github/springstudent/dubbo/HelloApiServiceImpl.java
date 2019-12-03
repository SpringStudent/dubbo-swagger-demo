package io.github.springstudent.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

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
}
