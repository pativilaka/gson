public record LivroRecord(String titulo, String autor, EditoraRecord editora) {

    @Override
    public String toString() {
        return "Titulo: " + titulo + " ||| Autor: " + autor +
                "\nEditora: " + editora;
    }

}
