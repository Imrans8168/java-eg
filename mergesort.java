public class mergesort {

    public static int[] mergeSort(int arr[], int low, int high) {
        if (low == high) { //single element array
            int res[] = new int[1];
            res[0] = arr[low];
            return res;
        }
        int mid = (low + high) / 2;
        //faith
        int arr1[] = mergeSort(arr, low, mid); //return an integer array
        int arr2[] = mergeSort(arr, mid + 1, high);
        int[] res = merge(arr1, arr2);
        return res;
    }
 
    public static int[] merge(int a[], int b[]) {
        int[] res = new int[a.length + b.length]; // result[] = a[] + b []
        int i = 0, j = 0, k = 0;
 
        while (i < a.length && j < b.length) {  //both the arrays are there and anyone of the arrays are finished we will do something else
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
 
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        int arr1[] = {5,2,3,1,4};
        display(mergeSort(arr1, 0, arr1.length - 1));
    }
 }
    

