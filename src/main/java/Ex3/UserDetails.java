package Ex3;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
@NoArgsConstructor
public class UserDetails {

    @Id
    @GeneratedValue
    private int id;
    private String userName;
    @OneToOne
    private Address address;
    @Transient
    @ManyToMany
    private List<Vehicle> vehicleList;
    @Transient
    @OneToMany
    private List<Mobile> mobileList;

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", address=" + address +
                ", vehicleList=" + vehicleList +
                ", mobileList=" + mobileList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Mobile> getMobileList() {
        return mobileList;
    }

    public void setMobileList(List<Mobile> mobileList) {
        this.mobileList = mobileList;
    }
}
