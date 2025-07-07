/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estudodecaso.sistemaescolar;

/**
 *
 * @author kailane
 */
public class SistemaEscolar {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];
        
        pessoas[0] = new Professor("Cleber", "065.698.453-56", "LPII");
        pessoas[1] = new Professor("Daiane", "078.695.455-55", "Meio Ambiente");
        pessoas[2] = new Aluno("Kailane", "569.456.369-56", "2024b10");
        pessoas[3] = new Aluno("Keilla", "999.456.359-77", "2024b18");
        
        for(Pessoa item: pessoas){
            System.out.println(item.exibirDados());
        }

        
    }
}
