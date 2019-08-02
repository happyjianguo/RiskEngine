package com.engine.dao;

import com.engine.model.ModelNextLineList;
import com.engine.model.ModelNextLineListExample;
import com.engine.model.ModelNextLineListWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelNextLineListMapper {
    /**
     *
     * @mbggenerated 2019-08-02
     */
    int countByExample(ModelNextLineListExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByExample(ModelNextLineListExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insert(ModelNextLineListWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int insertSelective(ModelNextLineListWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModelNextLineListWithBLOBs> selectByExampleWithBLOBs(ModelNextLineListExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    List<ModelNextLineList> selectByExample(ModelNextLineListExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    ModelNextLineListWithBLOBs selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleSelective(@Param("record") ModelNextLineListWithBLOBs record, @Param("example") ModelNextLineListExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExampleWithBLOBs(@Param("record") ModelNextLineListWithBLOBs record, @Param("example") ModelNextLineListExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByExample(@Param("record") ModelNextLineList record, @Param("example") ModelNextLineListExample example);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeySelective(ModelNextLineListWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKeyWithBLOBs(ModelNextLineListWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-02
     */
    int updateByPrimaryKey(ModelNextLineList record);
}