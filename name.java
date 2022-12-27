import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class name {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        String name = br.readLine();
        n = n*2;
        System.out.println (n);    // Writing output to STDOUT
                        // Reading input from STDIN
        System.out.println (name);    // Writing output to STDOUT
    }
}
