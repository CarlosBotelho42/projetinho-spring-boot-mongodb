package Projetinho.SBMDB.ProjetinhoSBMDB.dto;

import Projetinho.SBMDB.ProjetinhoSBMDB.domain.user;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO(){

    }

    public AuthorDTO (user obj){

        id = obj.getId();
        name = obj.getName();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
