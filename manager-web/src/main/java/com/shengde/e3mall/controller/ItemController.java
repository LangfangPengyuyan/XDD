package com.shengde.e3mall.controller;

import com.shengde.e3mall.entity.TbItem;
import com.shengde.e3mall.service.impl.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;

/**
 * 商品管理
 */

@Controller
public class ItemController {

    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private TbItem getItemById(@PathVariable Integer itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

}