public class ImpresoraMatricial extends Impresora {
    public ImpresoraMatricial(String modelo, int nivelTinta) {
        super(modelo, nivelTinta);
    }
    @Override
    public void imprimirDocumentos(String documento) {
        if (nivelTinta > 0) {
            System.out.println("impresora matricial: " + modelo);
            System.out.println("imprimiendo documento: " + documento);
            nivelTinta -= 5;
            System.out.println("impresion realizada");
        } else {
            System.out.println("no hay suficiente cinta");
        }
    }
}

