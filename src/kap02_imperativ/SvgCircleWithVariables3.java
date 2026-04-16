//2.2.1 - 2.6
public class SvgCircleWithVariables3 {
    public static void main(String[] args) {

        int x = 100;
        int y = 110;
        double r = 20.5;

        System.out.printf("<svg height = \"400\" width = \"1000\">\n"
                        + "<circle cx = \" %d \" cy = \" %d \" r = \" %s \" />\n"
                        + "</svg",
                        x, y, r);
    }
}
