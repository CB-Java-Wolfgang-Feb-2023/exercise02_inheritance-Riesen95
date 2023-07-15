// Klasse JavaScript erweitert Programmiersprache
public class JavaScript extends Programmiersprache {
    // Feld: Dynamisch getypt
    // wird sich nicht ändern, daher final
    private final boolean istDynamischGetypt;

    // Hauptkonstruktor
    public JavaScript(String name, String erfinder, boolean istDynamischGetypt) {
        // Aufruf Hauptkonstruktor Superklasse
        super(name, erfinder);
        // Initialisiere Feld
        this.istDynamischGetypt = istDynamischGetypt;
    }

    // Standardkonstruktor
    public JavaScript() {
        // Aufruf Hauptkonstruktor mit Default-Werten
        super("JavaScript", "Brendan Eich");
        // Setze Feld auf true
        this.istDynamischGetypt = true;
    }

    // Überschreibt printInfo der Superklasse
    @Override
    public void printInfo() {
        // Ruft Methode der Superklasse auf
        super.printInfo();
        // Zusätzliche Ausgabe
        System.out.println("Ist dynamisch getypt: " + (istDynamischGetypt ? "Ja" : "Nein"));
    }
}