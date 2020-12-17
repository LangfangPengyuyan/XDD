package com.shengde.e3mall.controller;

import com.shengde.e3mall.entity.TbItemCat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * (TbItemCat)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:42
 */
@RestController
@RequestMapping("tbItemCat")
public class TbItemCatController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemCatService tbItemCatService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItemCat selectOne(Integer id) {
        return this.tbItemCatService.queryById(id);
    }

}