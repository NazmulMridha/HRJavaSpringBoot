package com.example.demo2.model;

import javax.persistence.*;

@Entity
@Table (name="all_division_computer_operators")
public class ComputerOperator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "SL")
    private Integer sl;

    @Column (name = "Name_bn")
    private String name_bn;

    @Column (name = "Name")
    private String 	name;

    @Column (name = "Posting_bn")
    private String posting_bn;

    @Column (name = "Posting")
    private String posting;

    @Column (name = "Roll_no")
    private Integer roll_no;

    @Column (name = "Mobile")
    private Integer mobile;

    @Column (name = "Email")
    private String email;

    @Column (name = "Religion")
    private String religion;

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public String getName_bn() {
        return name_bn;
    }

    public void setName_bn(String name_bn) {
        this.name_bn = name_bn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosting_bn() {
        return posting_bn;
    }

    public void setPosting_bn(String posting_bn) {
        this.posting_bn = posting_bn;
    }

    public String getPosting() {
        return posting;
    }

    public void setPosting(String posting) {
        this.posting = posting;
    }

    public Integer getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Integer roll_no) {
        this.roll_no = roll_no;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
}
