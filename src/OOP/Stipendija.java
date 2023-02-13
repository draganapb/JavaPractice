package OOP;

public class Stipendija extends Student{
    //Klasa Stipendija nasledjuje klasu Student i ima metodu za racunanje stipendije i stampe
// Studenti koji imaju prosek preko 8.55 i nemaju nijednu
//sesticu (6) ocenu mogu da imaju stipendiju
    public Stipendija(String ime, int brojIneksa) {
        super(ime, brojIneksa);
        }

        public void racunjanjeStipendije(Student s1){
        double prosek;
        boolean postojiSestica = false;
         for(int i = 0; i<s1.getListaIspita().size(); i++){

             if(s1.getListaIspita().get(i).getOcena() == 6){
                 postojiSestica = true;

             }
         }

         prosek = s1.racunanjeProseka();
         if(prosek < 8.55 && postojiSestica){
             System.out.println(this.getIme() + this.getBrojIneksa() + "nema pravo na stipendiju");
         }
        }

     //  public void stampa(){
    //    super.stampa();


        }


