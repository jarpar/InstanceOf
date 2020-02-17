package pkginstanceof;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Jarosław", "Partyka", 1_000_000D);
        osoba[1] = new Student("AAndrzej", "ATestowy");
        osoba[2] = new Pracownik("BAndrzej", "BTestowy", 9999D);
        osoba[3] = new Student("CAndrzej", "CTestowy");

        for (Osoba person : osoba) {
            //try {
            if (person instanceof Pracownik) {
                person.pobierzOpis();
                ((Pracownik) (person)).pracuj();
                System.out.println();
            } else if (person instanceof Student) {
                ((Student) (person)).pobierzOpis();
                System.out.println();
            }
            //break;//catch (Exception e) {
            //continue;
            //}
        }
//        osoba[0].pobierzOpis();
//        System.out.println();
//        osoba[1].pobierzOpis();
    }
}
