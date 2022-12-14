package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "tutorial_question_answers" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TutorialQuestionAnswer {

    @Id
    @GeneratedValue( strategy =  GenerationType.AUTO )
    private Integer id;

    @Column( name = "answer_content" , nullable = false )
    private String answerContent;

    @Column( name = "is_right" , nullable = false )
    private boolean isRight;

    @Column( name = "created_date" , nullable = false )
    private LocalDateTime createdDate;

    @Column( name = "last_updated_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

}
