# **Pattern Name and Classification**
 **Template Method**

# **Intent**

A inteção desse padrão de projeto é definir a estrutura base das classes do projeto e quando houver a necessidade implementar as partes especificas de cada uma.

Por exemplo, quando projetamos um software para uso em mais de um sistema operacional, o Windows precisa de um conjunto de classes de exibição, o Linux precisa de outro conjunto e o mac também precisa de outro conjunto. Utilizando o Template Method você só precisa extrair suas operações comuns para escrever uma classe de estrutura e em seguida, usar a classe correspondente quando usar especificamente no sistema operacional desejado.

# **Motivation**

Suponha que você esteja desenvolvendo um jogo para multiplataforma, na versão alpha você implementa cada classe para um sistema operacional especifico (Windows e mac), depois de um tempo você descobre que as duas classes contêm muitos códigos semelhantes, embora esses códigos lidem com diferentes formatos de dados completamente diferentes implementando as necessidades de cada sistema operacional.
O padrão Template Method sugere que o código seja divido entre as classes que possuem o código comum chamadas de template e as classes que possui partes especificas de implementações.

# **Applicability**

Implemente a parte que não muda de uma classe e deixe as outras partes para a implementação da subclasse;

# **Structure**

[Imagem com a estrutura](https://github.com/LucasHOliveira/Trabalho-TemplateMethod/blob/master/ImagemEstrutura/Estrutura.png)

# **Participants**

Nome: LucasGonçalves

RA: 1811511908

# **Sample Code**

[Link para a pasta do código](https://github.com/LucasHOliveira/Trabalho-TemplateMethod/tree/master/ProjetoTM-C%C3%B3digo/.metadata)