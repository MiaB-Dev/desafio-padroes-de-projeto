package one.acessandoSistema;

public class UsuarioNaoAutorizado {
    
    protected void acessoIndevido(){
        System.out.println("Tendo acesso que compromete dados");
    }

    protected void nada() {
        System.out.println("Não teve acesso e desiste");
    }
}
