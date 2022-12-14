package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "attendances" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "signed_date_time" )
    private LocalDateTime signedDateTime;

    @Column( name = "sign" , nullable = false )
    private String sign;

    @ManyToOne
    @JoinColumn( name = "batch_schedule_id" )
    private BatchSchedule batchSchedule;

}
