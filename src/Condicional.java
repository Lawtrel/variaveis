public class Condicional {
    public static void main(String[] args) {
        System.out.println("Condicionais");
        int id = 5;
        int auth = 3;
        if (id >= 18) {
            System.out.println("Logando....");
            System.out.println("Login Feito com sucesso!");
        } else {
            if (auth == 3) {
                System.out.println("Voce tem o codigo de acesso nivel 3, logando... \n" +
                        "!!!Logado com Sucesso!!!!");
            } else {
                System.out.println("Login Invalido!");
            }
        }
    }
}
