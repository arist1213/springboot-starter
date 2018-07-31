package com.example.demo.services;

import com.example.demo.model.entity.City;

import java.util.List;

/**
 * created by yanming on 2018/7/31
 */
public interface CityServices {
    City getCityById(Integer id);
    City getCityByName(String name);
    List<City> getCityListByCode(String code);
    List<City> getCityListByDistrict(String district);
    List<City> getCityByPopulation(Integer from, Integer to);
}
