
public class RunningExample {
	public static void main(String[] args) {
		int[] arr = { 823, 124, 999, 331, 723 };

		RadixSortQueue rsq = new RadixSortQueue();
		RadixSortRC rsrc = new RadixSortRC();
		System.out.print(rsq.sort(arr));
		//System.out.println(rsrc.sort(arr));
		
	}

}
