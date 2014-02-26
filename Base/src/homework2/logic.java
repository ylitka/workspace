package homework2;

public class logic {

	{
	}

	public static int[] genArray(int size) {
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = i + 2;
		}
		return mas;
	}

	public static int[] genMasRandom(int size) {
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10);
		}
		return mas;
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int[] masMasOdd(int size) {
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			int n = (int) (Math.random() * 10);
			if (n % 2 == 1) {
				mas[i] = n;
			} else {
				mas[i] = n + 1;
			}
		}
		return mas;
	}

	public static void masMinimum(int[] mas) {
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}

		}
		System.out.println("min element: " + min);
	}

	public static int masMinimumReturn(int[] mas) {
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}
		return min;
	}

	public static void masMaximum(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}

		}
		System.out.println("max element: " + max);
	}

	public static int masMaximumReturn(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}

		}
		return max;
	}

	public static void masNumber(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 5) {
				count = count + 1;
			}
		}
	}

	public static int findNumberInMass(int[] mas, int needFind) {
		for (int i = 0; i < mas.length; i++) {
			if (needFind == mas[i]) {
				return i;
			}
		}

		return 0;

	}

}
