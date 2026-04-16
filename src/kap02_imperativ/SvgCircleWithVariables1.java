//2.2.1 - 2.4
public class SvgCircleWithVariables1 {
    public static void main(String[] args) {

        int x = 100;
        int y = 110;
        double r = 20.5;

        System.out.println("<svg height = \"400\" width = \"1000\">" );
        System.out.print(" <circle cx = \"" );
        System.out.print( x );
        System.out.print( "\" cy = \"");
        System.out.print( y );
        System.out.print( "\" r = \"" );
        System.out.print( r );
        System.out.println( "\" />" );
        System.out.println( "</svg>" );
    }
}
