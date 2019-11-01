package com.layduo.dubbo.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.layduo.dubbo.demo.DemoService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("demoService")
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }

    @Override
    public List<String> getDataList(List<String> list) {
        List<String> resultList = new ArrayList<String>();
        resultList.addAll(list);
        return resultList;
    }
}
