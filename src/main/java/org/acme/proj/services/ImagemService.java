package org.acme.proj.services;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.proj.entities.Imagem;
import org.acme.proj.entities.Produto;
import org.acme.proj.repositories.ImagemRepository;

import java.util.List;

@ApplicationScoped
public class ImagemService implements BaseService<Imagem>{
    @Inject
    ImagemRepository repository;

    @Override
    public Imagem create(Imagem img) {
        repository.persist(img);
        return img;
    }

    @Override
    public Imagem update(Long id, Imagem dto) {

        Imagem imagemExistente = repository.findById(id);
        if (imagemExistente == null)
            Log.errorf("Produto com id %i, não encontrado na base de dados.", id);

        imagemExistente.setCaminhoUrl(dto.getCaminhoUrl());
        imagemExistente.setNomeArquivo(dto.getNomeArquivo());

        return imagemExistente;
    }


    @Override
    public Imagem findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Imagem> findAll() {
        return repository.findAll().list();
    }

    @Override
    public boolean delete(Long id) {
        return repository.deleteById(id);
    }
}
