package Ex3;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "Dependencies",
            joinColumns = @JoinColumn(name = "Vehicle_ID"),
            inverseJoinColumns = @JoinColumn(name = "User_ID"))
    private List<UserDetails> userDetailsList;

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userDetailsList=" + userDetailsList +
                '}';
    }
}
