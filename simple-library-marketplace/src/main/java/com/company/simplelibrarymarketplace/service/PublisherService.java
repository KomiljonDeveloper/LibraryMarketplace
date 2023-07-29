package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.PublisherDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import org.springframework.stereotype.Service;

@Service
public class PublisherService implements SimpleCrUD<PublisherDto,Integer> {
    @Override
    public ResponseDto<PublisherDto> create(PublisherDto dto) {
        return null;
    }

    @Override
    public ResponseDto<PublisherDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<PublisherDto> update(PublisherDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<PublisherDto> delete(Integer id) {
        return null;
    }
}
