# Estudos da faculdade sobre Java

## **Vetores**:

São estruturas de dados que agregam elementos do **mesmo** **tipo** na memória, identificando-os através de índices que, no Java, iniciam-se a partir do 0.

Sintaxe:

```java
    tipo[] nomeVetor;
    tipo[] nomeVetor = new tipo[qntdElementos];
    tipo[] nomeVetor = {elementos, ...};
```

## **Matrizes**:

Sintaxe:

```java
    tipo[][] nomeMatriz;
    tipo[][] nomeMatriz = new tipo[qntdElementos][qntdElementos];
    tipo[][] nomeMatriz = {
        {valor, valor, valor},
        {valor, valor, valor},
        {valor, valor, valor}
    };
```

## **Procedimento x Função**:

Função: Obrigatoriamente tem retorno;
Procedimento: NÃO tem retorno.

Sintaxe:

```java
    public class Aula{
        static void exemploProcedimento(tipo parametros){
            System.out.println("");
        }

        tipoDoRetorno exemploFuncao(tipo parametros){
            return algumRetorno;
        }

        public static void main(String[] args){
            exemploProcedimento(parametros);

            // Utilizando função não static:
            Aula a1 = new Aula();
            tipo response = a1.exemploFuncao(parametros);
        }
    }
```

## **Class**:

É um "molde" para criar objetos que possui atributos e métodos.

Sintaxe:

```java
    public class Aluno{
        // Atributos:
        String nome;
        String ra;
        String facul;
        double nota;
        int semestre;
        boolean mesalidadePaga;

        // Métodos
        void pagarMensalidade(){
            if(!this.mensalidadePaga){
                this.mensalidadePaga = true;
                System.out.println("Pagamento realizado!")
            } else{
                System.out.print("A mensalidade já foi paga anteriormente.")
            }
        }

        void mudarFaculdade(String faculdade){
            // o atributo faculdade está recebendo o valor faculadade que será
            // passado como argumento do Procedimento.
            this.faculdade = faculdade;
        }
    }
```

_Obs: Para evitar ambiguidade, todo atributos referentes ao objeto, usa-se this_
