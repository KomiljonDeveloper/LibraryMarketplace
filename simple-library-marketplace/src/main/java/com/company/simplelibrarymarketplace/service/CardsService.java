package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.CardsDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import org.springframework.stereotype.Service;

@Service
public class CardsService implements SimpleCrUD<CardsDto,Integer> {
    @Override
    public ResponseDto<CardsDto> create(CardsDto dto) {
        return null;
    }

    @Override
    public ResponseDto<CardsDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<CardsDto> update(CardsDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<CardsDto> delete(Integer id) {
        return null;
    }
}
