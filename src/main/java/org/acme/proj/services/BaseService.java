package org.acme.proj.services;

import java.util.List;

public interface BaseService<R> {
    R create(R R);
    R update(Long id, R dto);
    R findById(Long id);
    List<R> findAll();
    boolean delete(Long id);
}
