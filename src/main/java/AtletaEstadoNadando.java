public class AtletaEstadoNadando implements AtletaEstado {
    private AtletaEstadoNadando() {};
    private static AtletaEstadoNadando instance = new AtletaEstadoNadando();
    public static AtletaEstadoNadando getInstance(){
        return instance;
    }
    public String getNomeEstado(){
        return "Nadando";
    }

}