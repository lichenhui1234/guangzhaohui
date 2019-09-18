package com.guangzhaohui.lrps.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 *
 * @author 李晨辉
 * @date 2019-09-16
 */
@Data
@Entity
@Table(name = "demo")
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String demoName;

}
