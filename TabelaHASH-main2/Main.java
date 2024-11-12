import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            HashSimples tabelaSimples = new HashSimples();
            HashMelhorada tabelaMelhorada = new HashMelhorada();
            
            tabelaMelhorada.insert("profe");
            tabelaMelhorada.insert("java");
            tabelaMelhorada.insert("dev");
            tabelaMelhorada.insert("marina");
            tabelaMelhorada.insert("ferias");
            tabelaSimples.insert("profe");
            tabelaSimples.insert("java");
            tabelaSimples.insert("dev");
            tabelaSimples.insert("marina");
            tabelaSimples.insert("ferias");
            
    }}