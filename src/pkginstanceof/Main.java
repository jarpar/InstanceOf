package pkginstanceof;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Jarosław", "Partyka", 1_000_000);
        osoba[1] = new Student("Andrzej", "Testowy");
    }
}

abstract class Osoba {
    String imię;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imię = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();
}

class Pracownik extends Osoba {
    double wynagrodzenie;

    Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię: " + imię);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
    }
}

class Student extends Osoba {
    Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem studentem");
        System.out.println("Imię: " + imię);
        System.out.println("Nazwisko: " + nazwisko);
    }
}