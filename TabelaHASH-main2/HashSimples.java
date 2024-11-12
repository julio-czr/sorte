public class HashSimples extends HashAbstrata {
    @Override
    protected int hash(String key, int peso) {
        int hash = 0;
        for (char c : key.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                hash += (c - 'a' + 1);
            }
        }
        return Math.abs((hash + peso) % tamanho_tabela);
    }
}