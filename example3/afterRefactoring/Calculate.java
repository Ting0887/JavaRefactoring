public class Calculate {
	private double x1, y1, x2, y2, x3, y3;

	public static void triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {

		double side1 = triangleSide(x1, x2, y1, y2);
     	double side2 = triangleSide(x2, x3, y2, y3);
   		double side3 = triangleSide(x1, x3, y1, y3);
        
   		double s = S(side1, side2, side3);

        //計算 area
        double area = Math.pow(s , 0.5);

        PrintArea printArea = new PrintArea();
        printArea.triangle(x1, y1, x2, y2, x3, y3, area);
	}
	// 計算 side，使用hypot可以方便計算
	public static double triangleSide(double x1, double x2, double y1, double y2) {
		return Math.hypot(x1-x2, y1-y2);
	}
	//  計算 s
	public static double S(double side1, double side2, double side3) {
        double s = (side1+side2+side3)/2;
        return s*(s-side1)*(s-side2)*(s-side3);
	}
}
