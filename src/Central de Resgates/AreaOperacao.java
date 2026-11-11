public class AreaOperacao {

    private int id;
    private String nome;
    private String localizacao;
    private String tipoTerreno;
    private int nivelRisco;
    private String descricao;

    public void atualizarNivelRisco() {

    }

    public String exibirInformacoes() {
	return nome + 
	    "\nID: " + id +
        "\nLocalização: " + localizacao +
        "\nTipo de terreno: " + tipoTerreno +
        "\nNível de risco: " + nivelRisco +
        "\nDescrição: " + descricao;
    }
}