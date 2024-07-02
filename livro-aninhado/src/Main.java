import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Livros Aninhados!");

        String json = """
                {
                    "titulo": "Aventuras de Java",
                    "autor": "Akemi",
                    "editora": {
                                    "nome": "TechBooks",
                                    "cidade": "São Paulo"
                                }
                }
                """;

        Gson gson = new Gson();
        LivroRecord livro = gson.fromJson(json, LivroRecord.class);
        System.out.println(livro);

    }
}