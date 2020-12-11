package com.shengde.e3mall.service.impl;
import com.shengde.e3mall.dao.TbOrderShippingDao;
import com.shengde.e3mall.entity.*;

import com.shengde.e3mall.service.TbOrderShippingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (TbOrderShipping)表服务实现类
 *
 * @author makejava
 * @since 2020-12-07 11:46:14
 */
@Service("tbOrderShippingService")
public class TbOrderShippingServiceImpl implements TbOrderShippingService {
    @Resource
    private TbOrderShippingDao tbOrderShippingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public TbOrderShipping queryById(int id) {
        return this.tbOrderShippingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrderShipping> queryAllByLimit(int offset, int limit) {
        return this.tbOrderShippingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrderShipping 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderShipping insert(TbOrderShipping tbOrderShipping) {
        this.tbOrderShippingDao.insert(tbOrderShipping);
        return tbOrderShipping;
    }

    /**
     * 修改数据
     *
     * @param tbOrderShipping 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderShipping update(TbOrderShipping tbOrderShipping) {
        this.tbOrderShippingDao.update(tbOrderShipping);
        //return this.queryById(tbOrderShipping.get());
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
        return this.tbOrderShippingDao.deleteById() > 0;
    }
}