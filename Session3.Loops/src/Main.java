import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // Loop
//        // Vong lap for...i
//        for (int i = 0; i <10;i++){
//            System.out.println("gia tri cua i la"+i);
//        }
//        // Array - Collection
//        int[] arr = {1,2,3,4,5};
//        for (int number: arr){
//            System.out.println("numer" +number);
//        }
//        // Vong lap while
//        int so = 0;
//        boolean check = true;
//        while (check){
//            System.out.println("Vong lap van hoat dong");
//            if(so>=10){
//                check = false;
//            }
//            so++;
//        }
        Scanner sc = new Scanner(System.in);
//        // do...while
//        int number = 0
//        do{
//            System.out.println("Hay nhap vao 1 so tu nhien");
//             number = Integer.parseInt(sc.nextLine());
//            System.out.println("So ban vua nhap la "+ number);
//        }while(number!=0);
//        //break/continue


        //kiem tra so nguyen to
        System.out.println("nhap vao so ban can kiem tra");
        int snt = Integer.parseInt(sc.nextLine());
        boolean flag = true;if(snt<2){
            flag = false;
        }

        for (int i = 2; i < snt; i++) {
            if (snt % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(snt + " la so nguyen to");
        } else {
            System.out.println("So " + snt + " khong phai so nguyen to");
        }
    }
}