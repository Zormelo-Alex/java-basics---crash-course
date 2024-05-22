import java.util.Scanner;

public class Main {
    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //taking inputs

//        System.out.println("Please enter your age \n");
//        int age = scanner.nextInt();
//
        // flow control

//        if(age <= 17){
//            System.out.println("Sorry, you need to be 18 or above to use this system");
//        }else{
//            System.out.println("Hello, Welcome");
//        }
//        switch (age){
//            case 17 -> {
//                System.out.println("Sorry, you need to be 18 or above");
//            }
//            default -> {
//                System.out.println("Hello, welcome");
//            }
//        }

        // loops

//        for(int i=0; i <= 10; i++){
//            System.out.println("i = " + i);
//        }

        int i = 0;
//        while(i < 50){
//            System.out.println("i = " + i);
//            i++;
//        }
        do{
            System.out.println("i = " + i);
            i++;
        }while (i < 50);
    }
}