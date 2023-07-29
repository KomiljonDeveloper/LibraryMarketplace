package com.company.simplelibrarymarketplace.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ErrorDto {
    private String field;
    private String message;
}
