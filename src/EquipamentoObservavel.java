import java.util.ArrayList;
import java.util.List;

public class EquipamentoObservavel {
    private List<Observador> observadores = new ArrayList<>();
    private boolean equipamentosLigados;

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(equipamentosLigados);
        }
    }

    public void setEquipamentosLigados(boolean equipamentosLigados) {
        this.equipamentosLigados = equipamentosLigados;
        notificarObservadores();
    }
}
