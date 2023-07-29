package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.OrdersBooksDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.service.OrdersBooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orderBook/")
@RequiredArgsConstructor
public class OrdersBooksController implements SimpleCrUD<OrdersBooksDto,Integer> {
    private  final OrdersBooksService ordersBooksService;
    @Override
    @PostMapping("create")
    public ResponseDto<OrdersBooksDto> create(@RequestBody OrdersBooksDto dto) {
        return this.ordersBooksService.create(dto);
    }

    @Override
    @GetMapping("get/{id}")
    public ResponseDto<OrdersBooksDto> get(@PathVariable Integer id) {
        return this.ordersBooksService.get(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<OrdersBooksDto> update(@RequestBody OrdersBooksDto dto,@PathVariable Integer id) {
        return this.ordersBooksService.update(dto, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<OrdersBooksDto> delete(@PathVariable Integer id) {
        return this.ordersBooksService.delete(id);
    }
}
