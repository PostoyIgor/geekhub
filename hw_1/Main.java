package hw_1;


import java.util.Scanner;

public class Main {
    static int NumberReader(Scanner scanner, int min, int max){
        System.out.println("Enter number from " + min + " to " + max);
        String line = scanner.next();
        int data = 0;
        try {
            data = Integer.parseInt(line);
        }catch (NumberFormatException e){
            System.out.println("Wrong data");
            return NumberReader(scanner, min, max);
        }
        if (data>=min && data<=max){
            return data;
        }else {
            System.out.println("Wrong number");
            return NumberReader(scanner, min, max);
        }
    }

    static void start(Scanner scanner){

        System.out.println("1 - Factorial");
        System.out.println("2 - Fibonachi");
        System.out.println("3 - Print Number");
        System.out.println("0 - Exit");

        int selectedItem = NumberReader(scanner, 0, 3);
        int num;
        switch (selectedItem){
            case 0:
                scanner.close();
                System.exit(0);
            case 1:
                num = NumberReader(scanner, 0, 13);
                System.out.println(Factorial.factorial(num));
                System.out.println();
                start(scanner);
            case 2:
                num = NumberReader(scanner, 1, 46);
                for (int q: Fibonachi.fibonachi(num)){
                    System.out.print(q + "; ");
                }
                System.out.println();
                System.out.println();
                start(scanner);
            case 3:
                num = NumberReader(scanner, 0, 9);
                PrintNumber.printNumber(num);
                System.out.println();
                start(scanner);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        start(scanner);



    }
}
