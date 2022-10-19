package org.example.model;

import jdk.jshell.execution.Util;

public class Conta {

    private static int contadorDeContas = 1;

    private int numeroDaConta;

    private double saldo = 0;


    Pessoa pessoa = new Pessoa();

    public Conta(Pessoa pessoa) {
        this.numeroDaConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas++;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String toString() {
        return "Conta:" +
                "/nnumeroDaConta" + this.numeroDaConta +
                "/npessoa=" + this.getPessoa() +
                "/nsaldo=" + this.getSaldo() +
                "/nemail=" + this.pessoa.getEmail();


    }

    public void Depositar(Double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("saldo adicionado com sucesso!");
        }else {
            System.out.println("saldo recusado!");
        }
    }

    public void Sacar(Double valor){
        if (valor >0 && this.getSaldo() >= valor){
            System.out.println("parabens você sacou!");
            setSaldo(getSaldo() - valor);
        }else {
            System.out.println("sacar não foi possível!");
        }
    }

    public void Transferir(Conta contaTrans , Double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaTrans.saldo = contaTrans.getSaldo() + valor;
            System.out.println("transferir não foi possível!");
        }else {
            System.out.println("transferir não foi possível!");
        }

    }
    }
