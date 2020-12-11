package com.shengde.e3mall.controller;

import com.shengde.e3mall.entity.TbOrderShipping;
import com.shengde.e3mall.service.TbOrderShippingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;



/**
 * (TbOrderShipping)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:43
 */
@RestController
@RequestMapping("tbOrderShipping")
public class TbOrderShippingController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderShippingService tbOrderShippingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrderShipping selectOne(int id) {
        return this.tbOrderShippingService.queryById(id);
    }

}