package org.acme.proj.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.acme.proj.entities.Produto;
import org.acme.proj.services.ProdutoService;

import java.util.List;

@Path("/produtos")
public class ProdutoController {
    @Inject
    ProdutoService produtoService;

    @POST
    public Response create(Produto dto) {
        Produto produtoCriado = produtoService.create(dto);
        return Response.status(Response.Status.CREATED).entity(produtoCriado).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Produto dto) {
        Produto produtoAtualizado = produtoService.update(id, dto);
        return Response.ok(produtoAtualizado).build();
    }

    @GET
    public Response findAll() {
        List<Produto> produtos = produtoService.findAll();
        return Response.ok(produtos).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
        Produto produto = produtoService.findById(id);
        return Response.ok(produto).build();
    }

    @DELETE
    public Response delete(@PathParam("id") Long id) {
        boolean isDeleted = produtoService.delete(id);
        return Response.ok(isDeleted).build();
    }
}
