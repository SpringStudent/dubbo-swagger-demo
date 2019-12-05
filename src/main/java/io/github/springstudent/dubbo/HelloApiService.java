package io.github.springstudent.dubbo;

import io.github.springstudent.bean.Cheng;
import io.github.springstudent.bean.Generic;
import io.github.springstudent.bean.Zhou;

import java.util.List;
import java.util.Map;


/**
 * @author 周宁
 */
public interface HelloApiService {

    void complex(Cheng cheng, Zhou zhou);

    void complex2(Cheng cheng, String projectId, Zhou zhou);

    void complex3(Zhou zhou, String projectId, Integer i, Generic<Cheng> chengGeneric);

    void complex4(String projectId, Integer i, Zhou zhou, Generic<Cheng> chengGeneric);

    void complex5(Zhou zhou, String projectId, Cheng cheng, Integer i, Generic<Cheng> chengGeneric);

    void list(List<String> l1, List<String> l2);

    void list2(List<String> ids, Map<String, Zhou> map);

    void print(String str);

}
