package OOP;

import java.util.ArrayList;

public class Student {
   // Klasa Student ima private atribute: ime, broj indexa, prosek i listu ispita.
   // U konstruktoru proslediti parametre imena i indexa.
    //U klasi je potrebno napraviti metode za racunanje proseka i metodu za stampu
//----------
   private String ime;
   private int brojIneksa;
   private double prosek;
   private ArrayList<Ispit>listaIspita;

    public Student(String ime, int brojIneksa) {
        this.ime = ime;
        this.brojIneksa = brojIneksa;
        this.prosek = prosek;
        this.listaIspita = new ArrayList<Ispit>();
    }
 public void dodavanjeIspita(Ispit ispit){
        this.listaIspita.add(ispit);
    }

    public int getBrojIneksa() {
        return brojIneksa;
    }

    public double getProsek() {
        return prosek;
    }

    public String getIme() {
        return ime;
    }

    public ArrayList<Ispit> getListaIspita() {
        return listaIspita;
    }

    public double racunanjeProseka(){
        double suma = 0;
        int brojac = 0;
        for(int i = 0; i<this.listaIspita.size(); i++){
            suma = suma +listaIspita.get(i).getOcena();
            brojac = brojac + 1;
        }
        this.prosek = suma/brojac;
        System.out.println("Student ima " + brojac + " polozena ispita sa prosekom " + prosek);
        return this.prosek;
    }
    public void stampa(){
        System.out.println(this.ime + " sa brojem indeksa " + this.brojIneksa);
        racunanjeProseka();

        for(int i = 0; i<listaIspita.size(); i++){
            System.out.print("Polozen ispit: ");
            System.out.println(listaIspita.get(i).getNazivIspita());
        }


            }
        }



