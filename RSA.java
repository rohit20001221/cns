import java.util.Scanner;

public class RSA {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Integer p, q, n;

        System.out.print("Enter p (prime number): ");
        p = sc.nextInt();

        System.out.print("Enter q (prime number): ");
        q = sc.nextInt();

        n = p * q;

        System.out.println("n: " + n);

        Integer e = null, z, d;

        z = (p-1) * (q -1);

        for(int i=2; i <= z; i++){
            if(i % 2 != 0){
                e = i;
            }
        }

        System.out.println("Public key: (" + n + "," + e + ")");

        Integer k = 1;

        while(true){
            Integer pi = (z * k) + 1;

            if (pi % e == 0){
                d = (pi / e);

                break;
            }

            k++;
        }

        System.out.println("Private key: (" + d + "," + e + ")");
    }
}