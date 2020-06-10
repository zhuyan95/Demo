package com.zhu.dao;

import com.zhu.entity.po.Demo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Demo)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-10 21:22:19
 */
public interface DemoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Demo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Demo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param demo 实例对象
     * @return 对象列表
     */
    List<Demo> queryAll(Demo demo);

    /**
     * 新增数据
     *
     * @param demo 实例对象
     * @return 影响行数
     */
    int insert(Demo demo);

    /**
     * 修改数据
     *
     * @param demo 实例对象
     * @return 影响行数
     */
    int update(Demo demo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}