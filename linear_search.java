import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scn.nextInt();
        }
        int d= scn.nextInt();
        int ans=linearSearch(arr,d);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr,int d){
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==d){
                ans=i;

            }
        }
        return ans;
    }

}
