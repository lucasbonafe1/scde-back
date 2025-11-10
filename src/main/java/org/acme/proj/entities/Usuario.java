package org.acme.proj.entities;

import org.acme.proj.entities.dtos.UsuarioDTO;

public class Usuario extends BaseEntity{
    public String email;
    public String senhaHash;
    public String name;
    public String cpf;
    public String telefone;
    public String cidade;
    public String empresa;
    public String uf;

    public Usuario save(UsuarioDTO dto) {
        Usuario usuario = new Usuario();

        usuario.setEmail(dto.getEmail());
        usuario.setSenhaHash(getSenhaHash());
        usuario.setName(getName());
        usuario.setCpf(getCpf());
        usuario.setTelefone(getTelefone());
        usuario.setCidade(getCidade());
        usuario.setEmpresa(getEmpresa());
        usuario.setUf(getUf());

        return usuario;
    }

    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
