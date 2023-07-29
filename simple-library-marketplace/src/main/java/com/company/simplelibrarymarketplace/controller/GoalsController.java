package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.GoalsDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.service.GoalsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("goal/")
public record GoalsController(GoalsService goalsService)  implements SimpleCrUD<GoalsDto,Integer> {
    @Override
    @PostMapping("create")
    public ResponseDto<GoalsDto> create(@RequestBody GoalsDto dto) {
        return this.goalsService.create(dto);
    }

    @Override
    @GetMapping("get/{id}")
    public ResponseDto<GoalsDto> get(@PathVariable Integer id) {
        return this.goalsService.get(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<GoalsDto> update(@RequestBody GoalsDto dto,@PathVariable Integer id) {
        return this.goalsService.update(dto, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<GoalsDto> delete(@PathVariable Integer id) {
        return this.goalsService.delete(id);
    }
}
