package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.BooksDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.service.BooksService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book/")
public record BooksController(BooksService booksService) implements SimpleCrUD<BooksDto,Integer> {
    @Override
    @PostMapping("create")
    public ResponseDto<BooksDto> create(@RequestBody BooksDto dto) {
        return this.booksService.create(dto);
    }

    @Override
    @GetMapping("get/{id}")
    public ResponseDto<BooksDto> get(@PathVariable Integer id) {
        return this.booksService.get(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<BooksDto> update(@RequestBody BooksDto dto,@PathVariable Integer id) {
        return this.booksService.update(dto, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<BooksDto> delete(@PathVariable Integer id) {
        return this.booksService.delete(id);
    }
}
