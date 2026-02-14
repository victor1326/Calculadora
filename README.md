Este código implementa uma calculadora simples em Java, executada no console, que permite ao usuário escolher operações matemáticas e repetir o processo até decidir sair.

O programa começa importando a classe Scanner, que é utilizada para ler dados digitados pelo usuário no teclado. Dentro da classe Main, está o método main, que é o ponto de entrada da aplicação.

No início do main, é criado um objeto Scanner para capturar entradas do usuário. Em seguida, é declarada uma variável booleana chamada executando, iniciada com valor true. Essa variável controla o funcionamento do laço while. Enquanto executando for verdadeiro, o programa continuará rodando.

Dentro do while, o sistema exibe um menu pedindo para o usuário escolher uma operação matemática. O número digitado é armazenado na variável op. Logo depois, é utilizado um switch para verificar qual opção foi escolhida.

Se o usuário digitar:

1: o programa chama o método soma, que pede dois números e retorna a soma deles.

2: chama o método subtracao, que retorna a diferença entre dois números.

3: chama o método multiplicacao, que retorna o produto.

4: chama o método divisao, que retorna o resultado da divisão inteira.

5: altera a variável executando para false, encerrando o laço e finalizando o programa.

Caso o usuário digite um número diferente dessas opções, o default do switch é executado, exibindo a mensagem “Número inválido”.

Cada operação matemática foi organizada em um método separado. Esses métodos são static, pois pertencem à própria classe e podem ser chamados diretamente dentro do main. Cada método recebe o objeto Scanner como parâmetro, solicita dois números ao usuário e retorna o resultado da operação correspondente.

A divisão é feita com variáveis do tipo int, portanto é uma divisão inteira, ou seja, qualquer parte decimal é descartada. Além disso, não há tratamento para divisão por zero, o que pode causar erro em tempo de execução.

De forma geral, o código demonstra o uso de:

Estrutura de repetição (while)

Estrutura de decisão (switch-case)

Variável booleana para controle de fluxo

Métodos para organizar funcionalidades

Entrada de dados com Scanner

Trata-se de um exemplo básico de organização de lógica em Java, mostrando separação de responsabilidades e controle do fluxo do programa.
