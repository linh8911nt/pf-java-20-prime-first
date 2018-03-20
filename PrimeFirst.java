import java.util.Scanner;

public class PrimeFirst {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int N = 2;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên tố cần in: ");
        number = input.nextInt();

        while (count < number){
            boolean check = true;
            for (int i = 2;i <= Math.sqrt(N); i++){
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(" " + N);
                count++;
            }
            N++;

        }

    }
}
