import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class CentralResgate {

    private String nome;
    private ArrayList<Robo> robos;
    private ArrayList<AreaOperacao> areas;
    private ArrayList<Missao> missoes;
    private Queue<Missao> missoesPendentes;
    private ArrayList<Missao> missoesConcluidas;
    private Scanner sc = new Scanner(System.in);

    public CentralResgate() {
        this.robos = new ArrayList<>();
        this.areas = new ArrayList<>();
        this.missoes = new ArrayList<>();
        this.missoesPendentes = new ArrayList<>();
	    this.missoesPendentes = new LinkedList<>();
	    this.missoesConcluidas = new ArrayList<>();
    }

    public void cadastrarRobo() {
	    System.out.println("(1) Cadastrar Drone" + "\n(2) Cadastrar Robô Terrestre");
	    int op = sc.nextInt();
	    if(op == 1){
	        Robo robo = new Drone();
	        robos.add(robo);
	    }
	    else if(op == 2){
	        Robo robo = new roboTerrestre();
	        robos.add(robo);
	    } else {
	        System.out.println("ERRO") --------------> ADD CONTENÇÃO DE DANOS
        }
    }

    public void cadastrarArea() {
	    AreaOperacao area = new AreaOperacao();
	    areas.add(area);
    }

    public void registrarMissao() {
	    Missao missão = new Missao();
	    missões.add(missao);
    }

    public void listarRobosDisponiveis() {
	    for (Robo robo : robos) {
            if (robo.getStatus() == StatusRobo.DISPONIVEL) {
                System.out.println(robo);
            }
	    }
    }

    public void atribuirRoboMissao(Robo robo, Missao missao) {
	    missao.atribuirRobo(robo);
    }

    public void listarMissoesPendentes() {
	    for (Missao missao : missoesPendentes){
	        System.out.println(missão.exibirResumo());
        }
    }

    public void gerarRelatorioGeral() {

    }
}