package org.ldv.sio;

public class adresseDom {
    private String rue;
    private String ville;
    private String codePostal;

    public adresseDom(String rue, String ville, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }


    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    @Override
    public String toString() {
        return "adresseDom{" +
                "rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }

}
