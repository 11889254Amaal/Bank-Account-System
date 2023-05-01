package com.example.Bank.Account.System.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter

public class Transcation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "date")
    private LocalDate transactionDate;

    @Column(name = "comment")
    private String comment;

    @Column(name = "amount")
    private double amount;







}
