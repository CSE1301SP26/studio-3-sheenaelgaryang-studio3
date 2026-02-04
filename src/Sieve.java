<<<<<<< HEAD


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
=======
import java.util.Scanner;
public class Sieve {
    public static void main(String[] Args){
        
        //INITIATE THE EASY STUFF
        Scanner scan = new Scanner(System.in);
        System.out.println("The prime numbers up to what number:");
        boolean Greaterthan = false;
        int n = 0;
        
        //MAKE SURE THEY GIVE YOU A VALID INPUT
        while(!Greaterthan){
            n = scan.nextInt();
            if(n<2){
                System.out.println("Input invalid, Enter new number.");
            }
            else{
                Greaterthan = true;
            }
        }
       
        //CREATE ARRAY WITH VALID INPUT
        Boolean[] isPrime = new Boolean[n+1];

        //ASSUME EVERY NUMBER IS TRUE PRIME
        for(int i = 2; i<=n;i++){
            isPrime[i] = true;
        }

       
        //START AT 2; 2 IS FIRST INDEXED PRIME
        //ITERATE THROUGH ALL THE NUMBER IN THE SEQUENCE IF A NUMBER IS A MULTIPLE OF A NUMBER ITS FALSE
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        } 
        
        //PRINT OUT ALL NUMBERS THAT ARE TRUE 
        //THIS IS WHY WE HAVE THE LARGER INDEXING RANGE SO WE CAN START AT 2
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }


    }
}
>>>>>>> 24c5c7cb2c80fd28df80f6b82c3ca325f7db1597
