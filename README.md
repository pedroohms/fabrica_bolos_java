PRÁTICA - FÁBRICA DE BOLOS

Você foi contratado por uma confeitaria para desenvolver um sistema que crie diferentes tipos de bolos com base na necessidade dos clientes. A confeitaria oferece bolos de chocolate, morango, cenoura e abacaxi. 
Cada bolo tem um sabor específico, mas segue um processo semelhante de criação. Para garantir que o processo seja flexível e extensível, você deve implementar uma solução utilizando o padrão Factory Method.

Requisitos:
Crie uma interface Bolo com o método preparar() que cada tipo de bolo implementará.
Crie classes concretas que representem os diferentes tipos de bolos: BoloChocolate, BoloMorango, BoloCenoura e BoloAbacaxi cada uma implementando o método preparar() da interface Bolo.
Crie uma classe FabricaBolo abstrata que tenha um método abstrato criarBolo() e um método concreto fazerBolo() que siga o processo de criação de um bolo (utilizando o método preparar()).
Crie classes concretas que herdam de FabricaBolo, como FabricaBoloChocolate, FabricaBoloMorango, FabricaBoloCenoura e FabricaBoloAbacaxi que implementam o método criarBolo().
Crie uma classe Principal para testar.
