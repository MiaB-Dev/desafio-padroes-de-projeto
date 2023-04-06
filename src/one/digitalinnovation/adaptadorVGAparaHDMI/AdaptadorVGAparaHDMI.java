package one.digitalinnovation.adaptadorVGAparaHDMI;

public class AdaptadorVGAparaHDMI implements EntradaHDMI{
    private final CaboVGA cabo;
    
    public AdaptadorVGAparaHDMI(){
        cabo = new CaboVGA();
    }
    
    @Override
    public void passaImagem(){
        cabo.passaImagemVGA();
    }

}
