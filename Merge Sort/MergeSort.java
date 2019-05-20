public class MergeSort{

	int[] sort(int[] arr, int left, int right){

		int left = 0;
		if(arr.length % 2 == 0){ 
			int middle = arr/2;
		}else{
			int middle = (arr/2)+1;
		}

		int right = arr.length - 1;

		if(arr.length == 2){
			if (arr[left] > arr[right]){
				int temp = arr[right];
				arr[left] = arr[right];
				arr[right] = temp;
				return 0;
			}
		}

		sort(arr, left, middle);
		sort(arr, middle, right);
	}


	int[] divide(int[] arr){
		int length = arr.length;

		int[] left = new int[arr.length/2];
		for (int i=0;i<arr.length/2;i++) {
			left[i] = arr[i];
		}

		for (int i=(arr.length/2 + 1);i<length;i++) {
			right[i] = arr[i];
		}

		divide(left);
		divide(right);

		return merge(left, right);
	}

	int[] merge(int[] left, int[] right){
		sort()
		return 
	}


	public static void main(String[] args){
		int [] arr = new int [5];
		for (int i = 4; i >= 0; i--){
			arr[i] = i;
		}

		sort(arr, 0, 5);
	}
}