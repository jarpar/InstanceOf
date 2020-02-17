package pkginstanceof;

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
    void pracuj(){
        System.out.println("Ja pracuję");
    }
}
