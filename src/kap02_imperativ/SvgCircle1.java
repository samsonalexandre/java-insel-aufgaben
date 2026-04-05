// 2.1.1 Seite 38

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class SvgCircle1 {
    public static void main(String[] args) {
        String content = "<svg xmlns='http://www.w3.org/2000/svg' height='400' width='1000'>" +
                "<circle cx='100' cy='100' r='50' fill='red' />" +
                "</svg>";

        try {
            // Schreibt den String direkt in eine Datei namens "kreis.svg"
            Files.write(Paths.get("kreis.svg"), content.getBytes());
            System.out.println("Datei 'kreis.svg' wurde erfolgreich erstellt!");
        } catch (IOException e) {
            System.err.println("Fehler beim Schreiben der Datei: " + e.getMessage());
        }
    }
}