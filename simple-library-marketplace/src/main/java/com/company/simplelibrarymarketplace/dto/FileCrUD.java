package com.company.simplelibrarymarketplace.dto;
public interface FileCrUD<T,V,P> {
    ResponseDto<T> upload(V file);
    ResponseDto<T> download(P id);
    ResponseDto<T> update(V file,P id);
    ResponseDto<T> delete(P id);
}
