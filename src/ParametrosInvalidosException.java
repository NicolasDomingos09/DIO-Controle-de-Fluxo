public class ParametrosInvalidosException extends Exception {
    public String getMsg() {
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
