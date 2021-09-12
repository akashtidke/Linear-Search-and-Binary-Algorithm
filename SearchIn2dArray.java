public class SearchIn2dArray {
    public static void main(String[] args) {
        int [][]arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int taraget=10;
        int ans=-1;
        int ans2=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if (arr[i][j]==taraget){
                    ans=i;
                    ans2=j;
                }


            }

        }
        System.out.println(ans+" "+ans2);

    }
}
