// Klasse Main
public class Main {
    // Hauptmethode
    public static void main(String[] args) {
        // Java-Objekt erstellt
        Programmiersprache java = new Java();
        // CSharp-Objekt erstellt
        Programmiersprache csharp = new CSharp();
        // JavaScript-Objekt erstellt
        Programmiersprache javascript = new JavaScript();
        // Python-Objekt erstellt
        Programmiersprache python = new Python();

        // Info Java ausgeben
        java.printInfo();
        // Leerzeile
        System.out.println();

        // Info CSharp ausgeben
        csharp.printInfo();
        // Leerzeile
        System.out.println();

        // Info JavaScript ausgeben
        javascript.printInfo();
        // Leerzeile
        System.out.println();

        // Info Python ausgeben
        python.printInfo();
        // Leerzeile
        System.out.println();

        // Polymorphismus-Beispiel
        Programmiersprache csharpPolymorphismus = new CSharp();
        // Info CSharp ausgeben
        csharpPolymorphismus.printInfo();
    }
}