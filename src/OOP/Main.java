package OOP;

public class Main {
    public static void main(String[] args) {
        /*
Potrebno je napraviti program gde ce se studentima citati koje ispite su polozili,
sa kojom ocenom i kojim prosekom. Studenti koji imaju prosek preko 8.55 i nemaju nijednu
sesticu (6) ocenu mogu da imaju stipendiju
----------
Klasa Ispit ima 2 atributa: naziv ispita i ocena
Oba atributa imaju samo getere i pun konstruktor
----------
Klasa Student ima private atribute: ime, broj indexa, prosek i listu ispita.
U konstruktoru proslediti parametre imena i indexa.
U klasi je potrebno napraviti metode za racunanje proseka i metodu za stampu
----------
Klasa Stipendija nasledjuje klasu Student i ima metodu za racunanje stipendije i stampe
 */
        Ispit ispit1 = new Ispit("matematika", 7);
        Ispit ispit2 = new Ispit("hemija", 8);
        Ispit ispit3 = new Ispit("fizika", 9);
        Ispit ispit4 = new Ispit("fizika2", 6);
        Ispit ispit5 = new Ispit("matematika2", 9);


        Student student1 = new Student("Marko Markovic", 1234);
        student1.dodavanjeIspita(ispit1);
        student1.dodavanjeIspita(ispit2);
        student1.dodavanjeIspita(ispit3);
        student1.racunanjeProseka();
        student1.stampa();

        Student student2 = new Student("Milena Pavlovic", 2345);
        student2.dodavanjeIspita(ispit2);
        student2.dodavanjeIspita(ispit3);
        student2.dodavanjeIspita(ispit5);
        student2.stampa();

        Stipendija stipendija = new Stipendija(student1.getIme(), student1.getBrojIneksa());
        stipendija.racunjanjeStipendije(student2);
        stipendija.racunjanjeStipendije(student1);






    }
}
