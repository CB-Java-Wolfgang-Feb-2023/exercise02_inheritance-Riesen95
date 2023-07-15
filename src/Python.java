// Klasse Python erweitert Programmiersprache
public class Python extends Programmiersprache {
    // Feld: unterstützt List Comprehensions
    // final, weil sich der Wert nicht ändert
    private final boolean unterstuetztListComprehensions;

    // Hauptkonstruktor
    public Python(String name, String erfinder, boolean unterstuetztListComprehensions) {
        // Aufruf des Konstruktors der Superklasse
        super(name, erfinder);
        // Initialisiere Feld unterstuetztListComprehensions
        this.unterstuetztListComprehensions = unterstuetztListComprehensions;
    }

    // Standardkonstruktor
    public Python() {
        // Aufruf des Konstruktors der Superklasse mit spezifischen Werten
        super("Python", "Guido van Rossum");
        // Setze unterstuetztListComprehensions auf true
        this.unterstuetztListComprehensions = true;
    }

    // Überschreibt die printInfo()-Methode der Superklasse
    @Override
    public void printInfo() {
        // Aufruf der printInfo()-Methode der Superklasse
        super.printInfo();
        // Ausgabe, ob List Comprehensions unterstützt werden
        System.out.println("Unterstützt List Comprehensions: " + (unterstuetztListComprehensions ? "Ja" : "Nein"));
    }
}