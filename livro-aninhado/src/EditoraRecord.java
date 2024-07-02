public record EditoraRecord(String nome, String cidade) {

    @Override
    public String toString() {
        return "Editora { " + nome + " " + cidade + " }";
    }

}
