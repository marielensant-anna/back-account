/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.marielen.contabanco;

import java.util.Scanner;

/**
 *
 * @author CCE
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int accountNumber;
        String agency;
        String clientName;
        double balance;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Cliente: ");
        clientName = scanner.nextLine();
        
        System.out.println("Digite a agência do Cliente: ");
        agency = scanner.nextLine();
        
        System.out.println("Digite o número da conta do Cliente: ");
        accountNumber = scanner.nextInt();
        
        System.out.println("Digite o saldo da conta do Cliente: ");
        balance = scanner.nextInt();
        
        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ". O número da conta é: "  + accountNumber + ". E o seu saldo no valor de: " + balance + "está disponível para saque!" );
        
        
        
        
         //System.out.println(clientName);
        // TODO code application logic here
    }
    
}
