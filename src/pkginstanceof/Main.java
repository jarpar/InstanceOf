package pkginstanceof;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Jarosław", "Partyka", 1_000_000);
        osoba[1] = new Student("Andrzej", "Testowy");
    }
}
