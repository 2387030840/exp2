package com.example.springbootexperiment02.exp2.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String detail;

    @ManyToOne
    private User user;

    @Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP",insertable = false,updatable = false)
    private LocalDateTime insertTime;

    public Address(String detail){
        this.detail = detail;
    }

    public Address(){

    }

}
