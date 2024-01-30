package com.MAE.GetYourExBackApp_Backend;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "new_user_table", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})
public class User {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)  // Auto-incremented primary key
    private int id;

    @Column(name= "username")
    private  String username;

    @Column(name= "email")
    private  String email;

    @Column(name= "password")
    private  String password;
}


