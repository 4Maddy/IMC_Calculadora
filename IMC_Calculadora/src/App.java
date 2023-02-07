import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa people = new Pessoa();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome:");
        people.setNome(sc.next());

        System.out.println("Digite seu Sobrenome:");
        people.setSobrenome(sc.next());

        System.out.println("Digite sua data de Nascimento\nDia:");
        int d = sc.nextInt();

        System.out.println("Mes (em numero):");
        int m = sc.nextInt();

        System.out.println("Ano:");
        int a = sc.nextInt();

        System.out.println("Digite sua altura:");
        people.setAltura(sc.nextDouble());

        System.out.println("Digite seu peso:");
        people.setPeso(sc.nextDouble());

        sc.close();

        Data dtNascimento = new Data(d, m, a);

        people.CalculaIdade(dtNascimento);

        people.CalculaIMC(people.getPeso(), people.getAltura());

        people.InformaObesidade(people.getImc());

        String nomeCompleto = people.getNome() + " " + people.getSobrenome();

        System.out.println("\n__________RESULTADO_____________");
        System.out.println("\nNome completo: " + nomeCompleto);
        System.out.println("Idade: " + people.getIdade());
        System.out.println("Peso: " + people.getPeso()+"kg");
        System.out.println("Altura: " + people.getAltura()+"cm");
        System.out.println("IMC: " + people.getImc());
        System.out.println("Classificacao: " + people.getCalassificacaoCorporal());
    }
}
