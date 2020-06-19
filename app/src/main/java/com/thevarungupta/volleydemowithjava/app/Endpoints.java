package com.thevarungupta.volleydemowithjava.app;

public class Endpoints {

    private static final String URL_PRODUCTS = "products";

    public static String getProducts(){
        return Config.BASE_URL + URL_PRODUCTS;
    }

}
