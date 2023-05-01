package com.example.Bank.Account.System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transaction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Setter
@Getter
public class Account extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "number", nullable = false)
    Integer accountNumber;

    @Column(name = "balance")
    Double balance;

    @ManyToOne
    @JoinColumn(name = "Customer_id", referencedColumnName = "id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "Transaction_id", referencedColumnName = "id")
    Transcation transcation;





}
