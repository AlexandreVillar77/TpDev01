package org.ldv.sio;

public class Client {
  private String nom;
  private String prenom;
  private adresseDom domicile;
  private adresseLiv livraison[];
  private AdresseEtendue etendue;

  public Client(String nom, String prenom, adresseDom domicile, adresseLiv[] livraison, AdresseEtendue etendue) {
    this.nom = nom;
    this.prenom = prenom;
    this.domicile = domicile;
    this.livraison = livraison;
    this.etendue = etendue;
  }

  public AdresseEtendue getEtendue() {
    return etendue;
  }

  public void setEtendue(AdresseEtendue etendue) {
    this.etendue = etendue;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public adresseDom getDomicile() {
    return domicile;
  }

  public void setDomicile(adresseDom domicile) {
    this.domicile = domicile;
  }

  public adresseLiv[] getLivraison() {
    return livraison;
  }

  public void setLivraison(adresseLiv[] livraison) {
    this.livraison = livraison;
  }

  public void changeLivraison(int id) {
    if (livraison.length < id || livraison[id].getVille() == "") {
      adresseLiv change = new adresseLiv(this.domicile.getRue(), this.domicile.getVille(), this.domicile.getCodePostal());
      adresseLiv list[] = {change};
      this.setLivraison(list);

    }
  }

  public String toString(int id) {
    if (livraison.length == 0) {
      changeLivraison(id);
    }
    String infoClient = "o";


    if (etendue.getUrl() == "") {

      infoClient = "nom='" + nom + '\'' +
              ", rue= " + domicile.getRue() + ", code postal " + domicile.getCodePostal() + ", ville " + domicile.getVille()
              + " adresse de livraison = " + livraison[id].getRue() + ", " + livraison[id].getCodePostal() + ", " + livraison[id].getVille();

    } else {
      infoClient =
              "nom='" + nom + '\'' +
              ", rue= " + domicile.getRue() + ", code postal " + domicile.getCodePostal() + ", ville " + domicile.getVille()
              + " adresse mail : " + etendue.getMail() + " url : " + etendue.getUrl()
              + " adresse de livraison = " + livraison[id].getRue() + ", " + livraison[id].getCodePostal() + ", " + livraison[id].getVille()
              ;

    }
    return infoClient;
  }
}