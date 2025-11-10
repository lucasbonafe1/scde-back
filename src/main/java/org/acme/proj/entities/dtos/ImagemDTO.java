package org.acme.proj.entities.dtos;

public class ImagemDTO {
    private Long produtoId;
    private String nomeArquivo;
    private String caminhoUrl;

    public Long getProductId() {
        return produtoId;
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
