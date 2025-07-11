package com.poortoys.resources;

import com.poortoys.model.Borrow;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("borrows")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class BorrowResource {
    @PersistenceContext(unitName = "CRUD_PU")
    private EntityManager em;

    @GET
    public List<Borrow> getAll() {
        return em.createQuery("SELECT b FROM Borrow b", Borrow.class).getResultList();
    }

    @POST
    @Transactional
    public Borrow create(Borrow borrow) {
        em.persist(borrow);
        return borrow;
    }

    @GET
    @Path("{id}")
    public Borrow getById(@PathParam("id") Long id) {
        return em.find(Borrow.class, id);
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Borrow update(@PathParam("id") Long id, Borrow updated) {
        Borrow borrow = em.find(Borrow.class, id);
        if (borrow == null) return null;
        borrow.setFromDate(updated.getFromDate());
        borrow.setToDate(updated.getToDate());
        borrow.setBorrowStatus(updated.getBorrowStatus());
        borrow.setMember(updated.getMember());
        borrow.setPublication(updated.getPublication());
        return borrow;
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Borrow borrow = em.find(Borrow.class, id);
        if (borrow != null) {
            em.remove(borrow);
        }
    }
} 