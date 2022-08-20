package com.car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String brandName;
    @Column
    private long price;

    public Car() {

    }

    public Car(long id, String name, String brandName, long price) {
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.price = price;
    }
}
