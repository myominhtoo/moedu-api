package com.lio.moeduhouseapi.model.entity;

import javax.persistence.*;

@Entity
@Table( name = "teachers_teach_batches" )
public class TeachersTeachBatches {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @OneToOne
    @JoinColumn( name = "teacher_id" )
    private User teacher;

    @OneToOne
    @JoinColumn( name = "batch_id" )
    private Batch batch;

}
