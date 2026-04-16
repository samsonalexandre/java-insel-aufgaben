// 2.1.1 Seite 38


import java.awt.*;

public class Bildschirmausgaben {
    public static void main(String[] args) {

        System.out.println("Bitte gib Werte für \"X\"");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte gib Werte für \"Y\"");
        int y = new java.util.Scanner(System.in).nextInt();
        //double r = (Math.random()) * 11 + 10;
        double r = java.util.concurrent.ThreadLocalRandom.current().nextDouble(10, 20);
        System.out.println(r);

        System.out.println("<svg height=\"400\" width=\"1000\"><circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" /></svg>");
    }
}