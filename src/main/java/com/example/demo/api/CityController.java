package com.example.demo.api;

import com.example.demo.services.CityServices;
import com.example.demo.utils.JsonApiError;
import com.example.demo.utils.JsonApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * created by yanming on 2018/7/31
 */

@RequestMapping("/city")
@Controller
public class CityController extends BaseController {

    @Autowired
    CityServices cityServices;

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    private JsonApiResult getCityById(@PathVariable Integer id) {
        return jsonSuccess(cityServices.getCityById(id));
    }

    @RequestMapping(value = "/name/{cityName}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    private JsonApiResult getCityByName(@PathVariable String cityName) {
        return jsonSuccess(cityServices.getCityByName(cityName));
    }

    @RequestMapping(value = "/code/{countryCode}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    private JsonApiResult getCitiesByCountryCode(@PathVariable String countryCode) {
        return jsonSuccess(cityServices.getCityListByCode(countryCode));
    }

    /**
     * @return String
     */
    @RequestMapping(value = "/test-error-api1", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    private JsonApiResult testJsonApiResult() {
        return jsonFail(JsonApiError.SYSTEM_ERROR);
    }

    /**
     * @return String
     */
    @RequestMapping(value = "/test-error-api2", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    private JsonApiResult testJsonApiResult2() {
        return jsonFail(1, "Oh my god!!!");
    }

}
