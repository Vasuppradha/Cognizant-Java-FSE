package com.cognizant.springlearn.model;

public class Country {
    private String code;
    private String name;

    public Country() {
        // Default constructor required for Spring
    }

    public Country(String code, String name) {
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
