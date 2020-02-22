package com.yxj.pojo;


import java.util.Objects;

/**
 * @Auther: yangxiaojie
 * @Date: 2020/2/22
 * @version: 1.0
 */
public class User {
    private int uid;
    private String uname;
    private String fav;
    private Address address;

    public User() {
    }

    public User(int uid, String uname, String fav, Address address) {
        this.uid = uid;
        this.uname = uname;
        this.fav = fav;
        this.address = address;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uid == user.uid &&
                Objects.equals(uname, user.uname) &&
                Objects.equals(fav, user.fav) &&
                Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, fav, address);
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", fav='" + fav + '\'' +
                ", address=" + address +
                '}';
    }
}
