package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.CardsDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.service.CardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("card/")
@RequiredArgsConstructor
public class CardsController  implements SimpleCrUD<CardsDto,Integer> {
    private  final CardsService cardsService;

    @Override
    @PostMapping("create")
    public ResponseDto<CardsDto> create(@RequestBody CardsDto dto) {
        return this.cardsService.create(dto);
    }

    @Override
    @GetMapping("get/{id}")
    public ResponseDto<CardsDto> get(@PathVariable Integer id) {
        return this.cardsService.get(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<CardsDto> update(@RequestBody CardsDto dto,@PathVariable Integer id) {
        return this.cardsService.update(dto, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<CardsDto> delete(@PathVariable Integer id) {
        return this.cardsService.delete(id);
    }
}
