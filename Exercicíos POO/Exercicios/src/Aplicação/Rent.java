package Aplicação;

public class Rent {
    private String nomes;
    private String emails;

    public Rent() {
    }
    public Rent(String nomes, String emails) {
        this.nomes = nomes;
        this.emails = emails;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }
    public String toString() {
        return nomes + ", " + emails;
    }
}
