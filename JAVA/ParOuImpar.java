class parImpar {
    public static void main (String args[]){
        int valor = (int)(Math.random() * 100); // Gera um número aleatório
        // Verifica se o número é par ou ímpar
        if (valor % 2 == 0)
        {
            System.out.println("O número é Par = "+valor);
        }
        else
        {
            System.out.println("O número é impar = "+valor);
        }
        }
    }