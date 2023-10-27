package poo.projeto.FakeDB;
import java.util.ArrayList;
import poo.projeto.dominio.*;

public class TrabalhoFakeDB extends BaseGenericaFakeDB <Trabalho> {
    DisciplinaFakeDB disciplinas = new DisciplinaFakeDB();
    ArrayList<Disciplina> listaDisciplinas = disciplinas.getLista();

    @Override
    protected void CarregarDados() {

        this.lista.add(new Trabalho(1, listaDisciplinas.get(0), "Trabalho 1 Matemática"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(0), "Trabalho 2 Matemática"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(0), "Trabalho 3 Matemática"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(0), "Trabalho 4 Matemática"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(1), "Trabalho 1 Portugues"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(1), "Trabalho 2 Portugues"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(1), "Trabalho 3 Portugues"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(1), "Trabalho 4 Portugues"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(2), "Trabalho 1 Educação Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(2), "Trabalho 2 Educação Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(2), "Trabalho 3 Educaçãoo Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(2), "Trabalho 4 Educação Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(3), "Trabalho 1 Geografia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(3), "Trabalho 2 Geografia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(3), "Trabalho 3 Geografia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(3), "Trabalho 4 Geografia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(4), "Trabalho 1 História"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(4), "Trabalho 2 História"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(4), "Trabalho 3 História"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(4), "Trabalho 4 História"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(5), "Trabalho 1 Biologia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(5), "Trabalho 2 Biologia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(5), "Trabalho 3 Biologia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(5), "Trabalho 4 Biologia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(6), "Trabalho 1 Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(6), "Trabalho 2 Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(6), "Trabalho 3 Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(6), "Trabalho 4 Física"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(7), "Trabalho 1 Química"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(7), "Trabalho 2 Química"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(7), "Trabalho 3 Química"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(7), "Trabalho 4 Química"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(8), "Trabalho 1 Inglês"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(8), "Trabalho 2 Inglês"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(8), "Trabalho 3 Inglês"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(8), "Trabalho 4 Inglês"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(9), "Trabalho 1 Espanhol"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(9), "Trabalho 2 Espanhol"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(9), "Trabalho 3 Espanhol"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(9), "Trabalho 4 Espanhol"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(10), "Trabalho 1 Filosofia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(10), "Trabalho 2 Filosofia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(10), "Trabalho 3 Filosofia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(10), "Trabalho 4 Filosofia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(11), "Trabalho 1 Sociologia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(11), "Trabalho 2 Sociologia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(11), "Trabalho 3 Sociologia"));
        this.lista.add(new Trabalho(1, listaDisciplinas.get(11), "Trabalho 4 Sociologia"));
    }
    
    
}
