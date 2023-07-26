package com.finances.pocketsaverapi.entity;

import com.finances.pocketsaverapi.entity.enums.Bank;
import jakarta.persistence.*;

import java.sql.Date;
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(length = 100)
    public String ownerName;
    public Double limitCard;
    public Date expirationDate;
    @Enumerated(EnumType.STRING)
    public Bank bank;
}
