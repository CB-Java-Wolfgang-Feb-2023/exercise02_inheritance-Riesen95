// Klasse CSharp erweitert Programmiersprache
public class CSharp extends Programmiersprache {
    // Feld: statisch getypt
    // wieso final und nicht private?
    // final: Wert kann nicht geändert werden
    private final boolean istStatischGetypt;

    // Hauptkonstruktor
    public CSharp(String name, String erfinder, boolean istStatischGetypt) {
        // Aufruf Hauptkonstruktor Superklasse
        super(name, erfinder);
        // Initialisiere Feld
        this.istStatischGetypt = istStatischGetypt;
    }

    // Standardkonstruktor
    public CSharp() {
        // Aufruf Hauptkonstruktor mit Default-Werten
        super("C#", "Anders Hejlsberg");
        // Setze Feld auf true
        this.istStatischGetypt = true;
    }

    // Überschreibt printInfo der Superklasse
    @Override
    public void printInfo() {
        // Ruft Methode der Superklasse auf
        super.printInfo();
        // Zusätzliche Ausgabe
        System.out.println("Ist statisch getypt: " + (istStatischGetypt ? "Ja" : "Nein"));
    }
}