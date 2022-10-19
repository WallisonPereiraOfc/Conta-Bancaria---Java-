package org.example.model;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[]args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static Conta operacoes(){
        System.out.println("------------------------------------------------------");
        System.out.println("-------------Bem vindos a nossa Agência---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Criar conta   |");
        System.out.println("|   Opção 2 - Depositar     |");
        System.out.println("|   Opção 3 - Sacar         |");
        System.out.println("|   Opção 4 - Transferir    |");
        System.out.println("|   Opção 5 - Listar        |");
        System.out.println("|   Opção 6 - Sair          |");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("você saiu!");
                System.exit(0);
            default:
                System.out.println("operação inválida!");
                operacoes();
                break;
            }
            //talvez fique em loop
        return operacoes();
    }
        public static void criarConta() {

            System.out.println("Nome:");
            String nome = sc.next();

            System.out.println("email:");
            String email = sc.next();

            System.out.println("cpf:");
            String cpf = sc.next();

            Pessoa pessoa = new Pessoa(nome, email, cpf);

            Conta conta = new Conta(pessoa);

            contasBancarias.add(conta);
            System.out.println("conta criada com sucesso!");
            operacoes();
        }

            private static Conta encontrarConta(int numeroConta){
                Conta conta = null;
                if (contasBancarias.size()>0){
                    for (Conta contaa: contasBancarias){
                        if (contaa.getNumeroDaConta() == numeroConta);
                        conta = contaa;
                    }

                }
                return conta;


            }
            private static void depositar(){
            System.out.println("numero da conta:");
            int numeroConta = sc.nextInt();

            Conta conta = encontrarConta(numeroConta);
            if (conta != null){
                System.out.println("qual valor deseja depositar:");
                Double valorDepositado = sc.nextDouble();
                conta.depositar(valorDepositado);
                System.out.println("valor depositado com sucesso!");

            } else {
                System.out.println("conta não encontrada!");
            }
            operacoes();
            }
             private static void sacar(){
                 System.out.println("numero da conta:");
                 int numeroConta = sc.nextInt();

                 Conta conta = encontrarConta(numeroConta);
                 if (conta != null){
                     System.out.println("qual valor deseja sacar:");
                     Double valorDeSaque = sc.nextDouble();
                     conta.depositar(valorDeSaque);
                     System.out.println("valor foi sacado com sucesso!");

                 } else {
                     System.out.println("inválido!");
                 }
                 operacoes();
             }
            private static void transferir(){
                System.out.println("numero da conta remetente:");
                int numeroContaRemetente = sc.nextInt();
                Conta contaRemetente = encontrarConta(numeroContaRemetente);

                if (contaRemetente != null){
                    System.out.println("numero da conta destino:");
                    int numeroContaDestino = sc.nextInt();

                    Conta contaDestino = encontrarConta(numeroContaDestino);

                    if (contaDestino !=null){
                        System.out.println("valor da transferência:");
                        Double valor = sc.nextDouble();

                        contaRemetente.transferir(contaDestino,valor);
                    }
                }
                operacoes();
            }
            public  static void listar(){
                if(contasBancarias.size()>0){
                    for (Conta conta: contasBancarias){
                        System.out.println(conta);
                    }
                    }else{
                    System.out.println("não há contas!");
                }
                operacoes();
            }




        }





