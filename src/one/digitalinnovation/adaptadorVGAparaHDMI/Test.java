package one.digitalinnovation.adaptadorVGAparaHDMI;

public class Test {
    
    public static void main(String[] args) {
        Monitor monitor = new Monitor(new AdaptadorVGAparaHDMI());
        monitor.passaImagem();
    }
}
