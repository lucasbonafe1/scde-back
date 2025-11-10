package org.acme.proj.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.acme.proj.entities.Imagem;
import org.acme.proj.entities.dtos.ImagemDTO;
import org.acme.proj.services.ImagemService;

import java.util.List;

@Path("/imagens")
public class ImagemController {
    @Inject
    ImagemService imagemService;

    @POST
    public Response create(ImagemDTO dto) {
        Imagem imgCriada = imagemService.create(dto);
        return Response.status(Response.Status.CREATED).entity(imgCriada).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, ImagemDTO dto) {
        Imagem imgAtualizada = imagemService.update(id, dto);
        return Response.ok(imgAtualizada).build();
    }

    @GET
    public Response findAll() {
        List<Imagem> imagens = imagemService.findAll();
        return Response.ok(imagens).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
        Imagem imagem = imagemService.findById(id);
        return Response.ok(imagem).build();
    }

    @DELETE
    public Response delete(@PathParam("id") Long id) {
        boolean isDeleted = imagemService.delete(id);
        return Response.ok(isDeleted).build();
    }
}
