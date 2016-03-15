package slipp.net.hackersrank.third.kdk;

import java.util.Scanner;

/**
 * <p>This class is a solve of the
 * <a href="https://www.hackerrank.com/challenges/java-if-else">
 * Java If-Else</a>.
 *
 * @author Daekwon Kang
 * @see Scanner
 * @since 2016-03-15
 */
public class JavaIfElse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
                if ((n >= 2 && n <= 5) || n > 20) {
                    ans = "Not Weird";
                } else if (n >= 6 && n <= 20) {
                    ans = "Weird";
                }

            }
            System.out.println(ans);
            
        }
    }

