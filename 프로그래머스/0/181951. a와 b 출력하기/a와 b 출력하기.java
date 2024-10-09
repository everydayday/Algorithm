import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException{
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] params = br.readLine().split(" "); 
        bw.write("a = " + params[0] + "\n");
        bw.write("b = " + params[1]);
        
        bw.flush();
        bw.close();
        br.close();
        
        
        
    }
}