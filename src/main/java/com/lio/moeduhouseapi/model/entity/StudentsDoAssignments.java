package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "students_do_assignments" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsDoAssignments {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "uploaded_date" , nullable = false )
    private LocalDateTime uploadedDate;

    @OneToOne
    @JoinColumn( name = "student_id" , nullable = false )
    private User student;

    @OneToOne
    @JoinColumn( name = "assignment_id" , nullable = false )
    private Assignment assignment;

}
