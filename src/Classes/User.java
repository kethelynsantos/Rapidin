package Classes;

public class User {
    private String name;
    private String cpf;

    public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return name + " " + cpf;
    }
}
