#📄 Funcionamento do Programa

O programa recebe os seguintes parâmetros durante a execução:


| Entrada                      | Saída |
|-------------------------------|-------|
| movel                         |       |
| Alice,movel,fixa              | Sim   |
| fixa                          |       |
| Bob,movel,tv                  | Nao   |
| tv                            |       |
| Carol,movel,fixa,tv           | Sim   |

---

# 📋 Explicação

- Primeiro, o programa pede para digitar o **serviço** que será verificado.
- Em seguida, o programa pede para digitar o **nome do cliente** e a **lista de serviços contratados**, separados por vírgula.
- O programa verifica se o serviço informado está entre os serviços contratados pelo cliente e imprime:
  - `Sim` caso o serviço tenha sido contratado.
  - `Nao` caso o serviço não tenha sido contratado.

---

# 🛠 Exemplo de Uso

```plaintext
Digite o serviço:
movel
Digite o cliente e serviços contratados:
Alice,movel,fixa
Saída:
Sim
