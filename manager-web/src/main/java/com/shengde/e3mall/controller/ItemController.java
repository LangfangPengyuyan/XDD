package com.shengde.e3mall.controller;

import com.shengde.e3mall.common.pojo.EasyUIDataGridResult;
import com.shengde.e3mall.entity.TbItem;
import com.shengde.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * (TbItem)表控制层
 *
 * @author makejava
 * @since 2020-12-07 21:37:42
 */
@RestController
@RequestMapping
public class ItemController {
    /**
     * 服务对象
     */
    @Autowired
    private TbItemService tbItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param  主键
     * @return 单条数据
     */
    @GetMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(Integer itemId) {

        return this.tbItemService.queryById(itemId);
    }


    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        //调用服务查询商品列表
        EasyUIDataGridResult result = tbItemService.getItemList(page,rows);

        return result;
    }

}