package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet init");
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public pepsi() {

    }

    @Override
    public String toString() {
        return "pepsi{" +
                "price=" + price +
                '}';
    }
}
