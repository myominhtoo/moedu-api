package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table( name = "subjects" )
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "subject_name" , nullable = false )
    private String subjectName;

    @Column( name = "detail" , nullable = true )
    private String detail;

    @Column( name = "reference_books" , nullable = true )
    private String referenceBooks;

    @Column( name = "started_date" , nullable = false )
    private String startedDate;

    @Column( name = "last_updated_date" , nullable = false )
    private String lastUpdatedDate;

}
