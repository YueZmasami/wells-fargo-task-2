package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolioId")
    private Portfolio portfolio;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private Date purchasedate;

    @Column
    private double purchasePrice;

    @Column
    private int quantity;

   protected Security() {
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
