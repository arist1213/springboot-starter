package com.example.demo.model.entity;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.CountryCode
     *
     * @mbggenerated
     */
    private String countrycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.District
     *
     * @mbggenerated
     */
    private String district;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Population
     *
     * @mbggenerated
     */
    private Integer population;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.ID
     *
     * @return the value of city.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.ID
     *
     * @param id the value for city.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Name
     *
     * @return the value of city.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Name
     *
     * @param name the value for city.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.CountryCode
     *
     * @return the value of city.CountryCode
     *
     * @mbggenerated
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.CountryCode
     *
     * @param countrycode the value for city.CountryCode
     *
     * @mbggenerated
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.District
     *
     * @return the value of city.District
     *
     * @mbggenerated
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.District
     *
     * @param district the value for city.District
     *
     * @mbggenerated
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Population
     *
     * @return the value of city.Population
     *
     * @mbggenerated
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Population
     *
     * @param population the value for city.Population
     *
     * @mbggenerated
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }
}