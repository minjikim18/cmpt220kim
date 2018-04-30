import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Create new arrayList and prompt user to enter ten numbers to sort
		ArrayList<Number> arrayList = new ArrayList<>();
		System.out.println("Enter ten numbers to sort: ");
		for (int i = 0; i < 10; i ++)
			arrayList.add(input.nextInt());
		
		// Sort array
		sort(arrayList);
		
		// Print?
		
	}

	// Method to sort the array
	private static void sort(ArrayList<Number> arrayList) {
		for (int i = 0; i < arrayList.size() - 1; i++) {
			Number minimum = arrayList.get(i);
			int index = i;
			
			for (int j = i + 1; j < arrayList.size(); j++)  { // JA
				if (minimum.doubleValue() > arrayList.get(j).doubleValue()) {
                    minimum = arrayList.get(j);
                    index = j;
                }
            }
			if (minimum.doubleValue() != i) {
				arrayList.set(index, arrayList.get(i));
				arrayList.set(i, minimum);
			}
		}
	}

}
	
