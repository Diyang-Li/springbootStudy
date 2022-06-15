package com.itheima.domain;

/**
 * @author Diyang Li
 * @create 2022-06-14 10:18 PM
 */
public class Fruit {
    public int fid;
    public String fname;
    public int price;
    public int fcount;
    public String remark;

    public Fruit(int fid, String fname, int price, int fcount, String remark) {
        this.fid = fid;
        this.fname = fname;
        this.price = price;
        this.fcount = fcount;
        this.remark = remark;
    }

    public int getFid() {
        return fid;
    }

    public String getFname() {
        return fname;
    }

    public int getPrice() {
        return price;
    }

    public int getFcount() {
        return fcount;
    }

    public String getRemark() {
        return remark;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", price=" + price +
                ", fcount=" + fcount +
                ", remark='" + remark + '\'' +
                '}';
    }
}
