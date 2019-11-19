package com.fhlkd.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by yanghaiyang on 2019/11/19 16:33
 */
@Data
public class User {

    private String name;

    private String password;

    private Date createTIme;
}
