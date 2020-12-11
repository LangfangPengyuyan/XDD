package com.shengde.e3mall.service.impl;
import com.shengde.e3mall.dao.TbOrderItemDao;
import com.shengde.e3mall.entity.*;
import com.shengde.e3mall.service.TbOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (TbOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2020-12-07 11:46:13
 */
@Service("tbOrderItemService")
public class TbOrderItemServiceImpl implements TbOrderItemService {
    @Resource
    private TbOrderItemDao tbOrderItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public TbOrderItem queryById(int id) {
        return this.tbOrderItemDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrderItem> queryAllByLimit(int offset, int limit) {
        return this.tbOrderItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderItem insert(TbOrderItem tbOrderItem) {
        this.tbOrderItemDao.insert(tbOrderItem);
        return tbOrderItem;
    }

    /**
     * 修改数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderItem update(TbOrderItem tbOrderItem) {
        this.tbOrderItemDao.update(tbOrderItem);
        //return this.queryById();
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.tbOrderItemDao.deleteById() > 0;
    }
}