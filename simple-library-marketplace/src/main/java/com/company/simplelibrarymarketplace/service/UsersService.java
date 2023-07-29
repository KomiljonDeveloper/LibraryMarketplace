package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.dto.UsersDto;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements SimpleCrUD<UsersDto,Integer> {
    @Override
    public ResponseDto<UsersDto> create(UsersDto dto) {
        return null;
    }

    @Override
    public ResponseDto<UsersDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<UsersDto> update(UsersDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<UsersDto> delete(Integer id) {
        return null;
    }
}
