package com.shengde.e3mall.service.impl;
import com.shengde.e3mall.dao.TbOrderDao;
import com.shengde.e3mall.entity.*;
import com.shengde.e3mall.service.TbOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



/**
 * (TbOrder)表服务实现类
 *
 * @author makejava
 * @since 2020-12-07 11:46:11
 */
@Service("tbOrderService")
public class TbOrderServiceImpl implements TbOrderService {
    @Resource
    private TbOrderDao tbOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public TbOrder queryById(int id) {

        return this.tbOrderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrder> queryAllByLimit(int offset, int limit) {
        return this.tbOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrder insert(TbOrder tbOrder) {
        this.tbOrderDao.insert(tbOrder);
        return tbOrder;
    }

    /**
     * 修改数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrder update(TbOrder tbOrder) {
        this.tbOrderDao.update(tbOrder);
        //return this.queryById(id);
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {

        return this.tbOrderDao.deleteById() > 0;
    }
}