public class Main {

    public static void main(String[] args) {
        ServidorImpresion servidor = new ServidorImpresion();
        Impresora laser = new ImpresoraLaser("hp laserjet" , 60);
        Impresora tinta = new ImpresoraTinta("epson ecotank" , 45);
        Impresora matricial = new ImpresoraMatricial("epson lx-300" , 30);
        servidor.agregarImpresora(laser);
        servidor.agregarImpresora(tinta);
        servidor.agregarImpresora(matricial);
        servidor.enviarTrabajo("informe de ventas");
    }
}
