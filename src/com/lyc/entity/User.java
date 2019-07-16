package com.lyc.entity;

public class User {
    //`id``username``password``age``sex``hobbys``phone``email``addrs`
    private int id;
    private String username;
    private String password;
    private int age;
    private String sex;
    private String hobbys;
    private String phone;
    private String email;
    private String addrs;

    public User() {
    }

    public User(int id, String username, String password, int age, String sex, String hobbys, String phone, String email, String addrs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.hobbys = hobbys;
        this.phone = phone;
        this.email = email;
        this.addrs = addrs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobbys() {
        return hobbys;
    }

    public void setHobbys(String hobbys) {
        this.hobbys = hobbys;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", hobbys='" + hobbys + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", addrs='" + addrs + '\'' +
                '}';
    }
}
