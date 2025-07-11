package com.poortoys.resources;

import com.poortoys.model.Issue;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("issues")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class IssueResource {
    @PersistenceContext(unitName = "CRUD_PU")
    private EntityManager em;

    @GET
    public List<Issue> getAll() {
        return em.createQuery("SELECT i FROM Issue i", Issue.class).getResultList();
    }

    @POST
    @Transactional
    public Issue create(Issue issue) {
        em.persist(issue);
        return issue;
    }

    @GET
    @Path("{id}")
    public Issue getById(@PathParam("id") Long id) {
        return em.find(Issue.class, id);
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Issue update(@PathParam("id") Long id, Issue updated) {
        Issue issue = em.find(Issue.class, id);
        if (issue == null) return null;
        issue.setPublishDate(updated.getPublishDate());
        issue.setUnpublishDate(updated.getUnpublishDate());
        issue.setManageDate(updated.getManageDate());
        issue.setIssueStatus(updated.getIssueStatus());
        issue.setLibrarian(updated.getLibrarian());
        issue.setPublication(updated.getPublication());
        return issue;
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Issue issue = em.find(Issue.class, id);
        if (issue != null) {
            em.remove(issue);
        }
    }
} 