import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Cpf {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> cpfMap = new HashMap<String,String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 5 CPF's e 5 numeros de Telefone");
        int i = 0;

        while (i < 5){

            System.out.println("\nDigite seu CPF: ");
            String cpf =  scanner.next();

            if (cpf.length() != 11) {
                System.out.println("O CPF precisa ter 11 digitos digite novamente!");
                continue;
            }

            if(cpfMap.containsKey(cpf)){
                System.out.println("Este CPF já foi cadastrado digite outro!");
                continue;
            }

            System.out.println("Numero de Telefone: ");
            String tel =  scanner.next();

            cpfMap.put(cpf, tel);  
            i++;

        };
        
        System.out.println(cpfMap);
        System.out.println("Digite um CPF digitado anteriormente para realizar a busca: ");
        String buscaCpf = scanner.next();

        //Questão 3
        System.out.println("O telefone do CPF procurado é: " + cpfMap.get(buscaCpf));

        }
}
