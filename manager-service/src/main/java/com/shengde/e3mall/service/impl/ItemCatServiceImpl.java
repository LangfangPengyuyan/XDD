package com.shengde.e3mall.service.impl;

import com.shengde.e3mall.common.pojo.EasyUITreeNode;
import com.shengde.e3mall.dao.TbItemCatDao;
import com.shengde.e3mall.service.ItemCatService;
import com.shengde.e3mall.entity.TbItemCat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类管理
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatDao tbItemCatDao;

    @Override
    public List<EasyUITreeNode> getItemCatlist(long parentId) {


        //执行查询
        List<TbItemCat> list = tbItemCatDao.queryAll1(new TbItemCat());
        //创建返回结果List
        ArrayList<EasyUITreeNode> resultList = new ArrayList<>();
        //把列表转换成EasyUITreeNode列表
        for (TbItemCat tbItemCat : list) {

            EasyUITreeNode node = new EasyUITreeNode();
            //设置属性
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setText(tbItemCat.getIsParent()?"closed":"open");

            //添加到结果列表
            resultList.add(node);
        }
        //返回结果
        return resultList;
    }
}
