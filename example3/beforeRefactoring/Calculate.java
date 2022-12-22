
public class Calculate{
	private double x1, y1, x2, y2, x3, y3;
	public static void triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		// 計算 side
        double side1 = TriangleSide(x1, x2, y1, y2);
        double side2 = TriangleSide(x3, x2, y3, y2);
        double side3 = TriangleSide(x1, x3, y1, y3);

        // 計算 s
        double s = S(side1, side2, side3);

        //計算 area
        double area = Math.pow( s, 0.5 );
        new PrintArea().triangle(area, x1, y1, x2, y2, x3, y3);
	}
	
	public static double TriangleSide(double x1, double x2, double y1, double y2){
		return Math.hypot(x1-x2, y1-y2);
	}
	
	public static double S(double side1, double side2, double side3) {
        double s = ( side1 + side2 + side3 ) / 2;
        return s*(s-side1)*(s-side2)*(s-side3);
	}
}
