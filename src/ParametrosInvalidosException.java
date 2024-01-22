public class ParametrosInvalidosException extends Exception{
    String mensagem;

    public ParametrosInvalidosException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "ParametrosInvalidosException{" +
                "mensagem = '" + mensagem + '\'' +
                '}';
    }
}
