package com.company.simplelibrarymarketplace.modul;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users",uniqueConstraints =@UniqueConstraint(name = "unique", columnNames =  "email" ))
@Entity
public class Users {
    @Id
    @SequenceGenerator(name = "users_seq",sequenceName = "users_sequence",allocationSize = 1)
    @GeneratedValue(generator ="users_seq" )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    @OneToOne
    private Gender gender;
    private String phone;
    private String password;
    @OneToOne
    private Cards cards;
    private LocalDateTime birthday;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
