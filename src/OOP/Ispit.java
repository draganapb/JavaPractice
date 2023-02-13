package OOP;

public class Ispit {
    //Klasa Ispit ima 2 atributa: naziv ispita i ocena
    //Oba atributa imaju samo getere i pun konstruktor

    private String nazivIspita;
    private int ocena;

    public String getNazivIspita() {
        return nazivIspita;
    }

    public int getOcena() {
        return ocena;
    }

    public Ispit(String nazivIspita, int ocena) {
        this.nazivIspita = nazivIspita;
        this.ocena = ocena;
    }
}
