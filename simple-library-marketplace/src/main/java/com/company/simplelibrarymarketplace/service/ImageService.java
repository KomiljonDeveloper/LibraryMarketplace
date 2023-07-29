package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService implements FileCrUD<ImageDto, MultipartFile,Integer> {


    @Override
    public ResponseDto<ImageDto> upload(MultipartFile file) {
        return null;
    }

    @Override
    public ResponseDto<ImageDto> download(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<ImageDto> update(MultipartFile file, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<ImageDto> delete(Integer id) {
        return null;
    }
}
