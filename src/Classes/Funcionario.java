package Classes;

public class Funcionario extends Pessoa {
    private String departamento;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
