package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.AuthorDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.service.AuthorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public record AuthorController(AuthorService authorService) implements SimpleCrUD<AuthorDto,Integer> {


    @Override
    @PostMapping("/create")
    public ResponseDto<AuthorDto> create(@RequestBody AuthorDto dto) {
        return this.authorService.create(dto);
    }

    @Override
    @GetMapping("/get/{id}")
    public ResponseDto<AuthorDto> get(@PathVariable Integer id) {
        return this.authorService.get(id);
    }

    @Override
    @PutMapping("/update/{id}")
    public ResponseDto<AuthorDto> update(@RequestBody AuthorDto dto,@PathVariable Integer id) {
        return this.authorService.update(dto, id);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseDto<AuthorDto> delete(@PathVariable Integer id) {
        return this.authorService.delete(id);
    }
}
