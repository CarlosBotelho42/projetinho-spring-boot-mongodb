package Projetinho.SBMDB.ProjetinhoSBMDB.domain;

import Projetinho.SBMDB.ProjetinhoSBMDB.dto.AuthorDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Document
public class Post implements Serializable {

    @Id
    private String id;
    private Date data;
    private String title;
    private String dody;
    private AuthorDTO author;

    public Post(){

    }

    public Post(String id, Date data, String title, String dody, AuthorDTO author) {
        this.id = id;
        this.data = data;
        this.title = title;
        this.dody = dody;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDody() {
        return dody;
    }

    public void setDody(String dody) {
        this.dody = dody;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
