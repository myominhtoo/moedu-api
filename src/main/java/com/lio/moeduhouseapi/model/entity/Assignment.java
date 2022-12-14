package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "assignments" )
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "assignment_name" , nullable = false )
    private String assignmentName;

    @Column( name = "description" , nullable = true )
    private String description;

    @Transient
    private MultipartFile assignmentFile;

    @Column( name = "assignment_file_uri" )
    private String assignmentFileUri;

    @OneToOne
    @JoinColumn( name = "created_user_id" , nullable = false )
    private User createdUser;

    @OneToOne
    @JoinColumn( name = "batch_id" )
    private Batch batch;

    @Column( name = "start_date" , nullable = false )
    private LocalDateTime startDate;

    @Column( name = "due_date" , nullable = false )
    private LocalDateTime dueDate;

}
