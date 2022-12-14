package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table( name = "schedules" )
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "about" , nullable = true )
    private String about;

    @Column( name = "date" , nullable = false )
    private LocalDate date;

    @Column( name = "time_from" , nullable = false )
    private LocalDateTime timeFrom;

    @Column( name = "time_to" , nullable = false )
    private LocalDateTime timeTo;

}
