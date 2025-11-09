package org.acme.proj.entities;

import jakarta.persistence.Entity;
import org.acme.proj.enums.CondicaoEnum;

@Entity
public class Produto extends BaseEntity{
    private String nome;
    private Double preco;
    private String codigoSKU;
    private Integer unidade;
    private CondicaoEnum condicao;

    private Caracteristica caracteristica;
    private Imagem imagem;

    public Produto() {
    }

    public Caracteristica getCaracteristicas() {
        return caracteristica;
    }

    public void setCaracteristicas(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public CondicaoEnum getCondicao() {
        return condicao;
    }

    public void setCondicao(CondicaoEnum condicao) {
        this.condicao = condicao;
    }

    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public String getCodigoSKU() {
        return codigoSKU;
    }

    public void setCodigoSKU(String codigoSKU) {
        this.codigoSKU = codigoSKU;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Imagem getImagens() {
        return imagem;
    }

    public void setImagens(Imagem imagem) {
        this.imagem = imagem;
    }
}
