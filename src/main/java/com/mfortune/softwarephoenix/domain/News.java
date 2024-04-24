package com.mfortune.softwarephoenix.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table
@Data
public class News extends AbstractEntity {

    private String title;
    private String author;
    private String category;
    private LocalDateTime publicationDate;
    private Long views;
    private Long likes;

}
