## Calculadora Console - Projeto Java Maven

Projeto simples de calculadora de linha de comando, feito em Java com Maven. Permite realizar as quatro operações básicas: adição, subtração, multiplicação e divisão.

## Funcionalidades

- Adição, subtração, multiplicação e divisão
- Repetição contínua até digitar `sair`
- Validação de entrada inválida
- Tratamento de erro de divisão por zero

## Requisitos

- Java 17 ou superior
- Maven instalado

## Como rodar

Clone o repositório:

git clone https://github.com/mauricioffdev/CalculadoraConsole-Maven.git

Entre na pasta: CalculadoraConsole-Maven

Compile o projeto: mvn compile

Execute o programa: mvn exec:java -Dexec.mainClass="com.seuusuario.calculadora.CalculadoraApp"
                        
Exemplo de uso

=== Calculadora Console ===

Digite dois números e a operação desejada.

Operações válidas: +  -  *  /

Digite 'sair' como operação para encerrar.

Digite o primeiro número: 10

Digite a operação (+, -, *, / ou 'sair'): *

Digite o segundo número: 5

Resultado: 50.0

mauricioffdev
