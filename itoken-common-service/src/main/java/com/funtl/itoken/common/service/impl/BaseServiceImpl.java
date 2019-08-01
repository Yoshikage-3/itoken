package com.funtl.itoken.common.service.impl;

import com.funtl.itoken.common.domain.BaseDomain;
import com.funtl.itoken.common.service.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.MyMapper;

/**
 * @author Administrator
 */
@Service
@Transactional(readOnly = true)
public class BaseServiceImpl<T extends BaseDomain,D extends MyMapper<T>> implements BaseService<T> {

    @Autowired
    private D dao;

    @Override
    @Transactional(readOnly = false)
    public int insert(T t,String createBy) {
        t.setCreateBy(createBy);
        return dao.insert(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int delete(T t) {
        return dao.insert(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int update(T t,String updateBy) {
        t.setUpdateBy(updateBy);
        return dao.updateByPrimaryKey(t);
    }

    @Override
    public int count(T t) {
        return dao.selectCount(t);
    }

    @Override
    public T selectOne(T t) {
        return dao.selectOne(t);
    }

    @Override
    public PageInfo<T> page(int pageNum, int pageSize,T t) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(dao.select(t));
    }
}
