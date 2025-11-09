package org.acme.proj.entities;

import jakarta.persistence.Entity;

@Entity
public class Imagem extends BaseEntity{
    private String nomeArquivo;
    private String caminhoUrl;

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
