package br.com.elaine;

public class PrimeiraClasse {

    public static void main(String[] args) {

        String ambiente = args[0];
        if (ambiente.equals("DEV")) {
            System.out.println("executando dev");
        } else if (ambiente.equalsIgnoreCase("test")) {
            System.out.println("executando test");
        } else {
            System.out.println(ambiente);
        }

    }
}
