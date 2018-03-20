package com.bishe.pojo;

public class Item {
    private Integer id;

    private Integer typeid;

    private String name;

    private String mixtureJson;

    private Integer discount;

    private Float price;

    private Integer sale;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMixtureJson() {
        return mixtureJson;
    }

    public void setMixtureJson(String mixtureJson) {
        this.mixtureJson = mixtureJson == null ? null : mixtureJson.trim();
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }
}