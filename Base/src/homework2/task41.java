package homework2;

import java.util.Scanner;
import homework2.logic;

public class task41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер массива: ");
		int size = sc.nextInt();
		sc.close();
		int[] mas = logic.genMasRandom(size);
		logic.printArray(mas);
		int a = mas[1];
		int b = mas[2];
		a = a + b;
		b = a - b;
		a = a - b;
		mas[1] = a;
		mas[2] = b;
		logic.printArray(mas);
		logic.masMinimum(mas);
		logic.masMaximum(mas);
		// находим крайние значения
		int c = logic.masMaximumReturn(mas);
		int c1 = logic.masMinimumReturn(mas);

		c = c + c1;
		c1 = c - c1;
		c = c - c1;

		// находим позиции крайних значений
		int f = logic.findNumberInMass(mas, c);
		int f1 = logic.findNumberInMass(mas, c1);
		System.out.println("Позиция минимального значения в массиве: " + f);
		System.out.println("Позиция максимального значения в массиве: " + f1);

		// меняем крайние значения местами
		int g = mas[f];
		int g1 = mas[f1];
		g = g + g1;
		g1 = g - g1;
		g = g - g1;
		mas[f] = g;
		mas[f1] = g1;
		System.out.println("Максимальное значение массива: " + g);
		System.out.println("Минимальное значение массива: " + g1);
		logic.printArray(mas);
	}
}
