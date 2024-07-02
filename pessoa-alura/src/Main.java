import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pessoa!");

        String json = """
                { "nome": "Pati",
                  "idade": 42,
                  "cidade": "São Paulo"
                }
                 """;

        Gson gson = new Gson();
        PessoaRecord pessoaRecord = gson.fromJson(json, PessoaRecord.class);
        System.out.println(pessoaRecord);
        System.out.println(pessoaRecord.idade());
    }
}