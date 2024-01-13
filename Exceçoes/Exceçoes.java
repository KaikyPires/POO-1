
package exceçoes;

public class Exceçoes {

    public static void main(String[] args) {
       
        int vet [] = new int[4];
        
        System.out.println("Msg antes da exceção");
        try {
            vet[4] = 1;
            System.out.println("Essa msg ñ vai ser exibida");
        }
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println("OCORREU UMA EXCEÇAO");
        }
    }
    
    
}
