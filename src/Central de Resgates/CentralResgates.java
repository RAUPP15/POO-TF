import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class CentralResgate {

    private String nome;
    private ArrayList<Robo> robos;
    private ArrayList<AreaOperacao> areas;
    private Queue<Missao> missoes;
    private ArrayList<Missao> missoesPendentes;

    public CentralResgate() {
        this.robos = new ArrayList<>();
        this.areas = new ArrayList<>();
        this.missoes = new LinkedList<>();
        this.missoesPendentes = new ArrayList<>();
    }

    public void cadastrarRobo() {

    }

    public void cadastrarArea() {

    }

    public void registrarMissao() {

    }

    public void listarRobosDisponiveis() {

    }

    public void atribuirRoboMissao() {

    }

    public void listarMissoesPendentes() {

    }

    public void gerarRelatorioGeral() {

    }
}