package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "student_has_tutorial_question" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentHasTutorialQuestion {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "answers" , nullable = false )
    private String answers;

    @OneToOne
    @JoinColumn( name = "student_id" )
    private User student;

    @OneToOne
    @JoinColumn( name = "tutorial_question_id" )
    private TutorialQuestion tutorialQuestion;

    @Transient
    private List<Integer> answerIds;

}
