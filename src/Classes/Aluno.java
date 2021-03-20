package Classes;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}