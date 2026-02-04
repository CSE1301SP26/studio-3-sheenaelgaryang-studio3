

import java.util.Scanner;


public class Sieve {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = scanner.nextInt();
    boolean [] numbers = new boolean [n+2];
    for (int i = 2; i < n+2; i++) {
            numbers[i] = true;
    }
    // for (boolean b : numbers) {
    //     System.out.println(b);
    // }
    for (int i = 2; i < Math.sqrt(n); i++) {
        if (numbers [i] == true)
        for (int j = i*i; j<=n; j= j+i) {
            numbers [j] = false;

        }
        

    }
    for (int i = 0; i <= n; i++) {
        if (numbers [i] == true){
            System.out.println(i);
        }

    }
    

} 
}   