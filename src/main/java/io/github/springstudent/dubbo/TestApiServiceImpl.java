package io.github.springstudent.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author 周宁
 * @Date 2019-12-05 19:05
 */
@Service
@Component
public class TestApiServiceImpl implements TestApiService {
    @Override
    public void test() {
        System.out.println("test()");
    }
}
