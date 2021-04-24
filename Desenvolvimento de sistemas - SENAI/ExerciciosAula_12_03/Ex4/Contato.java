package sample.model;

public class Contato {

    //Atributos
    private String zapzap;
    private String email;
    private String twitter;


    //get e set
    public String getZapzap() {
        return zapzap;
    }

    public void setZapzap(String zapzap) {
        this.zapzap = zapzap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    //to String
    @Override
    public String toString() {
        return "Zapzap: " + zapzap +
                "; E-mail: " + email +
                "; Twitter: " + twitter;
    }
}
