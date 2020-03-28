package com.spring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="titulo", nullable=false)
    private String titulo;

    @Column(name="isbn", nullable=false, unique=true)
    private String isbn;

    @Column(name="autor", nullable=true)
    private String autor;

    @Column(name="description", nullable=true)
    private String description;

    public Long getId() {
        return id;
    }
}
