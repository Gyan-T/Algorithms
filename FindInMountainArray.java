public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,7,6,5,3,2,1};
        int target = 3;
        System.out.println(BSasc(arr,target));
        System.out.println(peakindex(arr));
        System.out.println(findInMountainArray(target,arr));
       }
       static int findInMountainArray(int target, int[] mountainArr) {
            if(BSasc(mountainArr,target)==-1)
            {
                return BSdsc(mountainArr,target);
            }
            return (BSasc(mountainArr,target));
        }
        static int peakindex(int[] mountainArr){
            int start=0;
            int end=mountainArr.length-1;
            while(start<end){
                int mid=start+(end - start)/2;
                if(mountainArr[mid]>mountainArr[mid+1]){
                    end=mid;
                }
                else{
                    start=mid+1;
                }
            }
            return end;
        }
       static int BSasc(int[] mountainArr,int target){
            int start=0;
            int end=peakindex(mountainArr);
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<mountainArr[mid]){
                    end=mid-1;
                }
                else if(target>mountainArr[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        static int BSdsc(int[] mountainArr,int target){
            int start=peakindex(mountainArr)+1;
            int end=mountainArr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target>mountainArr[mid]){
                    end=mid-1;
                }
                else if(target<mountainArr[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }

    }
