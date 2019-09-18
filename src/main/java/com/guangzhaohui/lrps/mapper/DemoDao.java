package com.guangzhaohui.lrps.mapper;

import com.guangzhaohui.lrps.entity.DemoEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author 李晨辉
 * @date 2019-09-16
 */
public interface DemoDao extends PagingAndSortingRepository<DemoEntity, Integer> {
}
