package com.cxf.model;

public class AgePhoneResult extends SearchResult {

	private static final long serialVersionUID = 1L;
	private String age;
    private String phone;

    public AgePhoneResult(){}

    public AgePhoneResult(String age, String phone) {
        this.phone = phone;
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
