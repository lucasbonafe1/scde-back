package org.acme.proj.services;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.proj.entities.Produto;
import org.acme.proj.entities.dtos.ProdutoDTO;
import org.acme.proj.repositories.ProdutoRepository;

import java.util.List;

@ApplicationScoped
public class ProdutoService implements BaseService<Produto, ProdutoDTO>{
    @Inject
    ProdutoRepository repository;

    @Override
    public Produto create(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.save(dto);

        repository.persist(produto);
        return produto;
    }

    @Override
    public Produto update(Long id, ProdutoDTO dto) {
        Produto produtoExistente = repository.findById(id);
        if (produtoExistente == null)
            throw new NullPointerException("Produto não encontrado na base de dados.");

        return produtoExistente.save(dto);
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
