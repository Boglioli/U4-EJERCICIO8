public class ImpresoraTinta extends Impresora {
    public ImpresoraTinta(String modelo, int nivelTinta) {
        super(modelo, nivelTinta);
    }
    @Override
    public void imprimirDocumentos(String documento) {
        if (nivelTinta > 0) {
            System.out.println("impresora tinta: " + modelo);
            System.out.println("imprimiendo documento a color: " + documento);
            nivelTinta -= 20;
            System.out.println("impresion realizada");
        } else {
            System.out.println("no hay suficiente tinta");
        }
    }
}

