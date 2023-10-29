package poo.projeto.FakeDB;
import java.util.ArrayList;
import java.time.LocalDate;
import poo.projeto.dominio.*;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor>{ //200 - 299 -> professor
    private TurmaFakeDB t1 = new TurmaFakeDB();
    private ArrayList<Turma> listaTurmas = t1.getLista();
    private ArrayList<Turma> listaTurmaProfessor1 = new ArrayList<Turma>();
    private ArrayList<Turma> listaTurmaProfessor2 = new ArrayList<Turma>();
    private ArrayList<Turma> listaTurmaProfessor3 = new ArrayList<Turma>();
    private ArrayList<Turma> listaTurmaProfessor4 = new ArrayList<Turma>();

    @Override
    protected void CarregarDados() {
        CarregarTurmas();
        this.lista.add(new Professor(201, "Oswaldo Marques", "OM123456", LocalDate.of(1996, 05, 20), "Oswaldo", "Professor", listaTurmas));
        this.lista.add(new Professor(202, "Marcos do Val", "MV987654", LocalDate.of(1992, 03, 25), "Marcos", "Professor", listaTurmas));
        this.lista.add(new Professor(203, "Beatriz Schimidt", "BM856531", LocalDate.of(1999, 04, 28), "Beatriz", "Professor", listaTurmas));
        this.lista.add(new Professor(204, "Márcia Souza", "MS228134", LocalDate.of(1985, 8, 13), "Márcia", "Professor", listaTurmas));
    }

    private void CarregarTurmas(){
    }

    public ProfessorFakeDB(){
        super();
    }
    
}
