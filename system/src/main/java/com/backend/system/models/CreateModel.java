package com.backend.system.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Setter
@Getter
@Entity
@Table(name = "USERS")
@AllArgsConstructor
@NoArgsConstructor

public class CreateModel implements UserDetails {

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}