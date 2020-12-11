package com.shengde.e3mall.controller;

import com.shengde.e3mall.entity.TbItemParam;
import com.shengde.e3mall.service.TbItemParamService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;


/**
 * (TbItemParam)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:43
 */
@RestController
@RequestMapping("tbItemParam")
public class TbItemParamController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemParamService tbItemParamService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItemParam selectOne(Integer id) {
        return this.tbItemParamService.queryById(id);
    }

}