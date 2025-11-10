package org.acme.proj.services;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.proj.entities.Produto;
import org.acme.proj.repositories.ProdutoRepository;

import java.util.List;

@ApplicationScoped
public class ProdutoService implements BaseService<Produto>{
    @Inject
    ProdutoRepository repository;

    @Override
    public Produto create(Produto produto) {
        repository.persist(produto);
        return produto;
    }

    @Override
    public Produto update(Long id, Produto produto) {
        Produto produtoExistente = repository.findById(id);
        if (produtoExistente == null)
            Log.errorf("Produto com id %i, não encontrado na base de dados.", id);

        return produto.save(produto);
    }

    @Override
    public Produto findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Produto> findAll() {
        return repository.findAll().list();
    }

    @Override
    public boolean delete(Long id) {
        return repository.deleteById(id);
    }
}
