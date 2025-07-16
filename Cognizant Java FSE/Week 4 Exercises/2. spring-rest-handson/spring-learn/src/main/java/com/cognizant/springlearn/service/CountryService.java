package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }
    // inside the service
    public Country getCountry(String code) throws CountryNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> list = (List<Country>) context.getBean("countryList");

        return list.stream()
                   .filter(country -> country.getCode().equalsIgnoreCase(code))
                   .findFirst()
                   .orElseThrow(CountryNotFoundException::new); 
    }


}
