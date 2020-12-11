package com.shengde.e3mall.service.impl;
import com.shengde.e3mall.dao.TbItemDescDao;
import com.shengde.e3mall.entity.*;

import com.shengde.e3mall.service.TbItemDescService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (TbItemDesc)表服务实现类
 *
 * @author makejava
 * @since 2020-12-07 11:46:07
 */
@Service("tbItemDescService")
public class TbItemDescServiceImpl implements TbItemDescService {
    @Resource
    private TbItemDescDao tbItemDescDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemId 主键
     * @return 实例对象
     */
    @Override
    public TbItemDesc queryById(Integer itemId) {
        return this.tbItemDescDao.queryById(itemId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbItemDesc> queryAllByLimit(int offset, int limit) {
        return this.tbItemDescDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbItemDesc 实例对象
     * @return 实例对象
     */
    @Override
    public TbItemDesc insert(TbItemDesc tbItemDesc) {
        this.tbItemDescDao.insert(tbItemDesc);
        return tbItemDesc;
    }

    /**
     * 修改数据
     *
     * @param tbItemDesc 实例对象
     * @return 实例对象
     */
    @Override
    public TbItemDesc update(TbItemDesc tbItemDesc) {
        this.tbItemDescDao.update(tbItemDesc);
        return this.queryById(tbItemDesc.getItemId());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemId) {
        return this.tbItemDescDao.deleteById(itemId) > 0;
    }
}