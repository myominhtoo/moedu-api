package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table( name = "batch_schedules" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchSchedule {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "created_date" , nullable = false )
    private LocalDateTime createdDate;

    @Column( name = "last_update_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

    @OneToOne
    @JoinColumn( name = "batch_id" )
    private Batch batch;

    @OneToMany
    @JoinColumn( name = "batch_schedule_id" )
    private List<Schedule> schedules;

}
