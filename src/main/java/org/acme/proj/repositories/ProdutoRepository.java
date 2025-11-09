package org.acme.proj.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.proj.entities.Produto;

public class ProdutoRepository implements PanacheRepository<Produto>{
}
