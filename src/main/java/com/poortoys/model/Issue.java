package com.poortoys.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date publishDate;
    private Date unpublishDate;
    private Date manageDate;
    private String issueStatus;

    @ManyToOne
    @JoinColumn(name = "librarian_id")
    private Librarian librarian;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publication;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getPublishDate() { return publishDate; }
    public void setPublishDate(Date publishDate) { this.publishDate = publishDate; }
    public Date getUnpublishDate() { return unpublishDate; }
    public void setUnpublishDate(Date unpublishDate) { this.unpublishDate = unpublishDate; }
    public Date getManageDate() { return manageDate; }
    public void setManageDate(Date manageDate) { this.manageDate = manageDate; }
    public String getIssueStatus() { return issueStatus; }
    public void setIssueStatus(String issueStatus) { this.issueStatus = issueStatus; }
    public Librarian getLibrarian() { return librarian; }
    public void setLibrarian(Librarian librarian) { this.librarian = librarian; }
    public Publication getPublication() { return publication; }
    public void setPublication(Publication publication) { this.publication = publication; }
} 