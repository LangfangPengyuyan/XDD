package com.shengde.e3mall.controller;

import com.shengde.e3mall.entity.TbOrderItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;



/**
 * (TbOrderItem)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:43
 */
@RestController
@RequestMapping("tbOrderItem")
public class TbOrderItemController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderItemService tbOrderItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrderItem selectOne(int id) {
        return this.tbOrderItemService.queryById(id);
    }

}