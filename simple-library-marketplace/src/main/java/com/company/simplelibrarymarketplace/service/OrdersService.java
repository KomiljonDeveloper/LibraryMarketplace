package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.OrdersDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import org.springframework.stereotype.Service;

@Service
public class OrdersService implements SimpleCrUD<OrdersDto,Integer> {
    @Override
    public ResponseDto<OrdersDto> create(OrdersDto dto) {
        return null;
    }

    @Override
    public ResponseDto<OrdersDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<OrdersDto> update(OrdersDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<OrdersDto> delete(Integer id) {
        return null;
    }
}
