public class AtletaEstadoCaminhando implements AtletaEstado{

    private AtletaEstadoCaminhando() {};
    private static AtletaEstadoCaminhando instance = new AtletaEstadoCaminhando();
    public static AtletaEstadoCaminhando getInstance(){
        return instance;
    }
    public String getNomeEstado(){
        return "Caminhando";
    }
}