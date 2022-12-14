package com.lio.moeduhouseapi.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table( name = "tutorial_questions" )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorialQuestion {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "question_content" , nullable = false )
    private String questionContent;

    @Column( name = "total_mark" , nullable = false )
    private double totalMark;

    @Column( name = "can_upload_file" , nullable = false )
    private boolean  canUploadFile;

    @Column( name = "created_date" , nullable = false )
    private LocalDateTime createdDate;

    @Column( name = "last_updated_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

    @OneToMany
    @JoinColumn( name = "tutorial_question_id" )
    private List<TutorialQuestionAnswer> answers;

}
