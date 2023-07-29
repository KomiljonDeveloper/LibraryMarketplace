package com.company.simplelibrarymarketplace.controller;

import com.company.simplelibrarymarketplace.dto.FileCrUD;
import com.company.simplelibrarymarketplace.dto.ImageDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("image/")
@RequiredArgsConstructor
public class ImageController implements FileCrUD<ImageDto, MultipartFile ,Integer> {
    private final ImageService imageService;


    @Override
    @PostMapping("upload")
    public ResponseDto<ImageDto> upload(@RequestBody MultipartFile file) {
        return this.imageService.upload(file);
    }

    @Override
    @GetMapping("download/{id}")
    public ResponseDto<ImageDto> download(@PathVariable Integer id) {
        return this.imageService.download(id);
    }

    @Override
    @PutMapping("update/{id}")
    public ResponseDto<ImageDto> update(@RequestBody MultipartFile file, @PathVariable Integer id) {
        return this.imageService.update(file, id);
    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseDto<ImageDto> delete(@PathVariable Integer id) {
        return this.imageService.delete(id);
    }
}
