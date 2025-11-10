package org.acme.proj.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.proj.entities.Imagem;
import org.acme.proj.entities.Produto;
import org.acme.proj.entities.Usuario;
import org.acme.proj.entities.dtos.ImagemDTO;
import org.acme.proj.entities.dtos.UsuarioDTO;
import org.acme.proj.repositories.UsuarioRepository;

import java.util.List;

@ApplicationScoped
public class UsuarioService implements BaseService<Usuario, UsuarioDTO>{
    @Inject
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(UsuarioDTO dto) {
        Usuario usuario = new Usuario();

        usuario.save(dto);
        usuarioRepository.persist(usuario);

        return usuario;
    }

    @Override
    public Usuario update(Long id, UsuarioDTO dto) {
        Usuario usuarioExistente = usuarioRepository.findById(id);

        if (usuarioExistente == null)
            throw new NullPointerException("Usuário não encontrado na base de dados.");

        usuarioExistente.save(dto);

        return usuarioExistente;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll().list();
    }

    @Override
    public boolean delete(Long id) {
        return usuarioRepository.deleteById(id);
    }
}
