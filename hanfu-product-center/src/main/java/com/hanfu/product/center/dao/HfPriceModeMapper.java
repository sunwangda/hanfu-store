package com.hanfu.product.center.dao;

import com.hanfu.product.center.model.HfPriceMode;
import com.hanfu.product.center.model.HfPriceModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HfPriceModeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    long countByExample(HfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int deleteByExample(HfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int insert(HfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int insertSelective(HfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    List<HfPriceMode> selectByExample(HfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    HfPriceMode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int updateByExampleSelective(@Param("record") HfPriceMode record, @Param("example") HfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int updateByExample(@Param("record") HfPriceMode record, @Param("example") HfPriceModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int updateByPrimaryKeySelective(HfPriceMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price_mode
     *
     * @mbg.generated Sun Mar 22 17:13:44 CST 2020
     */
    int updateByPrimaryKey(HfPriceMode record);
}