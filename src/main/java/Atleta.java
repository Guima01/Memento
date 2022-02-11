import java.util.ArrayList;
import java.util.List;

public class Atleta {

    private AtletaEstado estado;
    private List<AtletaEstado> memento = new ArrayList<>();

    public AtletaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(AtletaEstado estado) {
        this.estado = estado;
        this.memento.add((this.estado));
    }

    public void restauraEstado (int indice) {
        if(indice < 0 || indice > this.memento.size() - 1){
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<AtletaEstado> getEstados (){
        return this.memento;
    }
}