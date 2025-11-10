package org.acme.proj.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.proj.entities.Imagem;

@ApplicationScoped
public class ImagemRepository implements PanacheRepository<Imagem>{
}
