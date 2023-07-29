package com.company.simplelibrarymarketplace.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BooksDto {
  private Integer id;
  private String name;
  private AuthorDto author;
  private GoalsDto goals;
  private ImageDto image;
  private PublisherDto publisher;
  private Double price;
  private Integer page;
  private LocalDateTime published;
  private Double amount;
}
