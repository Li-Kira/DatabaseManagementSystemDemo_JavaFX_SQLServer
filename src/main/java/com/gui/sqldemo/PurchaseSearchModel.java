package com.gui.sqldemo;

public class PurchaseSearchModel {

    String title,purchase_order;
    int purchase_price,purchase_out;

    public PurchaseSearchModel(String title,int purchase_price,String purchase_order,int purchase_out){
        this.title = title;
        this.purchase_price = purchase_price;
        this.purchase_order = purchase_order;
        this.purchase_out = purchase_out;
    }

    public String getTitle() {
        return title;
    }

    public String getPurchase_order() {
        return purchase_order;
    }

    public int getPurchase_price() {
        return purchase_price;
    }

    public int getPurchase_out() {
        return purchase_out;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPurchase_order(String purchase_order) {
        this.purchase_order = purchase_order;
    }

    public void setPurchase_price(int purchase_price) {
        this.purchase_price = purchase_price;
    }

    public void setPurchase_out(int purchase_out) {
        this.purchase_out = purchase_out;
    }
}
