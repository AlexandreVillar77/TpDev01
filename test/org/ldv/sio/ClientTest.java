package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

  private Client c;
  private Client d;
  private adresseDom domicile;
  private adresseLiv livraison;
  private AdresseEtendue adresseEt;

  @Before
  public void initializeEachTest() {
    this.adresseEt = new AdresseEtendue(this.domicile, "edsger@dijstra.org" , "https://fr.wikipedia.org/wiki/Edsger_Dijkstra");
    this.domicile= new adresseDom("3 rue du clocher","Melun","77000");
    adresseLiv livraison1 = new adresseLiv("","","");
    adresseLiv livraison2 = new adresseLiv("5 rue pierre","paris","75000");
    adresseLiv listLiv[] = {livraison1,livraison2};
    this.c = new Client("Dijkstra", "Edsger",domicile,listLiv,adresseEt);
    this.d = new Client("Dijkstra", "Edsger",domicile,listLiv,adresseEt);
  }

  @Test
  public void adresselivNull()  {
    adresseLiv livraison1 = new adresseLiv("", "", "");
    adresseLiv livraison2 = new adresseLiv("", "", "");
    adresseLiv listAdliv[] = {livraison1, livraison2};
    this.c.setLivraison(listAdliv);
    for (int i = 0;i< this.c.getLivraison().length; i++) {


      this.c.changeLivraison(i);
      String expected = this.c.getDomicile().getRue() + this.c.getDomicile().getVille() + this.c.getDomicile().getCodePostal();
      String object = this.c.getLivraison()[i].getRue() + this.c.getLivraison()[i].getVille() + this.c.getLivraison()[i].getCodePostal();

      assertEquals(expected , object);
      }
    }

    @Test
  public void adresseToAdresseEtend()
    {
      this.adresseEt = new AdresseEtendue(this.domicile, "edsger@dijstra.org" , "https://fr.wikipedia.org/wiki/Edsger_Dijkstra");
      String expected = this.domicile.getRue() + this.domicile.getVille() + this.domicile.getCodePostal() + "edsger@dijstra.org"+ "https://fr.wikipedia.org/wiki/Edsger_Dijkstra";
      String object = this.adresseEt.explain(this.adresseEt);

      assertEquals(expected,object);
    }

  @Test
  public void getUrl (){
    assertEquals("https://fr.wikipedia.org/wiki/Edsger_Dijkstra", this.c.getEtendue().getUrl());
  }


  @Test
  public void adresselivNotNull() {
    {
      for (int i = 0; i< this.c.getLivraison().length; i++) {


        adresseLiv livraison1 = new adresseLiv("5 rue de gaulle", "paris", "75000");
        adresseLiv livraison2 = new adresseLiv("7 rue de branly", "melun", "77200");
        adresseLiv listAdliv[] = {livraison1, livraison2};
        this.c.setLivraison(listAdliv);

        String unexpected = this.c.getDomicile().getRue() + this.c.getDomicile().getVille() + this.c.getDomicile().getCodePostal();
        String object = this.c.getLivraison()[i].getRue() + this.c.getLivraison()[i].getVille() + this.c.getLivraison()[i].getCodePostal();

        assertNotEquals(unexpected, object);

      }
    }
  }





  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }


  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }
}