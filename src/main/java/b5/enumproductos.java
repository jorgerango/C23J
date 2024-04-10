package b5;

public enum enumproductos {
    ARROZ( 1500),
    PANELA( 2000),
    PAPA (2500),
    AZUCAR(3000);

    private final int valor;

    enumproductos(int valor){this.valor = valor;}

    public int getValor() {
        return valor;
    }


}
