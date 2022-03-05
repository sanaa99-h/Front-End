package ma.cigma.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Client {
    private long id;
    private String name;

    public Client() {
    }
    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }
}