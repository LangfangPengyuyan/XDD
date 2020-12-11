package com.shengde.e3mall.service.impl;
import com.shengde.e3mall.dao.TbItemParamItemDao;
import com.shengde.e3mall.entity.*;
import com.shengde.e3mall.service.TbItemParamItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (TbItemParamItem)表服务实现类
 *
 * @author makejava
 * @since 2020-12-07 11:46:10
 */
@Service("tbItemParamItemService")
public class TbItemParamItemServiceImpl implements TbItemParamItemService {
    @Resource
    private TbItemParamItemDao tbItemParamItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbItemParamItem queryById(Integer id) {
        return this.tbItemParamItemDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbItemParamItem> queryAllByLimit(int offset, int limit) {
        return this.tbItemParamItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbItemParamItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItemParamItem insert(TbItemParamItem tbItemParamItem) {
        this.tbItemParamItemDao.insert(tbItemParamItem);
        return tbItemParamItem;
    }

    /**
     * 修改数据
     *
     * @param tbItemParamItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItemParamItem update(TbItemParamItem tbItemParamItem) {
        this.tbItemParamItemDao.update(tbItemParamItem);
        return this.queryById(tbItemParamItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbItemParamItemDao.deleteById(id) > 0;
    }
}