package com.home.personexport.model.service.impl;

import java.util.List;

public interface ServiceImpl<T,I> {
    T insert(T t);
    T update(T t);
    T delete(I id);
    T findById(I id);
    List<T> findAll();
}
