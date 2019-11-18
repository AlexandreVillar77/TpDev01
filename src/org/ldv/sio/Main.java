package org.ldv.sio;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    adresseDom domicilec = new adresseDom("3 rue du clocher","Melun","77000");
    adresseLiv livraisond1 = new adresseLiv("2 rue du cimetière","Paris","75001");
    adresseLiv livraisond2 = new adresseLiv("7 rue de guaule","Melun","77600");
    adresseLiv livraisond3 = new adresseLiv("3 bis rue pierre","rozay-en-brie","77540");
    adresseLiv listAdresseLivd[] = {livraisond1, livraisond2, livraisond3};
    adresseLiv listAdresseLivc[] = {};

    AdresseEtendue etendue = new AdresseEtendue(domicilec,"edsger@dijstra.org","https://fr.wikipedia.org/wiki/Edsger_Dijkstra");

    Client c = new Client("Dijkstra", "Edsger",domicilec,listAdresseLivc,etendue);
    Client d = new Client("Kernighan", "Edsger",domicilec,listAdresseLivd,etendue);
    Client tabClient[] = {c,d};
    int numClient = 2;
    //num Client est le numéro du client a afficher
    for (int i = 0; i <= tabClient.length; i++) {
      i++;
      if (i >= tabClient.length) {
        break;
      }
      for (int x = 1; x <= tabClient[numClient-1].getLivraison().length ; x++) {
        System.out.println(tabClient[numClient-1].toString(x-1));

        }

      }

    }
  }
