package com.shengde.e3mall.controller;

import com.shengde.e3mall.entity.TbItemDesc;
import com.shengde.e3mall.service.TbItemDescService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;


/**
 * (TbItemDesc)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:43
 */
@RestController
@RequestMapping("tbItemDesc")
public class TbItemDescController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemDescService tbItemDescService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItemDesc selectOne(Integer id) {
        return this.tbItemDescService.queryById(id);
    }

}