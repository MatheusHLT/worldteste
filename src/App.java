import java.util.Scanner;

public class App {

    public static void hello(String name) {
        System.out.println("Olá, " + name);
    }
    public static void main(String[] args) throws Exception {
        Scanner typeName = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = typeName.nextLine();
        hello(name);

        int a = 0;

        while (a < 10) {

            if (a == 10) {
                a = 0;
            }
            System.out.println(a);
            a++;
        }

        typeName.close();
    }
}
