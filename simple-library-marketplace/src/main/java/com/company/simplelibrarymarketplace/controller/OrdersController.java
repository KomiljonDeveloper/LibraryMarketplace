package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.OrdersDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.service.OrdersService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order/")
public record OrdersController(OrdersService ordersService) implements SimpleCrUD<OrdersDto,Integer> {


    @Override
    @PostMapping("create")
    public ResponseDto<OrdersDto> create(@RequestBody OrdersDto dto) {
        return this.ordersService.create(dto);
    }

    @Override
    @GetMapping("get/{id}")
    public ResponseDto<OrdersDto> get(@PathVariable Integer id) {
        return this.ordersService.get(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<OrdersDto> update(@RequestBody OrdersDto dto,@PathVariable Integer id) {
        return this.ordersService.update(dto, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<OrdersDto> delete(@PathVariable Integer id) {
        return this.ordersService.delete(id);
    }
}
