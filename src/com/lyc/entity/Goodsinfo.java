package com.lyc.entity;

public class Goodsinfo {
    //`id``goodsInfoName``goodsInfoPic``goodsInfoPrice``goodsInfoDescription``goodsStock`
    private int id;
    private String goodsInfoName;
    private String goodsInfoPic;
    private double goodsInfoPrice;
    private String goodsInfoDescription;
    private int goodsStock;

    public Goodsinfo() {
    }

    public Goodsinfo(int id, String goodsInfoName, String goodsInfoPic, double goodsInfoPrice, String goodsInfoDescription, int goodsStock) {
        this.id = id;
        this.goodsInfoName = goodsInfoName;
        this.goodsInfoPic = goodsInfoPic;
        this.goodsInfoPrice = goodsInfoPrice;
        this.goodsInfoDescription = goodsInfoDescription;
        this.goodsStock = goodsStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsInfoName() {
        return goodsInfoName;
    }

    public void setGoodsInfoName(String goodsInfoName) {
        this.goodsInfoName = goodsInfoName;
    }

    public String getGoodsInfoPic() {
        return goodsInfoPic;
    }

    public void setGoodsInfoPic(String goodsInfoPic) {
        this.goodsInfoPic = goodsInfoPic;
    }

    public double getGoodsInfoPrice() {
        return goodsInfoPrice;
    }

    public void setGoodsInfoPrice(double goodsInfoPrice) {
        this.goodsInfoPrice = goodsInfoPrice;
    }

    public String getGoodsInfoDescription() {
        return goodsInfoDescription;
    }

    public void setGoodsInfoDescription(String goodsInfoDescription) {
        this.goodsInfoDescription = goodsInfoDescription;
    }

    public int getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(int goodsStock) {
        this.goodsStock = goodsStock;
    }

    @Override
    public String toString() {
        return "id=" + id + ", goodsInfoName=" + goodsInfoName
                + ", goodsInfoPic=" + goodsInfoPic + ", goodsInfoPrice="
                + goodsInfoPrice + ", goodsInfoDescription="
                + goodsInfoDescription + ", goodsStock=" + goodsStock ;
    }
}
