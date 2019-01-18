
/**
 * Write a description of class Mysort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortMethods
{
    public int[] My(int[] y)
    {
        for(int i = y.length; i>0; i--){
            for(int j=1; j<i; j++)    
                if(y[j-1]>y[j]){
                    int temp = y[j-1];
                    y[j-1]=y[j];
                    y[j]=temp;
                }
        }
        return  y;
    }

    public int[] Bubble(int[] y)
    {
        for(int i = y.length; i>0; i--){
            for(int j=1; j<i; j++)    
                if(y[j-1]>y[j]){
                    int temp = y[j-1];
                    y[j-1]=y[j];
                    y[j]=temp;
                }
        }
        return  y;
    }

    public int[] Selection(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            int index =i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[index]){
                    int temp = arr[j];
                    arr[j]=arr[index];
                    arr[index]=temp;
                }
            }
        }
        return arr;
    }

    public int[] Insertion(int[] arr){
        int temp;
        for(int  i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] mergeSort(int[] a,int n) {
        
        if (n < 2) {return a;} //  Base Case
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
        return a;
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left) { a[k++] = l[i++];}
        while (j < right) {a[k++] = r[j++];}
    }

}
