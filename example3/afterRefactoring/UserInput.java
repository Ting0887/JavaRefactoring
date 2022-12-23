import java.util.Scanner;
import java.util.stream.IntStream;

public class UserInput {
	public void coordinate(Scanner input) {
		// 讀取使用者輸入的三角形座標
        double[] coordinates = IntStream.range(0, 6)
            .mapToDouble(i -> {
                System.out.print("Enter number for x" + (i / 2 + 1) + ": ");
                return input.nextDouble();
            })
            .toArray();

        // 使用lambda表達式將座標傳遞給計算面積的方法
        new Calculate().triangleArea(coordinates[0], coordinates[1], coordinates[2], 
        							 coordinates[3], coordinates[4], coordinates[5]);
	}
}
