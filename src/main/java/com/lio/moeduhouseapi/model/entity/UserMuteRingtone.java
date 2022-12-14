package com.lio.moeduhouseapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table( name = "user_mute_ringtone" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMuteRingtone {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @OneToOne
    @JoinColumn( name = "user_id" )
    private User user;

}
