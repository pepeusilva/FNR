import java.util.List;

import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaInvalidaException;
import models.Aluno;
import repositories.ArrayListAlunoRepository;

public class App {
    public static void main(String[] args) {
        iAlunoRepository alunoRepository = new ArrayListAlunoRepository();

        alunoRepository.adicionar(new Aluno("Pedro", "123456789"));
        alunoRepository.adicionar(new Aluno("Letícia", "987654321"));
        alunoRepository.adicionar(new Aluno("Aghata", "543216789"));
        alunoRepository.adicionar(new Aluno("Claudenice", "987612345"));
        alunoRepository.adicionar(new Aluno("José", "556800000"));

        System.out.println("Lista de Alunos:");
        List<Aluno> alunos = alunoRepository.listar();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println();

        try {

            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().length() != 9) {
                    throw new MatriculaInvalidaException(
                            "Matricula invalida: " + aluno.getNome() + ", " + aluno.getMatricula());
                }
            }

            Aluno alunoBuscado = alunoRepository.buscar("José");

            System.out.println("Aluno buscado e removido: " + alunoBuscado);
            alunoRepository.remover(alunoBuscado);
        } catch (AlunoNaoEncontradoException e) {
            System.out.println(e.getMessage());
            return;
        } catch (MatriculaInvalidaException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println();

        System.out.println("Lista de Alunos após remoção:");
        alunos = alunoRepository.listar();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
