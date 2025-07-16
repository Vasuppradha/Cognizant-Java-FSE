package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryCodeController {

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws Exception {
        System.out.println("START - getCountry()");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countryList", List.class);

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                System.out.println("END - getCountry()");
                return country;
            }
        }

        throw new Exception("Country not found");
    }
}
