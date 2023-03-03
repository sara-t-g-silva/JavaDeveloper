package com.dio.projetos.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Conta conta1 = new Conta();


        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome !");
        Object nome;
        cliente1.setNome(scan.next());
        System.out.println("Por favor, digite o número da Agência !");
        conta1.setAgencia(scan.next());
        System.out.println("Por favor, digite o número da Conta!");
        conta1.setNumero(scan.nextInt());
        System.out.println("Por favor, digite o seu saldo !");
        conta1.setSaldo(scan.nextDouble());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %f já está disponível para saque",
                cliente1.getNome(),conta1.getAgencia(),conta1.getNumero(),conta1.getSaldo());


    }

}
