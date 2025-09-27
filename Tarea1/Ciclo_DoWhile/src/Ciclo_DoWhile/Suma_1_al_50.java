/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo_DoWhile;

/**
 *
 * @author Joshwa
 */
public class Suma_1_al_50 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        do{
            sum += i;
            i++;
        }while(i <= 50);
        System.out.println(sum);
    }
}
