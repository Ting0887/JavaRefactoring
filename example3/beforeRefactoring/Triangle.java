import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//輸入(x1,y1)座標
		System.out.print("Enter number for x1 : ");
		double x1 = input.nextDouble();
		System.out.print("Enter number for y1 : ");
		double y1 = input.nextDouble();
		
		//輸入(x2,y2)座標
		System.out.print("Enter number for x2 : ");
		double x2 = input.nextDouble();
		System.out.print("Enter number for y2 : ");
		double y2 = input.nextDouble();
		
		//輸入(x3,y3)座標
		System.out.print("Enter number for x3 : ");
		double x3 = input.nextDouble();
		System.out.print("Enter number for y3 : ");
		double y3 = input.nextDouble();
		
		//計算三角形面積
		calculateArea(x1, y1, x2, y2, x3, y3);		
	}
	public static void calculateArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		// 計算 side1
        double a1 = ( x2 - x1 ) * ( x2 - x1 );
        double a2 = ( y2 - y1 ) * ( y2 - y1 );
        double a3 = a1 + a2;
        double side1 = (Math.pow( a3 , 0.5 ));

        // 計算 side2
        double b1 = ( x3 - x2 ) * ( x3 - x2 );
        double b2 = ( y3 - y2 ) * ( y3 - y2 );
        double b3 = b1 + b2;
        double side2 = (Math.pow( b3 , 0.5 ));

        // 計算 side3
        double c1 = ( x1 - x3 ) * ( x1 - x3 );
        double c2 = ( y1 - y3 ) * ( y1 - y3 );
        double c3 = c1 + c2;
        double side3 = (Math.pow( c3 , 0.5 ));

        // 計算 S
        double s = ( side1 + side2 + side3 ) / 2;
        // 計算 a,b,c,d
        double a = s - side1;
        double b = s - side2;
        double c = s - side3;
        double d = s * a * b * c;

        //計算 area
        double area = (Math.pow( d , 0.5 ));

        //顯示運算結果
        System.out.printf("(" + x1 + "," + y1 + ") "  + 
			             "(" + x2 + "," + y2 + ") "  +
			             "(" + x3 + "," + y3 + ")"  + 
			             "面積是 : %.2f" ,area ); 
	}
}

