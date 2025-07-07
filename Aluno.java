/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.sistemaescolar;

/**
 *
 * @author kailane
 */
public class Aluno extends Pessoa {
    public String matricula;
    
    public Aluno(String nome, String cpf, String matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    @Override
    public String exibirDados(){
        return "ALUNO" +
                " Nome: " + nome +
                " CPF" + cpf +
                " Matricula: " + matricula;
    }
}
