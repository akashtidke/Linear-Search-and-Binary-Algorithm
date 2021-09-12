public class findMinN0 {
    public static void main(String[] args) {
        int[]arr={1,2,3,0,6,5,7,-1};
        int ans=minx(arr);
        System.out.println(ans);
    }
    static int minx(int arr[]){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
