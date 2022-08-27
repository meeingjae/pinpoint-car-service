package com.car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "E_MEMBER")
public class CarMember {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ")
    @SequenceGenerator(name = "MEMBER_SEQ", sequenceName = "MEMBER_SEQ", allocationSize = 1)
    @Column(name = "MEMBER_UID")
    private long memberUid;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "PASSWORD")
    private String password;

    public CarMember(long id, String userName, String password) {
        this.memberUid = id;
        this.userName = userName;
        this.password = password;
    }

    public CarMember(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public CarMember() {

    }

    public long getMemberUid() {
        return memberUid;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
