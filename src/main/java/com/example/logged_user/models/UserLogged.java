package com.example.logged_user.models;

import javax.persistence.*;

@Entity
public class UserLogged {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    private String nameCEO;

    private String email;

    private String address;

    private String password;


    private String phone;

    private String clientId;

    public UserLogged(){
    }
    public UserLogged(long id, String name, String nameCEO, String email, String address, String password, String phone, String clientId) {
        this.id = id;
        this.name = name;
        this.nameCEO = nameCEO;
        this.email = email;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.clientId = clientId;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCEO() {
        return nameCEO;
    }

    public void setNameCEO(String nameCEO) {
        this.nameCEO = nameCEO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
