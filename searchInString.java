import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str="akash";
      char ch='z';
        System.out.println(searchString(str,ch));
    }
    static boolean searchString(String str,char ch){

        for (int i = 0; i <str.length() ; i++) {
            if(ch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
