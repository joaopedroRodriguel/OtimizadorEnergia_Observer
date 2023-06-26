public class Main {
    public static void main(String[] args) {
        EquipamentoObservavel equipamentoObservavel = new EquipamentoObservavel();

        // Criação dos observadores
        EquipamentoObservador observador1 = new EquipamentoObservador("Observador 1");
        EquipamentoObservador observador2 = new EquipamentoObservador("Observador 2");

        // Adição dos observadores ao observável
        equipamentoObservavel.adicionarObservador(observador1);
        equipamentoObservavel.adicionarObservador(observador2);

        // Simulação de docentes entrando e saindo do bloco acadêmico
        Docente docente1 = new Docente("Alex", equipamentoObservavel);
        Docente docente2 = new Docente("Valeria", equipamentoObservavel);

        // Docentes entram e saem do bloco
        docente1.entrarNoBloco();
        docente2.entrarNoBloco();
        docente2.sairDoBloco();
        docente1.sairDoBloco();

        // Remoção de um observador
        equipamentoObservavel.removerObservador(observador1);

        // Docentes entram e saem do bloco novamente
        docente1.entrarNoBloco();
        docente2.entrarNoBloco();
        docente1.sairDoBloco();
        docente2.sairDoBloco();
    }
}
