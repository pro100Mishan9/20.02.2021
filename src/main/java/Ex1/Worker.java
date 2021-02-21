package Ex1;

import javax.persistence.*;

@Entity
@Table(name = "Workers_data")
@SecondaryTable(name = "Organization_data", pkJoinColumns = @PrimaryKeyJoinColumn(name = "worker_id"))

public class Worker {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "Imie", nullable = false, length = 50)
    private String name;
    @Column(name = "Nazwisko", nullable = false, length = 50)
    private String surname;
    @Column(name = "Stanowisko", nullable = false, length = 50)
    private String position;
    @Column(name = "Staż_pracy", nullable = false, table = "Organization_data")
    private double experience;
    @Column(name = "Pensja", nullable = false, table = "Organization_data")
    private double salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
