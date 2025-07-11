package com.poortoys.resources;

import com.poortoys.model.Publication;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("publications")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class PublicationResource {
    @PersistenceContext(unitName = "CRUD_PU")
    private EntityManager em;

    @GET
    public List<Publication> getAll() {
        return em.createQuery("SELECT p FROM Publication p", Publication.class).getResultList();
    }

    @POST
    @Transactional
    public Publication create(Publication publication) {
        em.persist(publication);
        return publication;
    }

    @GET
    @Path("{id}")
    public Publication getById(@PathParam("id") Long id) {
        return em.find(Publication.class, id);
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Publication update(@PathParam("id") Long id, Publication updated) {
        Publication publication = em.find(Publication.class, id);
        if (publication == null) return null;
        publication.setTitle(updated.getTitle());
        publication.setYear(updated.getYear());
        publication.setAuthor(updated.getAuthor());
        publication.setStatusPublication(updated.getStatusPublication());
        return publication;
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Publication publication = em.find(Publication.class, id);
        if (publication != null) {
            em.remove(publication);
        }
    }
} 