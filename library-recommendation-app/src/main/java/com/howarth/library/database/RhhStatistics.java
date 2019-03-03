package com.howarth.library.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Timestamp;

import javax.persistence.Column;


import org.hibernate.annotations.*;

@Entity
public class RhhStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @CreationTimestamp
    @Column
    private Timestamp createdDate;

    private int numberOfPeople;

    public RhhStatistics(){}

    public RhhStatistics(int numberOfPeople){
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public Timestamp getCreatedDate() {
      return createdDate;
    }

    public long getId() {
        return id;
    }
}
