package Classes;

public class User {
    public String name;
    public String cpf;

    public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return name;
    }
}
