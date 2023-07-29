package com.company.simplelibrarymarketplace.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ImageDto {
    private Integer id;
    private String path;
    private String type;
    private String token;
    private Double size;

}
