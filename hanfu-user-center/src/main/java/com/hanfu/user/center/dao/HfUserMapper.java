package com.hanfu.user.center.dao;

import com.hanfu.user.center.model.HfUser;
import com.hanfu.user.center.model.HfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    long countByExample(HfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int deleteByExample(HfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int insert(HfUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int insertSelective(HfUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    List<HfUser> selectByExample(HfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    HfUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfUser record, @Param("example") HfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int updateByExample(@Param("record") HfUser record, @Param("example") HfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int updateByPrimaryKeySelective(HfUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user
     *
     * @mbg.generated Tue Mar 17 14:56:16 CST 2020
     */
    int updateByPrimaryKey(HfUser record);
}