public class ImpresoraLaser extends Impresora{
    public ImpresoraLaser(String modelo, int nivelTinta) {
        super(modelo, nivelTinta);
    }
    @Override
    public void imprimirDocumentos(String documento) {
        if (nivelTinta > 0) {
            System.out.println("impresora laser: " + modelo);
            System.out.println("imprimiendo documento: " + documento);
            nivelTinta -= 10;
            System.out.println("impresion realizada");
        } else {
            System.out.println("no hay suficiente toner");
        }
    }
}
