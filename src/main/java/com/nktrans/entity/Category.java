package com.nktrans.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by scelac on 8/5/16.
 */
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    List<Item>  items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
