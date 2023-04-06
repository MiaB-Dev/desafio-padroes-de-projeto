package one.digitalinnovation.adaptadorVGAparaHDMI;

/**
 * Monitor
 */
public class Monitor  {

    private final EntradaHDMI entradaHDMI;

    public Monitor(EntradaHDMI entradaHDMI) {
        this.entradaHDMI=entradaHDMI;
    }

    public void passaImagem(){
        entradaHDMI.passaImagem();
    }
    
}