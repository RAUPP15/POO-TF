public class Missao {

    private int id;
    private String descricao;
    private String tipo;
    private String area;
    private String prioridade;
    private String status;
    private String roboResponsavel;
    private boolean resultado;
    private int atributo31;

    public void atribuirRobo(Robo robo) {
	missao.roboResponsavel = robo;
    }

    public void iniciar() {

    }

    public void concluir() {

    }

    public void cancelar() {

    }

    public void exibirResumo() {

    }
}