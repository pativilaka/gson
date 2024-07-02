import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pessoa Complexa!");

        String json = """
                {
                    "Nome": "Pati",
                    "Cidade": "São Paulo"
                }
                """;

        //setLenient >> permissivo, neste exemplo daria na mesma Gson ou GsonBuilder
        Gson gson = new GsonBuilder()
                .setLenient()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        PessoaRecord pessoaRecord = gson.fromJson(json, PessoaRecord.class);
        System.out.println(pessoaRecord);

        Pessoa pessoa = new Pessoa(pessoaRecord);
        System.out.println(pessoa);
    }
}