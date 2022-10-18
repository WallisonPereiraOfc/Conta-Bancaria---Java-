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
                "/nemail=" + pessoa.getEmail();


    }
}
