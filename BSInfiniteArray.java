public class BSInfiniteArray {
    public static void main(String[] args) {

        //if we search for some last elements it gives indexoutofbound error,then we have to increase the length of array,
        // since it is an infinite array, we can increase or add the elements as many as we can.

        int[] arr={12,45,65,72,79,81,85,89,90,100,101,102,103,104,105,106,107,108,109,110,120,130,140};
        int target=104;
        System.out.println(Indexrange(arr,target));
    }
    static int Indexrange(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]) {
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{start=mid+1;
            }
        }
        return -1;
    }
}
