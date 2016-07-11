/**
 * Created by abin on 11/7/16.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Changed to Lynda**/

public class saub {
    public static void main(String[] args){
//        dosome();
        String s1= getin("Enter the first value: ");
        String s2= getin("Enter the second value: ");
        String s3= getin("Enter the operation: ");
        System.out.println(s1 + s3 + s2);



    }
//    private static void dosome(){
//        System.out.println("Hai here");
//        int no=10;
//        for (int i = 0; i < no ; i++) {
//            System.out.println("No is " + i);
//        }
//    }
    private static String getin(String the){
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print(the);
        System.out.flush();
        try {
            return stdin.readLine();
        }
        catch (Exception e) {
            return "Error" + e.getMessage();
        }

    }

    private static void calculate(){

    }

}
