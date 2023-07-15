// Klasse Programmiersprache
public class Programmiersprache {
    // Feld: Name
    // Der Name ist final, da er sich nicht ändert
    private final String name;
    // Feld: Erfinder
    // Der Erfinder ist final, da er sich nicht ändert
    private final String erfinder;

    // Hauptkonstruktor
    public Programmiersprache(String name, String erfinder) {
        // Initialisiere Feld name
        this.name = name;
        // Initialisiere Feld erfinder
        this.erfinder = erfinder;
    }

    // Standardkonstruktor
    public Programmiersprache() {
        // Setze Felder auf leere Zeichenketten
        this.name = "";
        this.erfinder = "";
    }

    // Methode zur Ausgabe von Informationen
    public void printInfo() {
        // Ausgabe: Name
        System.out.println("Name: " + name);
        // Ausgabe: Erfinder
        System.out.println("Erfinder: " + erfinder);
    }
}