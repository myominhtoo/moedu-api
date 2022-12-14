package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "resource_comments" )
@AllArgsConstructor
@NoArgsConstructor
public class ResourceComment {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "content" , nullable = false )
    private String content;

    @Column( name = "commented_date" , nullable = false )
    private LocalDateTime commentedDate;

    @Column( name = "last_updated_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

    @OneToOne
    @JoinColumn( name = "commented_user_id" , nullable = false )
    private User commentedUser;

    @OneToOne
    @JoinColumn( name = "parent_comment_id" , nullable = true )
    private ResourceComment parentComment;

    @ManyToOne
    @JoinColumn( name =  "resource_id" )
    private Resource resource;

}
