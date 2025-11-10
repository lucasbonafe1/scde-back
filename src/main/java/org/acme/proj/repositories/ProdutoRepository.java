package org.acme.proj.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.proj.entities.Produto;

@ApplicationScoped
public class ProdutoRepository implements PanacheRepository<Produto>{
}
