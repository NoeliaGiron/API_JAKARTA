package com.poortoys.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int year;
    private String author;
    @Enumerated(EnumType.STRING)
    private StatusPublication statusPublication;

    @OneToMany(mappedBy = "publication")
    private List<Borrow> borrows;

    @OneToMany(mappedBy = "publication")
    private List<Issue> issues;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public StatusPublication getStatusPublication() { return statusPublication; }
    public void setStatusPublication(StatusPublication statusPublication) { this.statusPublication = statusPublication; }
    public List<Borrow> getBorrows() { return borrows; }
    public void setBorrows(List<Borrow> borrows) { this.borrows = borrows; }
    public List<Issue> getIssues() { return issues; }
    public void setIssues(List<Issue> issues) { this.issues = issues; }
} 