/*ANais_EUDES_TDC
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Anais
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter the operator:\n" +
    "1) add\n" +
    "2) substract\n" +
    "3) multiply\n" +
    "4) divide\n" +
    "5) modulo");
        
    
    int operateur ;
    int operande1 ;
    int operande2 ;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n Entrer le type d'opération souhaité :");
    operateur=sc.nextInt();
    
    System.out.println("\n Entrer la première valeur :");
    operande1=sc.nextInt();
    
    System.out.println("\n Entrer la deuxième valeur :");
    operande2=sc.nextInt();
    
    if ((operateur !=1) || (operateur !=2) || (operateur !=3) || (operateur !=4) || (operateur !=5)) {
        System.out.println( "erreur" ); }
    
    if (operateur == 1) {
        System.out.println( operande1 + operande2 ); }
    
    if (operateur == 2) {
        System.out.println( operande1 - operande2 ); }

    if (operateur == 3) {
        System.out.println( operande1 * operande2 ); }

    if (operateur == 4) {
        System.out.println( operande1 / operande2 ); }

    if (operateur == 5) {
        System.out.println( operande1 % operande2 ); }
    }
    }

    
