package org.ldv.sio;

import java.util.Arrays;

public class AdresseEtendue {
    private adresseDom adresse;
    private String mail;
    private String url;

    public AdresseEtendue(adresseDom adresse, String mail, String url) {
        this.adresse = adresse;
        this.mail = mail;
        this.url = url;
    }

    public adresseDom getAdresse() {
        return adresse;
    }

    public void setAdresse(adresseDom adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String explain(AdresseEtendue adresse)
    {
        String explain = adresse.getAdresse().getRue() + adresse.getAdresse().getVille() + adresse.getAdresse().getCodePostal() + adresse.getMail() + adresse.getUrl();
        return explain;
    }

    @Override
    public String toString() {
        return "AdresseEtendue{" +
                "adresse=" + adresse +
                ", mail='" + mail + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
