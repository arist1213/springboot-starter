package com.example.demo.model.dao;

import com.example.demo.model.entity.Countrylanguage;
import com.example.demo.model.entity.CountrylanguageExample;
import com.example.demo.model.entity.CountrylanguageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountrylanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int countByExample(CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int deleteByExample(CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(CountrylanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int insert(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int insertSelective(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    List<Countrylanguage> selectByExample(CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    Countrylanguage selectByPrimaryKey(CountrylanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Countrylanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Countrylanguage record);
}