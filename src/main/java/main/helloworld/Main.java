package main.helloworld;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Bojan");

        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j <= 10; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

//        for (i = 0; i < 10; i++) {
//            for (j = 0; j <= 10; j++) {
//                System.out.print(" ( " + i + " , " + j + ")");
//            }
//            System.out.println();
//        }
        
         for (i = 1; i < 11; i++) {
            for (j = 1 ; j <= 11; j++) {
                System.out.print(" ( " + i + " , " + j + ")");
            }
            System.out.println();
        }

        //  int age = 5;
        //    if (age > 18) {
        //        System.out.println("Osoba je punoletna");
        //    } else {
        //        System.out.println("Osoba je maloletna");
        //    }
//        System.out.print("Unesite godine ");
//        Scanner input = new Scanner(System.in);
//        int userAge = input.nextInt();
//        
//        System.out.println("Korisnik je uneo: " + userAge);
//        
//          if (userAge <0 && userAge > 150 ) {
//            System.out.println("Invalid");
//          } else    if (userAge >=0 && userAge<= 5) {
//            System.out.println("Osoba je beba");
//        }  else  if (userAge<= 11) {
//            System.out.println("Osoba je dete");
//        }else  if (userAge<= 17) {
//            System.out.println("Osoba je tinejdzer"); 
//        }else  if (userAge <= 150) {
//            System.out.println("Osoba je punoletna");
//        } 
//        
        //else {
        //    System.out.println("Osoba je maloletna");
        // }
//            
//       System.out.print("Unesite redni broj dana u nedelji (1-7):  ");
//        Scanner input = new Scanner(System.in);
//        
//        int dayNumber = input.nextInt();
//        
//        System.out.println(dayNumber + "");
//        
//        Switch(dayNumber);
//          
//           System.out.println("Nedelja"); 
//        int x = 1;
//        while(x < 10) {
//            System.out.println(x);
//            x = x + 1;
//        }
//        
//         System.out.println("While loop2: ");
//        
//      x = 10;
//        
//        while (x > 0) {
//             System.out.println(x);
//             x--;
//        }
//        
//         System.out.println("Do While loop");
//         do {
//             x--;
//         }  while(x>15);
//         
//         
//         for (int i = 30; i > 19; i--) {
//            System.out.println(i);
//        }
    }

}
