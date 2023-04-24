# Explorando Padrões de Projetos na Prática com Java


<p>Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando Java puro:

- Strategy/state
- Adapter
- Marker



## Fuga da lava
O projeto FugaDaLava utiliza a ideia inicial do professor Venilton de um robô que muda de comportamento em tempo de execução de acordo com seu estado, implementando o padrão strategy. O código foi modificado de forma a simular o movimento do robô, onde cada comportamento trás vantagens e desvantagens. O modo agressivo proporciona mais movimento, mas há uma chance maior de ocorrer algum problema (o robô cair em um buraco por exemplo) enquanto o modo defensivo proporciona mais segurança, mas ao custo de menor movimento. O modo "normal" trás um balaço entre mobilidade e risco.

O objetivo do programa é guiar o robô até uma jangada enquanto foge da lava. Quando o robô alcança a jangada antes de ser tocado pela lava, o jogo acaba em vitória, caso contrário, acaba em derrota.

As classes "ComportamentoAgressivo", "ComportamentoDefensivo" e "ComportamentoNormal" são implementações da interface Comportamento, sendo responsáveis pelo movimento do robô e pela chance de ocorrer um problema. A classe Robo controla o movimento através da chamada do método mover, invocando a classe de movimento adequada conforme o comportamento atual. Esta classe também é responsável por gerenciar o status do robô (preso ou livre). Por fim, a classe FugadaLava é reponsável pela instanciação da classe Robo e por obter as ordens do jogador a cada turno, ao mesmo tempo que determina o movimento da lava. A classe também possui um método chamado "desenha", que fornece uma representação gráfica rudimentar do jogo.

## AdaptadorVGAparaHDMI

O projeto AdapatadorVGAparaHDMI utiliza o padrão de projeto adapter, onde neste caso, um monitor com porta HDMI recebe um adaptador que converte imagem do cabo VGA para HDMI. O padrão de projeto utilizado foi o adapter, que permite que classes com interfaces diferentes se comuniquem.

## Acessando sistema
Este projeto implementa o padrão "marker", onde interfaces vazias são utilizadas para discernir objetos tratados de maneira diferente. Neste projeto a interface Permissao concede ao sistema sendo implementada pela classe UsuarioRoot, enquanto a classe UsuarioNaoAutorizado não a implementa, negando o acesso da classe ao sistema.


### Referências utilizadas:
- https://github.com/iluwatar/java-design-patterns/tree/master/
- https://www.devmedia.com.br/padrao-de-projeto-adapter-em-java/26467

