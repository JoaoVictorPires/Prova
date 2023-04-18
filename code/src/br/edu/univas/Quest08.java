package br.edu.univas;

public class Quest08 {
    public static void main(String[] args) {
        String palavra1 = "You all";
        String palavra2 = " gotta remeber";
        String palavra3 = " my name";
        String palavra4 = " BIG SMOKE AAAAAAAARG";
        String nova = palavra1.concat(palavra2 + palavra3 + palavra4);
        System.out.println(nova);
    }
}
