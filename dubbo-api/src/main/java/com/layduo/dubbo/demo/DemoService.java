package com.layduo.dubbo.demo;

import java.util.List;

/**
 * Created by wy on 2017/4/13.
 */
public interface DemoService {

    List<String> getPermissions(Long id);

    List<String> getDataList(List<String> list);
}
