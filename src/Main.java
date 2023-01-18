import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double [] numbers2 = {1.57, 7.654, 9.986};

        int [] liberty = {5, 7, 56, 98, 45, 12, 65};

        System.out.println("Задача 2");

        for (int i = 0; i < 3; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[numbers.length - 1]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }


            System.out.println( );

            for (int index = 0; index < 3; index++) {
                if (index==numbers2.length-1){
                    System.out.print(numbers2[numbers2.length-1]);
                    break;
                }
                System.out.print(numbers2[index] + ", ");
            }

        System.out.println( );

        for (int index2 = 0; index2 < liberty.length; index2++) {
            if (index2==liberty.length-1){
                System.out.print(liberty[liberty.length-1]);
                break;
            }
            System.out.print(liberty[index2] + ", ");
        }

        System.out.println( );

        System.out.println("Задача 3");

        for (int i2 = numbers.length-1; i2 >= 0; i2--) {
            if (i2 == 0) {
                System.out.print(numbers[0]);
                break;
            }
            System.out.print(numbers[i2] + ", ");
        }

        System.out.println( );

        for (int i3 = numbers2.length-1; i3 >= 0; i3--) {
            if (i3 == 0) {
                System.out.print(numbers2[0]);
                break;
            }
            System.out.print(numbers2[i3] + ", ");
        }
        System.out.println( );


        for (int i4 = liberty.length-1; i4 >= 0; i4--) {
            if (i4 == 0) {
                System.out.print(liberty[0]);
                break;
            }
            System.out.print(liberty[i4] + ", ");
        }

        System.out.println( );

        System.out.println("Задача 4");
        for (int i5 = 0; i5 < numbers.length; i5++) {
            if (numbers[i5]%2!=0){
                numbers[i5]=numbers[i5]+1;
            }
        }
        System.out.println(Arrays.toString(numbers));



    }
        }


