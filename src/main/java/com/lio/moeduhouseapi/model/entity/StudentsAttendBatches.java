package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "students_attend_batches" )
@AllArgsConstructor
@NoArgsConstructor
public class StudentsAttendBatches {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @OneToOne
    @JoinColumn( name = "student_id" )
    private User student;

    @OneToOne
    @JoinColumn( name = "batch_id" )
    private Batch batch;

    @Column( name = "has_confirmed_registration" , nullable = false )
    private boolean hasConfirmedRegistration;

    @Column( name = "has_paid_full_fees" , nullable = false )
    private boolean hasPaidFullFees;

    @Column( name = "remain_fees_percent" , nullable = false )
    private double remainFeesPercent;

    @Column( name = "registered_date" , nullable = false )
    private LocalDateTime registeredDate;

    @Column( name = "last_updated_date" , nullable = true )
    private LocalDateTime lastUpdatedDate;

}
