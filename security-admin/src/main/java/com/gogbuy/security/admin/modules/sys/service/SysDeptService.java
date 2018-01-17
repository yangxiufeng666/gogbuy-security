package com.gogbuy.security.admin.modules.sys.service;

import com.gogbuy.security.admin.modules.sys.entity.SysDept;

/**
 * Created by Mr.Yangxiufeng on 2018/1/17.
 * Time:9:36
 * ProjectName:gogbuy-security
 */
public interface SysDeptService {
    int deleteById(String id);

    int save(SysDept record);

    SysDept selectById(String id);

    int updateByIdSelective(SysDept record);

    int updateById(SysDept record);
}
