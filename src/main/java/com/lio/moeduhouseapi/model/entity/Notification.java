package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "notifications" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @Column( name = "content" , nullable = false )
    private String content;

    @Column( name = "is_personal_notification" , nullable = false )
    private boolean isPersonalNotification;

    @OneToOne
    @JoinColumn( name = "sent_user_id" , nullable = false )
    private User sentUser;

    @OneToOne
    @JoinColumn( name = "batch_id" , nullable = true )
    private Batch batch;

    @Column( name = "created_date" , nullable = false )
    private LocalDateTime createdDate;

    @Column( name = "last_updated_date" , nullable = false )
    private LocalDateTime lastUpdatedDate;

}
