package pkginstanceof;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Jarosław", "Partyka", 1_000_000D);
        osoba[1] = new Student("Andrzej", "Testowy");

        for (int i = 0; i < osoba.length; i++) {
            //try {
            if (osoba[i] instanceof Osoba) {
                osoba[i].pobierzOpis();
                System.out.println();
            } //catch (Exception e) {
            //continue;
            //}
        }
//        osoba[0].pobierzOpis();
//        System.out.println();
//        osoba[1].pobierzOpis();
    }
}
