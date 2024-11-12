public class HashSimples extends HashAbstrata {
    @Override
    protected int hash(String key) {
        int hash = 0;
        for (char c : key.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                hash += (c - 'a' + 1);
            }
        }
        return Math.abs(hash % tamanho_tabela);
    }

    @Override
    protected int rehashing (String key){
        int valor =0;
        for (char c : key.toCharArray()) {
            if (Character.isLetter(c)) {
                valor += c;
            }
        }
        return Math.abs(valor % tamanho_tabela);
    }
}