package com.poortoys.resources;

import com.poortoys.model.Member;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("members")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class MemberResource {

    @PersistenceContext(unitName = "CRUD_PU")
    private EntityManager em;

    @GET
    public List<Member> getAll() {
        return em.createQuery("SELECT m FROM Member m", Member.class).getResultList();
    }

    @POST
    @Transactional
    public Member create(Member member) {
        em.persist(member);
        return member;
    }

    @GET
    @Path("{id}")
    public Member getById(@PathParam("id") Long id) {
        return em.find(Member.class, id);
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Member update(@PathParam("id") Long id, Member updated) {
        Member member = em.find(Member.class, id);
        if (member == null) return null;
        member.setName(updated.getName());
        member.setSurname(updated.getSurname());
        member.setAddress(updated.getAddress());
        member.setAge(updated.getAge());
        member.setIdMember(updated.getIdMember());
        return member;
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Member member = em.find(Member.class, id);
        if (member != null) {
            em.remove(member);
        }
    }
} 