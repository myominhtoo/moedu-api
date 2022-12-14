package com.lio.moeduhouseapi.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table( name = "batches" )
public class Batch {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "batch_number" , nullable = false )
    private Integer batchNumber;

    /*
     * depend on this , will decide anymore student can register or not minmayloelite
     */
    @Column( name = "max_student" , nullable = true )
    private Integer maxStudent;

    @Column( name = "description" , nullable = true )
    private String description;

    /*
     * depend on this , fees will be decreased in UI
     */
    @Column( name = "discount" , nullable = true )
    private Integer discount;

    @Column( name = "start_date" , nullable = false )
    private LocalDate startDate;

    @Column( name = "end_date" , nullable = false )
    private LocalDate endDate;

    /*
     * one batch can contain more than one subject
     * also one subject can have in more than one batch
     */
    @ManyToMany
    @JoinTable(
            name = "batch_has_subject",
            joinColumns = @JoinColumn( name = "batch_id" ),
            inverseJoinColumns = @JoinColumn( name = "subject_id" )
    )
    private List<Subject> subjects;

}
