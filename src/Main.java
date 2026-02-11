import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Produto> produtosNome = new HashSet<>();

        produtosNome.add(new Produto("Smart TV 4k LED 60 Polegadas. ", 3000.00));
        produtosNome.add(new Produto("Smart TV 4k LED 60 Polegadas. ", 3000.00));
        produtosNome.add(new Produto("Smart TV 4k LED 80 Polegadas. ", 5000.00));


        System.out.println("Modelos de TV: " + produtosNome.size());
    }
    
}
