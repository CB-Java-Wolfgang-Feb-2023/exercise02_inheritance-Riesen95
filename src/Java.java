// Klasse Java erweitert Programmiersprache
public class Java extends Programmiersprache {
    // Feld: Plattformunabhängig
    private boolean istPlattformUnabhängig;

    // Hauptkonstruktor
    public Java(String name, String erfinder, boolean istPlattformUnabhängig) {
        // Aufruf Hauptkonstruktor Superklasse
        super(name, erfinder);
        // Initialisiere Feld
        this.istPlattformUnabhängig = istPlattformUnabhängig;
    }

    // Standardkonstruktor
    public Java() {
        // Aufruf Hauptkonstruktor mit Default-Werten
        super("Java", "James Gosling");
        // Setze Feld auf true
        this.istPlattformUnabhängig = true;
    }

    // Überschreibt printInfo der Superklasse
    @Override
    public void printInfo() {
        // Ruft Methode der Superklasse auf
        super.printInfo();
        // Zusätzliche Ausgabe
        System.out.println("Ist plattformunabhängig: " + (istPlattformUnabhängig ? "Ja" : "Nein"));
    }
}