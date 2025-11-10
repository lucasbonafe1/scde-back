package org.acme.proj.services;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.proj.entities.Imagem;
import org.acme.proj.entities.Produto;
import org.acme.proj.entities.dtos.ImagemDTO;
import org.acme.proj.repositories.ImagemRepository;
import org.acme.proj.repositories.ProdutoRepository;

import java.util.List;

@ApplicationScoped
public class ImagemService implements BaseService<Imagem, ImagemDTO>{
    @Inject
    ImagemRepository imgRepository;

    @Inject
    ProdutoRepository produtoRepository;

    @Override
    public Imagem create(ImagemDTO img) {
        Produto produto = produtoRepository.findById(img.getProductId());

        if (produto == null)
            throw new NullPointerException("Produto não encontrado na base de dados.");
        
        Imagem imagem = new Imagem(produto, img.getNomeArquivo(), img.getCaminhoUrl());
        imgRepository.persist(imagem);

        return imagem;
    }

    @Override
    public Imagem update(Long id, ImagemDTO dto) {
        Imagem imagemExistente = imgRepository.findById(id);

        if (imagemExistente == null)
            throw new NullPointerException("Imagem não encontrada na base de dados.");

        imagemExistente.setCaminhoUrl(dto.getCaminhoUrl());
        imagemExistente.setNomeArquivo(dto.getNomeArquivo());

        return imagemExistente;
    }

    @Override
    public Imagem findById(Long id) {
        return imgRepository.findById(id);
    }

    @Override
    public List<Imagem> findAll() {
        return imgRepository.findAll().list();
    }

    @Override
    public boolean delete(Long id) {
        return imgRepository.deleteById(id);
    }
}
