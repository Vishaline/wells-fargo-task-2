package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToMany
    private Client client;

    @Temporal(TemporalType.DATE);
    private Date createDate;

    protected Portfolio() {

    }

    public Client(Date createDate) {
        this.createDate = firstName;


    }

    public Client getClient(){return client;}

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}

}
