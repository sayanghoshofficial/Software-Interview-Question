/* "String Compression Algorithm” or “Run Length Encoding” happens when you compress a string, and the consecutive duplicates of each string are replaced with the character, followed by the consecutive, repeated character count.

For example:

After string compression, the string “aaaabbcddddd” would return “a4b2c1d5”.*/
import java.util.Scanner;
class stringCompression {
    public static String expandString(String str){
        //if the string value is null
        if(str == null){
            return null;
        }
        //if the string length is less than 1
        if(str.length() <= 1){
            return str;
        }
        // fetch string length
        int n = str.length();
        String ans = "";
        int count = 0;
        char currChar ;
        int i;
        for(i = 0; i< n-1; i=i+2){
            //fetch the first charecter
            currChar = str.charAt(i);
            //convert the string number to integer
            count = str.charAt(i+1) - '0';
            while(count > 0){
                //create the answer
                ans = ans + currChar;
                count--;
            }
        }
        // retirn answer
        return ans;
    }
    public static String compressString(String str){
        //if the string value is null
        if(str == null){
            return null;
        }
        //if the string length is less than 1
        if(str.length() <= 1){
            return str;
        }
        // fetch string length
        int n = str.length();
        String ans = "";
        int count = 0;
        char currChar ;
        int i,j;
        //triverse the string
        for(i = 0; i < n; ++i){
            //fetch the charrecter
            currChar = str.charAt(i);
            count = 0;
            for(j = i ; j < n ; ++j){
                //if the string is repeted
                if(currChar == str.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            //create the answer
            ans = ans + currChar + String.valueOf(count);
            //change the value of i
            i = j -1;
            
        }
        //return answer
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string input: ");
        //take  String input
        String str = sc.next();
        //compress the String
        String ans1 = compressString(str);
        System.out.println("String after compression: "+ans1);
        //expand the String
        String ans2 = expandString(str);
        System.out.println("String after expenssion: "+ans2);
    }
}