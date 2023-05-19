package pe.upc.primero.entidades;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "TP_AUTHOR")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 40,nullable = false)
    private String nameAuthor;
    private LocalDate birthDateAuthor;
    private String emailAuthor;

    public Author(Integer id, String nameAuthor, LocalDate birthDateAuthor, String emailAuthor) {
        this.id = id;
        this.nameAuthor = nameAuthor;
        this.birthDateAuthor = birthDateAuthor;
        this.emailAuthor = emailAuthor;
    }

    public Author() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public LocalDate getBirthDateAuthor() {
        return birthDateAuthor;
    }

    public void setBirthDateAuthor(LocalDate birthDateAuthor) {
        this.birthDateAuthor = birthDateAuthor;
    }

    public String getEmailAuthor() {
        return emailAuthor;
    }

    public void setEmailAuthor(String emailAuthor) {
        this.emailAuthor = emailAuthor;
    }
}
