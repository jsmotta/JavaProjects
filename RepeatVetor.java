import java.util.Scanner;
public class RepeatVetor{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int insert = 0;
        int[] vector = new int[1000];

        System.out.println("Insert a interger number: ");
        insert = sc.nextInt();
    
        for(int i=0; i<=vector.length; i++){
            for(int n=0; n<=insert; n++){
                System.out.println("vector["+i+"]"+" = "+n);
            }
        }
    }
}