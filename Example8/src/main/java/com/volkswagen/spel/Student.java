package com.volkswagen.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("#{'${student.name}'.toUpperCase()}")
    private String name;

    @Value("#{address.city.length() > 5 ? 'Dhule': 'Pune'}")
    private String city;

    @Value("#{address.pincode}")
    private long pincode;

    @Value("#{2 * T(java.lang.Math).PI * circle.radious}")
    private double area;

    @Value("#{ '${studentadd.email}' matches '[a-zA-Z0-9._%+-]+@[a-zA-Z-9.-]+\\.com'}")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", area=" + area +
                ", email='" + email + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
