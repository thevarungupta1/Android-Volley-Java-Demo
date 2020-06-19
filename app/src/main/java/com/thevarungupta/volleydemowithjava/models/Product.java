package com.thevarungupta.volleydemowithjava.models;

import com.google.gson.annotations.SerializedName;


public class Product {

    private float quantity;
    private String description;
    private boolean status;
    private float position;
    private String created;
    private String _id;
    private float catId;
    private float subId;
    private String productName;
    private String image;
    private String unit;
    private float price;
    private float mrp;
    private float __v;

    Product(){}

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public float getCatId() {
        return catId;
    }

    public void setCatId(float catId) {
        this.catId = catId;
    }

    public float getSubId() {
        return subId;
    }

    public void setSubId(float subId) {
        this.subId = subId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getMrp() {
        return mrp;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
    }

    public float get__v() {
        return __v;
    }

    public void set__v(float __v) {
        this.__v = __v;
    }
}
