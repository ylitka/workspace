package homework2;

public class arrayAverage {

	public static void main(String[] args) {
		int[] mas = { 3, 7, 45, 23, 7, 88, 23 };
System.out.println(masAverage(mas));
	}

	public static int masAverage(int[] mas) {
		int result = 0;
		for (int i : mas) {
			result += i;
		}
		return result / mas.length;

	}
	
}
