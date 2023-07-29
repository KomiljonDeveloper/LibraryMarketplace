package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.dto.UsersDto;
import com.company.simplelibrarymarketplace.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users/")
@RequiredArgsConstructor
public class UsersController implements SimpleCrUD<UsersDto,Integer> {
    private final UsersService usersService;


    @Override
    @PostMapping("create")
    public ResponseDto<UsersDto> create(@RequestBody UsersDto dto) {
        return this.usersService.create(dto);
    }

    @Override
    @GetMapping("get/{id}")
    public ResponseDto<UsersDto> get(@PathVariable Integer id) {
        return this.usersService.get(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<UsersDto> update(@RequestBody UsersDto dto,@PathVariable Integer id) {
        return this.usersService.update(dto, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<UsersDto> delete(@PathVariable Integer id) {
        return this.usersService.delete(id);
    }
}
