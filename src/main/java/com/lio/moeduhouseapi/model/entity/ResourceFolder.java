package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table( name = "resource_folders" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceFolder {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "resource_folder_name" )
    private String resourceFolderName;

    @Column( name = "description" , nullable = true )
    private String description;

    @Column( name = "created_date" , nullable = false )
    private LocalDateTime createdDate;

    @Column( name = "last_updated_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

    @OneToOne
    @JoinColumn( name = "created_user_id")
    private User createdUser;

    @OneToMany
    @JoinColumn( name = "resource_folder_id" )
    private List<Resource> resources;

}
