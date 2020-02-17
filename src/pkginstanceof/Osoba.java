package pkginstanceof;

abstract class Osoba {
    String imię;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imię = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();
}
