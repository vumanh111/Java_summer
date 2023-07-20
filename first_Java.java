package Java_summer;

import java.util.Scanner;

public class first_Java {
        public static void main (String ...args){
            Scanner sc = new Scanner(System.in);
            System.out.println("First Java in summer 2023");
 /*           String name = "Manh vu";
            System.out.println(name);
            int a = 10, b =12;
            a +=10;
            System.out.println(a);
            String huy = "Nguyenvan huy";
            System.out.println("So ki tu co trong xau huy: " +huy.length());
            int n;
            System.out.println("Nhap n: ");
            n = sc.nextInt();
            System.out.println(n);
            int[] arrays = new int[n];
            */

//            for(int i =0; i< arrays.length; i++){
//
//            }
            System.out.print("Nhap so nguyen duong: ");
            int a = sc.nextInt();
            if(a > 0){
                System.out.println("Đay la so nguyen duong");
            }
            else
                System.out.println("Đay ko la so nguyen duong ");

        }
}
