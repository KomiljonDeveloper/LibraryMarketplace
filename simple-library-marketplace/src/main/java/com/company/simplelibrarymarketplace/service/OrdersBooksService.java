package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.OrdersBooksDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import org.springframework.stereotype.Service;

@Service
public class OrdersBooksService implements SimpleCrUD<OrdersBooksDto,Integer> {

    @Override
    public ResponseDto<OrdersBooksDto> create(OrdersBooksDto dto) {
        return null;
    }

    @Override
    public ResponseDto<OrdersBooksDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<OrdersBooksDto> update(OrdersBooksDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<OrdersBooksDto> delete(Integer id) {
        return null;
    }
}
