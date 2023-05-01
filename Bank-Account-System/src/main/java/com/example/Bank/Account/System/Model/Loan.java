package com.example.Bank.Account.System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity

public class Loan extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   double interest;
   double amount;

    @ManyToOne
    @JoinColumn(name = "Customer_id", referencedColumnName = "id")
    Customer customer;
}
