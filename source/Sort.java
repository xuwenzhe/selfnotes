public class Sort {
	public static void insertionSort(char[] data) {
		for (int i = 1; i < data.length; i++) {
			char tmp = data[i];
			int j;
			for (j = i-1; j >= 0 && data[j] > tmp; j--)
				data[j+1] = data[j];
			data[j+1] = tmp;
		}
	}

	public static void main(String[] arg) {
		char[] data = {'b','c','d','a','e','h','g','f'};
		insertionSort(data);
		System.out.println(new String(data));
	}
}