package JpFrameworks;

public class JpExeption extends Exception {
    public JpExeption(String e, String clase, String metod) {
        System.out.println("[Error en IABot para el LOG] " + clase + "." + metod + ": " + e);
    }

    @Override
    public String getMessage() {
        return "Error";
    }

}
