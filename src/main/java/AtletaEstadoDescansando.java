public class AtletaEstadoDescansando implements AtletaEstado{

    private AtletaEstadoDescansando() {};
    private static AtletaEstadoDescansando instance = new AtletaEstadoDescansando();
    public static AtletaEstadoDescansando getInstance(){
        return instance;
    }
    public String getNomeEstado(){
        return "Descansando";
    }

}