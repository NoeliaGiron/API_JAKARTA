package com.poortoys.model;

import jakarta.persistence.*;
import java.util.List;
import jakarta.json.bind.annotation.JsonbTransient;

@Entity
public class Member extends Person {
    private String idMember;

    @OneToMany(mappedBy = "member")
    private List<Borrow> borrows;

    public void checkOutPublication() {
        // Lógica para sacar una publicación
    }

    public void returnPublication() {
        // Lógica para devolver una publicación
    }

    public void holdOnPublication() {
        // Lógica para reservar una publicación
    }

    @Override
    public void getPublications() {
        // Implementación específica para Member
    }

    // Getters y setters
    public String getIdMember() { return idMember; }
    public void setIdMember(String idMember) { this.idMember = idMember; }
    @JsonbTransient
    public List<Borrow> getBorrows() { return borrows; }
    public void setBorrows(List<Borrow> borrows) { this.borrows = borrows; }
} 