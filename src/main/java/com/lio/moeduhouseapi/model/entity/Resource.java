package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "resources" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "resource_name" , nullable = false )
    private String resourceName;

    @Column( name = "description" , nullable = true )
    private String description;

    @Transient
    private MultipartFile resourceFile;

    @Column( name = "resource_file_uri" , nullable = false )
    private String resourceFileUri;

    @Column( name = "uploaded_date" , nullable = false )
    private LocalDateTime uploadedDate;

    @Column( name = "last_updated_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

    @OneToOne
    @JoinColumn( name = "uploaded_user_id" )
    private User uploadedUser;

}
