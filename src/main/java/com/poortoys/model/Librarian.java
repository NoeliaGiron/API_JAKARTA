package com.poortoys.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Librarian extends Person {
    private String idLibrarian;

    @OneToMany(mappedBy = "librarian")
    private List<Issue> issues;

    public void addPublication() {
        // Lógica para agregar una publicación
    }

    public void removePublication() {
        // Lógica para eliminar una publicación
    }

    public void holdPublication() {
        // Lógica para reservar una publicación
    }

    @Override
    public void getPublications() {
        // Implementación específica para Librarian
    }

    // Getters y setters
    public String getIdLibrarian() { return idLibrarian; }
    public void setIdLibrarian(String idLibrarian) { this.idLibrarian = idLibrarian; }
    public List<Issue> getIssues() { return issues; }
    public void setIssues(List<Issue> issues) { this.issues = issues; }
} 