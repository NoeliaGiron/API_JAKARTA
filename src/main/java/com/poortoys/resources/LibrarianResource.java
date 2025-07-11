package com.poortoys.resources;

import com.poortoys.model.Librarian;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("librarians")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class LibrarianResource {
    @PersistenceContext(unitName = "CRUD_PU")
    private EntityManager em;

    @GET
    public List<Librarian> getAll() {
        return em.createQuery("SELECT l FROM Librarian l", Librarian.class).getResultList();
    }

    @POST
    @Transactional
    public Librarian create(Librarian librarian) {
        em.persist(librarian);
        return librarian;
    }

    @GET
    @Path("{id}")
    public Librarian getById(@PathParam("id") Long id) {
        return em.find(Librarian.class, id);
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Librarian update(@PathParam("id") Long id, Librarian updated) {
        Librarian librarian = em.find(Librarian.class, id);
        if (librarian == null) return null;
        librarian.setName(updated.getName());
        librarian.setSurname(updated.getSurname());
        librarian.setAddress(updated.getAddress());
        librarian.setAge(updated.getAge());
        librarian.setIdLibrarian(updated.getIdLibrarian());
        return librarian;
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Librarian librarian = em.find(Librarian.class, id);
        if (librarian != null) {
            em.remove(librarian);
        }
    }
} 