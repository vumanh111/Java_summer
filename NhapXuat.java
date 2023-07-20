package Java_summer;
/*Bài 2 :Nhập vào 4 nguyên a , b , c , d. In ra màn hình số lớn thứ hai trong 4 số trên.
        Nếu cả 4 số đều bằng nhau in ra màn hình “Không tồn tại số lớn thứ hai”*/
import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[4];
        int i;
        for( i =0 ; i< a.length; i++){
            System.out.print("a[" +i+"]= ");
            a[i] = sc.nextInt();
        }
        System.out.println("Day so vua nhap: ");
        for(i =0; i< a.length; i++)
            System.out.print(+a[i]+" ");
        for(i =0; i< a.length-1; i++){
            for(int j =i+1; j< a.length; j++){
                if(a[i] < a[j]){
                    int tp = a[i];
                        a[i] = a[j];
                        a[j] = tp;
                }
            }
        }

            System.out.println("\nSo lon thu 2 la: "+a[1]+" ");


    }
}
