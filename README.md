# Jogo da Velha

## Objetivo
Atividade desenvolvida na disciplina de Sistemas Distribuídos. O objetivo foi criar uma plataforma onde fosse possível que dois jogadores da mesma rede podem jogar o jogo da velha enquanto espectadores, também da rede, assistem e podem apostar em um dos jogadores. 

Do ponto de vista técnico, o objetivo foi o de desenvolver a comunicação entre as instâncias da aplicação por meio de Sockets.

## Implementação
- Desenvolvido na versão 11 do Java
- Validado no Ubuntu 22.04 e no Windows 10 e 11
- As telas foram criadas a partir da biblioteca [Swing](https://docs.oracle.com/javase/8/docs/api/index.html?javax/swing/package-summary.html), do Java
- Para a transmissão de dados a partir do formato JSON foi utilizada a biblioteca [Gson](https://github.com/google/gson), da Google

## Server
![Control Panel](https://github.com/JoaoVictorFdeBarros/TicTacToe/blob/master/images/ControlPanel.png)
*Server/src/main/java/com/cefetmg/tictactoeserver/ControlPanel.java*

No servidor é possível controlar o acesso dos jogadores e dos espectadores à partida, bem como é onde é feita toda a validação dos jogadores, jogadas e das apostas, cujos resultados são transmitidos de volta para os Jogadores via TCP e aos espectadores via UDP.

## Client

### Login
![Login](https://github.com/JoaoVictorFdeBarros/TicTacToe/blob/master/images/login.png)
*Client/src/main/java/com/cefetmg/tictactoeclient/Login.java*

Na tela de Login é possível entrar na partida tanto como jogador, se o servidor estiver aceitando jogadores no momento e já não houverem 2 jogadores, quanto como espectador, do mesmo modo, se o servidor estiver configurado para aceitá-los.

### Jogo
![Jogo](https://github.com/JoaoVictorFdeBarros/TicTacToe/blob/master/images/game.png)
*Client/src/main/java/com/cefetmg/tictactoeclient/Game.java*

Na tela do jogo é onde são realizadas as jogadas e onde são mostradas as informações do estado atual do jogo e, no fim, o resultado da partida para os jogadores e da aposta para os espectadores.
