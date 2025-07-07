/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.sistemaescolar;

/**
 *
 * @author kailane
 */
public class Professor extends Pessoa {
    public String disciplina;
    
    public Professor(String nome, String cpf, String disciplina){
        super(nome, cpf);
        this.disciplina = disciplina;
    }
    
    @Override
    public String exibirDados(){
        return "PROFESSOR " +
                " Nome: " + nome +
                " CPF" + cpf +
                " Disciplina: " + disciplina;
    }
}
