package io.github.springstudent.dubbo;

import java.util.List;

/**
 * @author 周宁
 */
public interface HelloApiService {

    String say(String message);

    void print(List<String> stringList);
}
