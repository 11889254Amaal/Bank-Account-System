package com.example.Bank.Account.System.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter

public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;

    @Column(name = "customerName")
     String customerName;


    @Column(name = "customerEmail")
     String customerEmail;

    @Column(name = "customerPhoneNumber")
     String customerPhoneNumber;



    @Column(name = "customerGender")
     String customerGender;





}
