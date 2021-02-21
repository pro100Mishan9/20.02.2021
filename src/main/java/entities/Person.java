package entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "Imie", nullable = false, length = 50)
    private String firstName;
    @Column(name = "Nazwisko", nullable = false)
    private String surname;
    @Column(name = "Pesel", nullable = false)
    private long pesel;
    @Column(name = "Wiek", nullable = true)
    private int age;
    private BigDecimal bigDecimal;
    private Integer integer;
    private boolean aBoolean;
    private MyEnum myEnum;
    @Transient
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public void setMyEnum(MyEnum myEnum) {
        this.myEnum = myEnum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
