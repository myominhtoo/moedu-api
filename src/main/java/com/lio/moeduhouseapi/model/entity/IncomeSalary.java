package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table( name = "income_salary" )
@AllArgsConstructor
@NoArgsConstructor
public class IncomeSalary {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "total_fees" , nullable = false )
    private double totalFees;

    @Column( name = "received_fees" , nullable = false )
    private double receivedFees;

    @OneToOne
    @JoinColumn( name = "batch_id" )
    private Batch batch;

}
