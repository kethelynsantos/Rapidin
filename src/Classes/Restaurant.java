package Classes;

public class Restaurant {
    private String name;
    private String cnpj;

    public Restaurant(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return name + " " + cnpj;
    }
}
