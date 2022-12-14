package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table( name = "courses" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private String id;

    @Column( name = "course_name" , nullable = false )
    private String courseName;

    @Column( name = "description" , nullable = true )
    private String description;

    @Column( name = "duration" , nullable = false )
    private String duration;

    @Column( name = "fees" , nullable = false )
    private double fees;

    @Column( name = "course_img_uri" , nullable = true )
    private String courseImgUri;

    @Transient
    private MultipartFile courseImg;

    /*
     * one course can have many batches
     */
    @OneToMany
    @JoinColumn( name = "batch_id" )
    private List<Batch> batches;

}
