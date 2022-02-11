public class AtletaEstadoCorrendo implements AtletaEstado{
    private AtletaEstadoCorrendo() {};
    private static AtletaEstadoCorrendo instance = new AtletaEstadoCorrendo();
    public static AtletaEstadoCorrendo getInstance(){
        return instance;
    }
    public String getNomeEstado(){
        return "Correndo";
    }
}