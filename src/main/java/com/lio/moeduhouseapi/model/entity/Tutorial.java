package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "tutorials" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "tutorial_name" , nullable = false )
    private String tutorialName;

    @Column( name = "description" , nullable = false )
    private String description;

    @Column( name = "allowed_time" , nullable = false )
    private double allowedTime;

    @Column( name = "is_able_only_limited_time" , nullable = false )
    private boolean isAbleOnlyLimitedTime;

    @Column( name = "time_from" , nullable = false )
    private LocalDateTime timeFrom;

    @Column( name = "time_to" , nullable = false )
    private LocalDateTime timeTo;

    @Transient
    private MultipartFile tutorialFile;

    @Column( name = "tutorial_file_uri" , nullable = false )
    private String tutorialFileUri;

    @OneToOne
    @JoinColumn( name = "created_user_id" )
    private User createdUser;

}
