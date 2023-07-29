package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.PublisherDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.service.PublisherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("publisher/")
public record PublisherController(PublisherService publisherService) implements SimpleCrUD<PublisherDto,Integer> {
    @Override
    @PostMapping("create")
    public ResponseDto<PublisherDto> create(@RequestBody PublisherDto dto) {
        return this.publisherService.create(dto);
    }

    @Override
    @GetMapping("get/{id}")
    public ResponseDto<PublisherDto> get(@PathVariable Integer id) {
        return this.publisherService.get(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<PublisherDto> update(@RequestBody PublisherDto dto,@PathVariable Integer id) {
        return this.publisherService.update(dto, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<PublisherDto> delete(@PathVariable Integer id) {
        return this.publisherService.delete(id);
    }
}
