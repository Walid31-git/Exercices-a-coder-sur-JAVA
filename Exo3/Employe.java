package Exo3;

public class Employe {
    private String firstname;
    private String lastname;
    private String mail;
    private Integer identifier;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }


    public Employe(Integer identifier, String firstname, String lastname, String mail) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifier=" + identifier +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
