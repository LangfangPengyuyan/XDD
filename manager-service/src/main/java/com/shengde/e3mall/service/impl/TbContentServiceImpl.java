package com.shengde.e3mall.service.impl;
import com.shengde.e3mall.entity.*;
import com.shengde.e3mall.dao.TbContentDao;
import com.shengde.e3mall.service.TbContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



/**
 * (TbContent)表服务实现类
 *
 * @author makejava
 * @since 2020-12-07 11:45:56
 */
@Service("tbContentService")
public class TbContentServiceImpl implements TbContentService {
    @Resource
    private TbContentDao tbContentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbContent queryById(Integer id) {
        return this.tbContentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbContent> queryAllByLimit(int offset, int limit) {
        return this.tbContentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbContent 实例对象
     * @return 实例对象
     */
    @Override
    public TbContent insert(TbContent tbContent) {
        this.tbContentDao.insert(tbContent);
        return tbContent;
    }

    /**
     * 修改数据
     *
     * @param tbContent 实例对象
     * @return 实例对象
     */
    @Override
    public TbContent update(TbContent tbContent) {
        this.tbContentDao.update(tbContent);
        return this.queryById(tbContent.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbContentDao.deleteById(id) > 0;
    }
}