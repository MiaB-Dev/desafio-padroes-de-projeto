package one.acessandoSistema;


/**
 * App
 */
public class App {

    public static void main(String[] args) {
        var sysAdmin = new UsuarioRoot();
        var usuarioNormal = new UsuarioNaoAutorizado();

        System.out.print("Usuário sysAdmin: ");
        if (sysAdmin instanceof Permissao){
            sysAdmin.acesso();
        }else{
            System.out.println("Acesso negado");
        }

        System.out.print("Usuário normal: ");
        if (usuarioNormal instanceof Permissao){
            usuarioNormal.acessoIndevido();
        }else{
            usuarioNormal.nada();
        }
    }
}