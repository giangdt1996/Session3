import java.util.Scanner;

public class CheckSNT{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = input.nextInt();

        int count = 0; // Đếm số lượng số nguyên tố đã in ra
        int N = 2; // Giá trị ban đầu để kiểm tra

        System.out.println(numbers + " số nguyên tố đầu tiên là:");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

        input.close();
    }

    // Kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Kiểm tra số nguyên tố bằng cách kiểm tra chia hết cho các số từ 2 đến (number - 1)
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
