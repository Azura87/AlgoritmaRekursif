/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmarekursif;

/**
 *
 * @author T470s
 */
public class DeretFibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int hasil = fiboRekursif(i);
            System.out.print(i == 4 ? hasil : hasil + ", ");
        }
        System.out.println("");
    }
            
    public static Integer fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
            return fiboRekursif(n - 1) + fiboRekursif(n - 2);
        }
}
