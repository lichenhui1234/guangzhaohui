package com.guangzhaohui.lrps.controller;

import com.guangzhaohui.lrps.entity.DemoEntity;
import com.guangzhaohui.lrps.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李晨辉
 * @date 2019-09-18
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/insert")
    public DemoEntity insert(DemoEntity demoEntity) {
        return demoService.insert(demoEntity);
    }

    @GetMapping(value = "/findAll")
    public Iterable<DemoEntity> findall() {
        return demoService.findAll();
    }


}
