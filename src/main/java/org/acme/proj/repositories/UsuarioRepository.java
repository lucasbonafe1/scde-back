package org.acme.proj.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.proj.entities.Usuario;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {
}