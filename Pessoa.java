/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.sistemaescolar;

/**
 *
 * @author kailane
 */
public abstract class Pessoa {
    public String nome;
    public String cpf;
    
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public abstract String exibirDados();
}
