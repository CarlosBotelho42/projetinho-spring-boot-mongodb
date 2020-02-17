package Projetinho.SBMDB.ProjetinhoSBMDB.dto;

import Projetinho.SBMDB.ProjetinhoSBMDB.domain.user;

import java.io.Serializable;

public class userDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public userDTO (){

    }

    public userDTO (user obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
