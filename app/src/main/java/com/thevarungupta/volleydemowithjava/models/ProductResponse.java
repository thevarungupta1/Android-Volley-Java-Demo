package com.thevarungupta.volleydemowithjava.models;

import java.util.List;

public class ProductResponse {

    public boolean error;
    public int count;
    public List<Product> data;

    public ProductResponse(){}

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }
}
