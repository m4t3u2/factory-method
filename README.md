# Patterns: Factory Method
O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

# 

Esse sistema de exemplo simula um envio de correio eletrônico para os contatos de diferentes tipos de clientes.

O cliente A salva seus contatos em CSV, já o cliente B salva em XML.

A capacidade do sistema é de ler esses contatos, independente do formato que os clientes salvam e encaminhar uma mensagem simples, utilizando o padrão Factory Method.