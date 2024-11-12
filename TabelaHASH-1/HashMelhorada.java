public class HashMelhorada extends HashAbstrata {
    @Override
    protected int hash(String key) {
        int hash = 0;
        int peso = 1;
        
        for (char c : key.toCharArray()) {
            hash += c * peso;
            peso = (peso * 31) % tamanho_tabela;
        }
        
        return Math.abs(hash % tamanho_tabela);
    }

    protected int rehashing (String k){
        int valor =0;
        valor = k.toCharArray()[0];
        valor= (valor*3)%tamanho_tabela;
        return valor;
    }
}