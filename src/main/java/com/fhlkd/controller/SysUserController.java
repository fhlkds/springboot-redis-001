package com.fhlkd.controller;


import com.fhlkd.entity.SysUser;
import com.fhlkd.service.ISysUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 员工表 前端控制器
 * </p>
 *
 * @author hy.Yang
 * @since 2019-11-21
 */
@RestController
@RequestMapping("/fhlkd/sys-user")
public class SysUserController {

    @Resource
    private ISysUserService sysUserService;

    @RequestMapping("/list")
    public List<SysUser> list(){
        return sysUserService.list();
    }

}
