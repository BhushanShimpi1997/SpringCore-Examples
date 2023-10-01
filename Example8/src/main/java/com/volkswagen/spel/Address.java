package com.volkswagen.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${address.city}")
    private String city;

    @Value("${address.pincode}")
    private long pincode;

    @Value("${address.email}")
    private String email;

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
