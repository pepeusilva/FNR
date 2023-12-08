import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import models.Aluno;
import repositories.ArrayListAlunoRepository;

public class App {
    public static void main(String[] args) {
        iAlunoRepository alunoRepository = new ArrayListAlunoRepository();

        alunoRepository.adicionar(new Aluno("Pedro", "559933884")); 
        alunoRepository.adicionar(new Aluno("Letícia", "123456789"));
        alunoRepository.adicionar(new Aluno("Maria", "987654321"));
        alunoRepository.adicionar(new Aluno("Aghata", "556800000")); 
        alunoRepository.adicionar(new Aluno("José", "883377229"));
        
        for (Aluno aluno : alunoRepository.listar()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        try {
            Aluno alunoBuscado = alunoRepository.buscar("Maria");
            System.out.println("Aluno buscado: " + alunoBuscado.getNome());

            alunoRepository.remover(alunoBuscado);
        } catch (AlunoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        for (Aluno aluno : alunoRepository.listar()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
