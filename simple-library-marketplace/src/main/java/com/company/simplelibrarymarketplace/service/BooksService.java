package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.BooksDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import org.springframework.stereotype.Service;

@Service
public class BooksService implements SimpleCrUD<BooksDto,Integer> {
    @Override
    public ResponseDto<BooksDto> create(BooksDto dto) {
        return null;
    }

    @Override
    public ResponseDto<BooksDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<BooksDto> update(BooksDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<BooksDto> delete(Integer id) {
        return null;
    }
}
