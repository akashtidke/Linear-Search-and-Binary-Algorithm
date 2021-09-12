public class searchInRange {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int num=1;
        int fr=2;
        int lr=6;
        int ans=Inrange(arr,num,fr,lr);
        System.out.println(ans);
    }
    static int Inrange(int []arr,int num,int fr,int lr){
        if(arr.length==0){
            return -1;
        }
        for (int i = fr; i <=lr ; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
