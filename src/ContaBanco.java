import java.util.Scanner;
import java.util.Locale;
public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        User usuario = new User();

        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        usuario.definirNome(nome);
        
        System.out.println("Qual é o número da sua conta bancária? ");
        int numero = scanner.nextInt();
        usuario.definirNumero(numero);

        System.out.println("Qual é a agencia da sua conta bancária? ");
        String agencia = scanner.next();
        usuario.definirAgencia(agencia);

        System.out.println("Qual é o seu saldo bancário? ");
        Double saldo = scanner.nextDouble();
        usuario.definirSaldo(saldo);

        System.out.println("Olá " + usuario.nome + ", obrigado por criar uma conta em nosso banco,sua agência é " + usuario.agencia + ", conta " + usuario.numero + " e seu saldo " + usuario.saldo + " já está disponível para saque");
    } 
}