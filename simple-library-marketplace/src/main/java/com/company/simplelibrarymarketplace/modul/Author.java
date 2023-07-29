package com.company.simplelibrarymarketplace.modul;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Author {
    @Id
    @SequenceGenerator(name = "id_seq",sequenceName = "id_sequence",allocationSize = 1)
    @GeneratedValue(generator = "id_seq")
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
}
