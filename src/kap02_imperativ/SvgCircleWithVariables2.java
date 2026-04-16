//2.2.1 - 2.5
public class SvgCircleWithVariables2 {
    public static void main(String[] args) {

        int x = 100;
        int y = 110;
        double r = 20.5;

        System.out.println("<svg height = \"400\" width = \"1000\">\n"
                + "<circle cx = \"" + x + "\" cy = \"" + y
                + "\" r = \"" + r + "\" />\n" + "</svg");
    }
}
