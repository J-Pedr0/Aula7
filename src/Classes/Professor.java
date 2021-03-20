package Classes;

public class Professor extends Pessoa {
    private String materia; 

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
