package com.shengde.e3mall.controller;

import com.shengde.e3mall.entity.TbUser;
import com.shengde.e3mall.service.TbUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * (TbUser)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:43
 */
@RestController
@RequestMapping("tbUser")
public class TbUserController {
    /**
     * 服务对象
     */
    @Resource
    private TbUserService tbUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbUser selectOne(Integer id) {
        return this.tbUserService.queryById(id);
    }

}