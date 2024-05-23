public class Operadores {
    public static void main(String[] args) throws Exception {
        double soma = 10.5 + 5.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 5;
        int divisao = 15/3;
        int modulo = 18%3;
        double resultado = (10*7) + (20/4);

        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?"; 
        concatenacao = 1+1+1+"1"; //31
        concatenacao = 1 + "1" + 1 + 1; //1111 --> Não faz mais operação depois da primeira ocorrência de concatenação
        concatenacao = "1" + "1" + 1; //111
        concatenacao = "1" + (1+1+1); //13 --> Fez soma por causa dos parenteses

        int numero = 5;
        System.out.println(-numero); //Imprime -5
        System.out.println(numero); //Imprime 5

        numero++;
        System.out.println(numero); //imprime 6
        System.out.println(numero++); //Continua imprimindo 6
        System.out.println(numero); //Imprime 7
        System.out.println(++numero); //Imprime 8

        int a, b;
        a = 5;
        b = 6;

        String res = a==b?"verdadeiro" : "falso"; //Se forem iguais, imprime verdadeiro, se não, imprime falso
        System.out.println(res);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println(simNao);

        simNao = numero1 != numero2;

        System.out.println(simNao);

        simNao = numero1 > numero2;

        System.out.println(simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.print("As duas condições são verdadeiras");
        } else {
            System.out.print("Uma ou ambas as condições são falsas");
        }

        if(condicao1 || condicao2){
            System.out.print("Uma das condições é verdadeira");
        } else {
            System.out.print("ambas as condições são falsas");
        }
    }
}
