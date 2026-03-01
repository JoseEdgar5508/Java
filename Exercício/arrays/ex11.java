package arrays;

public class ex11 {
    public static void main(String[] args) {
        int [] numeros = {78, 7, 6, 7, 78};

        boolean ehPolimero = true;

        for(int i = 0; i < numeros.length / 2; i++){
            if(numeros[i] != numeros[numeros.length -1 -i]){
                ehPolimero = false;
                break;
            }
        }

        if(ehPolimero){
            System.out.println("É Polimero.");
        }else{
            System.out.println("Não é Polimero.");
        }
    }
}
