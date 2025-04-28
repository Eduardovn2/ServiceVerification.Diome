import java.util.Scanner;
/**O enunciado pede que esses dados sejam verificados e que a Saida seja igual.
 * Entrada	            Saída
 movel
 Alice,movel,fixa	    Sim
 fixa
 Bob,movel,tv	        Nao
 tv
 Carol,movel,fixa,tv	Sim
 *
 */

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviço
        // s contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        //o for entra no "I = 1", assim nao começa no nome
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equals(servico)) {
                contratado = true;
                break;
            }
        }

        if(contratado){
            System.out.print("Sim");
        }else
            System.out.print("Nao");
        // TODO: Verifique se o serviço está na lista de serviços contratados

        scanner.close();
    }
}