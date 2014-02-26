package homework2;

public class arrayCopy {
//копируем массивы
	public static void main(String[] args) {
		int[] mas = { 2, 4, 3, 34, 43 };
		int[] mas2 = { 5, 2, 46, 44, 88 };
System.arraycopy(mas, 0, mas2, 0, mas.length);
logic.printArray(mas2);
	}

}
