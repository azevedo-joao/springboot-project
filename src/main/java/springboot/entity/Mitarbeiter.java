package springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mitarbeiter")
public class Mitarbeiter {

    // Felder
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="vorname")
    private String vorname;

    @Column(name="nachname")
    private String nachname;

    @Column(name="position")
    private String position;

    @Column(name="email")
    private String email;

    public Mitarbeiter() {

    }

    public Mitarbeiter(String vorname, String nachname, String position, String email) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.position = position;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", vorname=" + vorname +
                ", nachname=" + nachname +
                ", position=" + position +
                ", email=" + email +
                '}';
    }
}
