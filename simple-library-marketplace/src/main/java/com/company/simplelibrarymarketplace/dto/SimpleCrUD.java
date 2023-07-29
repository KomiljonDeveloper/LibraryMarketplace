package com.company.simplelibrarymarketplace.dto;
public interface SimpleCrUD<T,V> {
    ResponseDto<T> create(T dto);
    ResponseDto<T> get(V id);
    ResponseDto<T> update( T dto, V id);
    ResponseDto<T> delete( V id);

}
