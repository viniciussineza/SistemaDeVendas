import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GerarNomes {
    // TODO refatorar número aleatório;
    private Random random = new Random();
    private String[] nomesDisponíveis = new String[] {
            "Muhammad", "Said", "Omar", "Ali", "Hassan",
            "Jamal", "Zayn", "Layla", "Khadija", "Malika",
            "Aisha", "Ahmed", "Ziad", "Haya", "Isla",
            "Farid", "Elif", "Yasemin", "Miray", "Burak",
            "Mustafa", "Erkin", "Gizem", "Najla", "Rana",
            "Abeba", "Amara", "Nala", "Taraji", "Zuri",
            "Aadan", "Amari", "Jabari", "Imamu", "Yuusuf",
            "Asim", "Akila", "Bahiti", "Bastet", "Farida",
            "Hibo", "Imamu", "Idir", "Makena", "Ola",
            "Zendaya", "Zola", "Dania", "keket", "Ada"
    };
    private String[] nomesVendedoresGerados = new String[10];


    private void nomesVendedores() {

        for (int i = 0; i < nomesVendedoresGerados.length; i++) {

            String nome = nomesDisponíveis[random.nextInt(nomesDisponíveis.length)];

            for (int j = 0; j < nomesVendedoresGerados.length; j++ ) {
                if (nome == nomesVendedoresGerados[j]) {
                    nome = nomesDisponíveis[random.nextInt(nomesDisponíveis.length)];
                }
            }

            nomesVendedoresGerados[i] = nome;
        }
        // TODO - NÃO REPETIR NOME
    }

    public String[] nomesVendedoresGerados() {
        nomesVendedores();
        return this.nomesVendedoresGerados;
    }

}
