// Este é um arquivo onde eu irei testar e aplicar conhecimentos aprendidos de uma forma livre

import java.util.Scanner;

public class App {

    public static void hello(String name) {
        System.out.println("Oi, " + name);
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
