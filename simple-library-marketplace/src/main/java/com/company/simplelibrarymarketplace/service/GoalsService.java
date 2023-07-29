package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.GoalsDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import org.springframework.stereotype.Service;

@Service
public class GoalsService implements SimpleCrUD<GoalsDto,Integer> {
    @Override
    public ResponseDto<GoalsDto> create(GoalsDto dto) {
        return null;
    }

    @Override
    public ResponseDto<GoalsDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<GoalsDto> update(GoalsDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<GoalsDto> delete(Integer id) {
        return null;
    }
}
