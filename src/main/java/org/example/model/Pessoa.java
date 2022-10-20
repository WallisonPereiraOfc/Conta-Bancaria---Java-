package org.example.model;

public class Pessoa {

    public static int counter = 1;

    private String nome;
    private String email;
    private String cpf;

    public Pessoa() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String toString() {
        return "\nConta " +
                "\nnome= " + this.getNome()  +
                "\nemail= " + this.getEmail()  +
                "\ncpf= " + this.getCpf();
    }

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        counter++;
    }
}
