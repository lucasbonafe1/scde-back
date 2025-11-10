package org.acme.proj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Imagem extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "products_id")
    private Produto produto;
    private String nomeArquivo;
    private String caminhoUrl;

    public Imagem() {
    }

    public Imagem(Produto produto, String nomeArquivo, String caminhoUrl) {
        this.produto = produto;
        this.nomeArquivo = nomeArquivo;
        this.caminhoUrl = caminhoUrl;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getCaminhoUrl() {
        return caminhoUrl;
    }

    public void setCaminhoUrl(String caminhoUrl) {
        this.caminhoUrl = caminhoUrl;
    }
}
