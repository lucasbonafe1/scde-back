package org.acme.proj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.acme.proj.enums.CondicaoEnum;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
public class Produto extends BaseEntity{
    private String nome;
    private String descricao;
    private Double preco;
    private String codigoSKU;
    private Integer unidade;
    private CondicaoEnum condicao;

    private String marca;
    private Double peso;
    private Double altura;
    private Double largura;
    private Date dataDeValidade;
    @OneToMany(mappedBy = "produto")
    private List<Imagem> imagens;

    public Produto() {
    }

    public Produto save(Produto novosDados){
        Produto produto = new Produto();

        produto.setNome(novosDados.getNome());
        produto.setDescricao(novosDados.getDescricao());
        produto.setPreco(novosDados.getPreco());
        produto.setCodigoSKU(novosDados.getCodigoSKU());
        produto.setUnidade(novosDados.getUnidade());
        produto.setCondicao(novosDados.getCondicao());

        produto.setMarca(novosDados.getMarca());
        produto.setPeso(novosDados.getPeso());
        produto.setAltura(novosDados.getAltura());
        produto.setLargura(novosDados.getLargura());
        produto.setDataDeValidade(novosDados.getDataDeValidade());

        return produto;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
