
public class RunningExample {
	public static void main(String[] args) {
		int[] arr = { 823, 124, 999, 331, 723 };

		RadixSortQueue rsq = new RadixSortQueue();
		//RadixSortRC rsrc = new RadixSortRC();

		int intArr[] = rsq.sort(arr);
		//int intArrRC[] = rsrc.sort(arr);
		//System.out.println(intArr.toString());

		// System.out.println(intArrRC);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(intArr[i]);
			//System.out.println(intArrRC[i]);
		}

	}

}
