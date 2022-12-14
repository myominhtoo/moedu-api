package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table( name = "student_has_tutorial" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentHasTutorial {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "got_marks" , nullable = true )
    private double gotMarks;

    @Column( name = "tutorial_status" , nullable = true )
    private boolean tutorialStatus;

    @Column( name = "tutorial_grade" , nullable = true )
    private char tutorialGrade;

    @Column( name = "saved_date" , nullable = false )
    private LocalDateTime savedDate;

    @Column( name = "last_updated_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

    @OneToMany
    @JoinColumn( name = "student_has_tutorial_id" )
    private List<StudentHasTutorialQuestion> studentHasTutorialQuestions;

}
