package com.springboot.model;

/**
 * Created by ghost on 2018/12/6.
 */

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


//@NoArgsConstructor  // @AllArgsConstructor会导致@Data不生成无参构造方法，需要手动添加@NoArgsConstructor，
// 如果没有无参构造方法，可能会导致比如com.fasterxml.jackson在序列化处理时报错
//@Getter
//@Setter
//@ToString
@Data   // 生成无参构造方法/getter/setter/hashCode/equals/toString
@AllArgsConstructor // 生成所有参数构造方法
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String idcard;
    @Column(name = "qq_number")
    private String qqNumber;

}
