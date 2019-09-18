package com.guangzhaohui.lrps.service;

import com.guangzhaohui.lrps.entity.DemoEntity;
import com.guangzhaohui.lrps.mapper.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李晨辉
 * @date 2019-09-16
 */
@Service
public class DemoService {
    @Autowired
    private DemoDao demoDao;

    public DemoEntity insert(DemoEntity entity) {
        return demoDao.save(entity);
    }
    public Iterable<DemoEntity>  findAll() {
         return demoDao.findAll();
    }

}
