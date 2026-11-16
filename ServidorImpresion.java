import java.util.ArrayList;
public class ServidorImpresion {
    private ArrayList<Impresora> impresoras = new ArrayList<>();
    public void agregarImpresora(Impresora impresora) {
        impresoras.add(impresora);
    }
    public void enviarTrabajo(String documento) {
        for (Impresora impresora : impresoras) {
            impresora.imprimirDocumentos(documento);
            System.out.println("--------------------------");
        }
    }
}
