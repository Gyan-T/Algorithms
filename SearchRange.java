import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr={5,5,5,5,5,5,5,5,5,9,9,9,9};
        int target=5;
        System.out.println(Arrays.toString(search1(arr,target)));
   }
    static int[] search1(int[] arr,int target) {
        int[] a={-1,-1};
        a[0]=search2(arr,target,true);
        if (a[0]!=-1){
            a[1]=search2(arr,target,false);
        }
                return a;
    }
    static int search2(int[] arr,int target,boolean findstart){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                ans=mid;
                if(findstart){
                    end=mid-1;
                }
                else{start=mid+1;}
            }
        }
        return ans;
    }

}
