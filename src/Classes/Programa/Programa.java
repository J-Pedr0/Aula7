package Classes.Programa;

import Classes.Aluno;
import Classes.Funcionario;
import Classes.Professor;



public class Programa {
    public static void main(String[] args) {

        System.out.println("**********************");


        Aluno aluno = new Aluno("Ana", "12345");
        aluno.setEndereco("Rua Abc, 123");
        aluno.setTelefone("2742-5599");
        aluno.setMatricula("4444");

        System.out.println("Pessoa: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Matricula: " + aluno.getMatricula());

        System.out.println("**********************");

        Funcionario funcionario = new Funcionario("Jorge", "67899");
        funcionario.setEndereco("Rua Def, 456");
        funcionario.setTelefone("2741-3642");
        funcionario.setDepartamento("Faxina");

        System.out.println("Pessoa: " + funcionario.getNome());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("Departamento: " + funcionario.getDepartamento());

        System.out.println("**********************");

        Professor professor = new Professor("Reginaldo", "54321");
        professor.setEndereco("Rua Ghi, 789");
        professor.setTelefone("2743-4562");
        professor.setMateria("História");

        System.out.println("Pessoa: " + professor.getNome());
        System.out.println("Endereço: " + professor.getEndereco());
        System.out.println("Telefone: " + professor.getTelefone());
        System.out.println("Matéria: " + professor.getMateria());

        System.out.println("**********************");

    }

    
}