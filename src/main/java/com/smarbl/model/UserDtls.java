package com.smarbl.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserDtls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fullName;

    private String email;

    private String address;

    private String qualification;

    private String password;

    private String role;

}
