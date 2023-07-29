package com.company.simplelibrarymarketplace.service;

import com.company.simplelibrarymarketplace.dto.AuthorDto;
import com.company.simplelibrarymarketplace.dto.ResponseDto;
import com.company.simplelibrarymarketplace.dto.SimpleCrUD;
import com.company.simplelibrarymarketplace.repository.AuthorRepository;
import com.company.simplelibrarymarketplace.service.mapper.AuthorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService implements SimpleCrUD<AuthorDto,Integer> {

    private AuthorRepository authorRepository;
    private AuthorMapper authorMapper;


    @Override
    public ResponseDto<AuthorDto> create(AuthorDto dto) {
        try {
            this.authorRepository.save(this.authorMapper.toEntity(dto));
            return ResponseDto.<AuthorDto>builder()
                    .success(true)
                    .message("OK")
                    .data(dto)
                    .build();

        }catch (Exception e){
            return ResponseDto.<AuthorDto>builder()
                    .code(-3)
                    .message("While database saving error!")
                    .build();
        }
    }

    @Override
    public ResponseDto<AuthorDto> get(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<AuthorDto> update(AuthorDto dto, Integer id) {
        return null;
    }

    @Override
    public ResponseDto<AuthorDto> delete(Integer id) {
        return null;
    }
}
