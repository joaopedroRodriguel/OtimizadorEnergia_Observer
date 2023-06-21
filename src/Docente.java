public class Docente {
    private String nome;
    private EquipamentoObservavel equipamentoObservavel;

    public Docente(String nome, EquipamentoObservavel equipamentoObservavel) {
        this.nome = nome;
        this.equipamentoObservavel = equipamentoObservavel;
    }

    public void entrarNoBloco() {
        System.out.println("Docente " + nome + " entrou no bloco.");
        equipamentoObservavel.setEquipamentosLigados(true);
    }

    public void sairDoBloco() {
        System.out.println("Docente " + nome + " saiu do bloco.");
        equipamentoObservavel.setEquipamentosLigados(false);
    }
}
