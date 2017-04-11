
public class IntArrayMaster {

    private IntArrayMaster() {

    }

    public static int findMissing(int[] A) {
        mergeSort(A);
        int k = 0;
        while (k != A.length) {
            for (int i = 0; i < A.length; i++) {
                if (k == A[i]) {
                    k++;
                } else {
                    break;
                }
            }
            break;
        }
        return k;
    }

    public static int findKth(int[] A, int k) {
        int[] temp = A;
        mergeSort(temp);
        int t = temp.length - 1;
        return temp[t - k];
    }

    public static void selectionSort(int[] A) {
        int min, temp;
        int n = A.length;
        for(int i = 0; i < n - 1; i++) {
            min = i;
            for(int j = i + 1; j < n; j++) {
                if(A[j] < A[min])
                    min = j;
            }
            if(min != i){
                    temp = A[i];
                    A[i] = A[min];
                    A[min] = temp;
                }
        }   
    }

    public static void mergeSort(int[] A) {
        if (A == null || A.length == 0) {
            return;
        }
        mergeSort(A, 0, A.length);

    }

    public static void mergeSort(int[] A, int x, int y) {
        int n = y - x;
        if (n <= 1) {
            return;
        }
        int mid = x + n / 2;
        // recursively sort 
        mergeSort(A, x, mid);
        mergeSort(A, mid, y);
        // merge two sorted subarrays
        int[] temp = new int[n];
        int i = x, j = mid;
        for (int k = 0; k < n; k++) {
            if (i == mid)  
                temp[k] = A[j++];
            else if (j == y) 
                temp[k] = A[i++];
            else if (A[j] < A[i]) 
                temp[k] = A[j++];
            else 
                temp[k] = A[i++];
        }    
        for (int k = 0; k < n; k++) {
            A[x + k] = temp[k];
        }
    }
    
    public static void main(String[] args) {
        int[] a = {1,9,6,3,5};
        System.out.println(findKth(a, 1));
    }
    
}
