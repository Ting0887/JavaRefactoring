
public class PrintArea {
	public static void triangle(double x1, double y1, double x2, double y2, double x3,double y3, double area) {
		//顯示運算結果
        System.out.printf("(" + x1 + "," + y1 + ") "  + 
			             "(" + x2 + "," + y2 + ") "  +
			             "(" + x3 + "," + y3 + ")"  + 
			             "面積是 : %.2f" ,area ); 
	}
}
