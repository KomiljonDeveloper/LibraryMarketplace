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
@Entity
public class Books {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  @OneToOne
  private Author author;
  @OneToOne
  private Goals goals;
  @OneToOne
  private Image image;
  @OneToOne
  private Publisher publisher;
  private Double price;
  private Integer page;
  private LocalDateTime published;
  private Double amount;
}
