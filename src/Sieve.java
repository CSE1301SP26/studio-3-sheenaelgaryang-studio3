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
