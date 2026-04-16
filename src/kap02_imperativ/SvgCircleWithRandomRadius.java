//2.2.4 - 2.7
import java.util.Locale;

public class SvgCircleWithRandomRadius {
    public static void main(String[] args) {

        int x = 100;
        int y = 110;
        double r = Math.random() * 10 + 10;

        System.out.printf("<svg height = \"400\" width = \"1000\">\n"
                        + "<circle cx = \" %d \" cy = \" %d \" r = \" %.2f \" />\n"
                        + "</svg\n%n",
                        x, y, r);

        System.out.printf(Locale.ENGLISH, "<svg height = \"400\" width = \"1000\">\n"
                        + "<circle cx = \" %d \" cy = \" %d \" r = \" %.2f \" />\n"
                        + "</svg\n%n",
                        x, y, r);
    }
}
