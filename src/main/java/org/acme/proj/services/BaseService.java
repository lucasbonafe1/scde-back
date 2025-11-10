package org.acme.proj.services;

import java.util.List;

public interface BaseService<R, T> {
    R create(T dto);
    R update(Long id, T dto);
    R findById(Long id);
    List<R> findAll();
    boolean delete(Long id);
}
