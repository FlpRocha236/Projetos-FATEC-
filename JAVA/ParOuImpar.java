class parImpar {
    public static void main (String args[]){
        int valor = (int)(Math.random() * 100); // Gera um número aleatório
        
        if (valor % 2 == 0) // Verifica se o número é par ou ímpar
        {
            System.out.println("O número é Par = "+valor); // Exibe o resultado Par
        }
        else
        {
            System.out.println("O número é impar = "+valor); // Exibe o resultado impar
        }
        }
    }