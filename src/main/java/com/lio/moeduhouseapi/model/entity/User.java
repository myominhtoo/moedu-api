package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "users" )
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private String id;

    @Column( name = "first_name" , nullable = false )
    private String firstName;

    @Column( name = "last_name" , nullable = false )
    private String lastName;

    @Column( name = "email" , nullable = false , unique = true )
    private String email;

    @Column( name = "password" , nullable = false )
    private String password;

    @OneToOne
    @JoinColumn( name = "role_id" )
    private Role role;

    @Column( name = "phone" , nullable = true )
    private String phone;

    @Column( name = "address" , nullable = true )
    private String address;

    @Column( name = "bio" , nullable = true )
    private String bio;

    @Transient
    private MultipartFile profileImage;

    @Column( name = "profile_image_uri" , nullable = true )
    private String profileImageUri;

    @Column( name = "is_enable" , nullable = false )
    private boolean isEnable;

    @Column( name = "verify_code" , nullable = true )
    private String verifyCode;

    @Column( name = "created_date" , nullable = true )
    private LocalDateTime createdDate;

    @Column( name = "updated_date" , nullable = true )
    private LocalDateTime updateDate;

    @Column( name = "last_logged_in_date", nullable = true)
    private LocalDateTime lastLoggedInDate;

    @Column( name = "last_logged_in_device_id" , nullable = true )
    private String lastLoggedInDeviceId;

    @Column( name = "nick_name" , nullable = true )
    private String nickName;

    /*
      to trace different device
     */
    @Column( name = "device_id" , nullable = false )
    private String deviceId;
}
