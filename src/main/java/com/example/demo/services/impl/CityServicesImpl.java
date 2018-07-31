package com.example.demo.services.impl;

import com.example.demo.model.dao.CityMapper;
import com.example.demo.model.entity.City;
import com.example.demo.model.entity.CityExample;
import com.example.demo.services.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by yanming on 2018/7/31
 */

@Service
public class CityServicesImpl implements CityServices {
    @Autowired
    CityMapper cityMapper;

    @Override
    public City getCityById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public City getCityByName(String name) {
        CityExample e = new CityExample();
        e.createCriteria().andNameEqualTo(name);
        return cityMapper.selectByExample(e).get(0);
    }

    @Override
    public List<City> getCityListByCode(String code) {
        CityExample e = new CityExample();
        e.createCriteria().andCountrycodeEqualTo(code);
        return cityMapper.selectByExample(e);
    }

    @Override
    public List<City> getCityListByDistrict(String district) {
        CityExample e = new CityExample();
        e.createCriteria().andDistrictEqualTo(district);
        return cityMapper.selectByExample(e);
    }

    @Override
    public List<City> getCityByPopulation(Integer from, Integer to) {
        CityExample e = new CityExample();
        e.createCriteria().andPopulationBetween(from, to);
        return cityMapper.selectByExample(e);
    }
}
