# Projeto TCC - API para Cadastro de Animais
Este projeto foi desenvolvido como parte do meu TCC, com o objetivo de criar uma API para o gerenciamento de cadastro de animais. O cadastro é realizado por meio de um aplicativo mobile, desenvolvido com **React Native**, que também está disponível no meu GitHub.
## **Como Subir o Projeto Backend**
Para rodar o backend da aplicação, siga os passos abaixo:
1. Certifique-se de ter o **Docker** instalado.
2. Suba o banco de dados MySQL usando o comando:
``` bash
   docker-compose up
```
1. Após o banco estar configurado, rode o projeto em sua máquina local normalmente usando a IDE de sua preferência (como IntelliJ ou Eclipse).

## **Endpoints Disponíveis**
### **Cadastro de Dono**
- **Descrição**: Permite cadastrar os dados de um novo dono.
- **Método HTTP**: `POST`
- **Endpoint**: `/dono/addDono`

### **Busca de Dono**
- **Descrição**: Busca informações de um dono cadastrado no sistema por ID.
- **Método HTTP**: `GET`
- **Endpoint**: `/dono/buscarDono/{id}`

### **Cadastro de Pet**
- **Descrição**: Adiciona um novo pet no sistema.
- **Método HTTP**: `POST`
- **Endpoint**: `/pet/addPet`

### **Listar Todos os Pets Perdidos**
- **Descrição**: Retorna uma lista de todos os pets marcados como _perdidos_.
- **Método HTTP**: `GET`
- **Endpoint**: `/pet/`

### **Listar Todos os Pets Encontrados**
- **Descrição**: Filtra e retorna todos os pets que estão marcados como _encontrados_.
- **Método HTTP**: `GET`
- **Endpoint**: `/pet/petEncontrado/{id}`

### **Listar Meus Pets Perdidos**
- **Descrição**: Retorna uma lista de todos os pets marcados como _perdidos_ que pertencem ao dono autenticado no sistema (identificado pelo email).
- **Método HTTP**: `GET`
- **Endpoint**: `/pet/meusPets/{email}`

### **Listar Meus Pets Encontrados**
- **Descrição**: Retorna uma lista de todos os pets marcados como _encontrados_ que pertencem ao dono autenticado no sistema (identificado pelo email).
- **Método HTTP**: `GET`
- **Endpoint**: `/pet/meusPetsEncontrados/{email}`

### **Detecção de Pet em Imagem**
- **Descrição**: Detecta se existe um pet presente em uma imagem enviada no atributo `base64`. Pode fazer o registro automático dependendo do status detectado.
- **Método HTTP**: `POST`
- **Endpoint**: `/pet/detect`

Se tiver qualquer dúvida ou sugestão, sinta-se à vontade para abrir uma **issue** ou entrar em contato! 😊
Espero que isso atenda às suas necessidades! Se desejar ajustar algum detalhe, é só avisar. 🚀

