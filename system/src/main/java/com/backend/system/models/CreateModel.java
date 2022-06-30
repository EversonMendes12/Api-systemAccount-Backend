package com.backend.system.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "USERS")
@AllArgsConstructor
@NoArgsConstructor

public class CreateModel {

    /** ////////// -- TABELA CRIADO NO BANCO DE DADOS MARIA DB -- ////////////
     *
     * CREATE TABLE USERS (
     * 	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
     *     user VARCHAR(15),
     *     name VARCHAR(50),
     *     password VARCHAR(50)
     * );
     */

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String user;
    private String name;
    private String password;

}