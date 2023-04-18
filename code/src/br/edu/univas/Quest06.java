package br.edu.univas;

public class Quest06 {
    public static void main(String[] args) {
    String palavra = "You all gotta remember my name BIG SMOKE AAAAAAAAAGRH";
    int tamanho = palavra.length();
    char[] tempCharArray = new char[tamanho];
    char[] charArray = new char[tamanho];
    for (int i = 0; i < tamanho; i++){
        tempCharArray[i] = palavra.charAt(i);
    }
    for (int j = 0; j < tamanho; j++){
        charArray[j] = tempCharArray[tamanho - 1 - j];
    }
    String palavraInvertida = new String(charArray);
        System.out.println(palavraInvertida);
    }
}
