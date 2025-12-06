package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }
    public Portfolio(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getClient(){ return client.getClientId();}
    public Long getPortfolioId() {
        return portfolioId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
