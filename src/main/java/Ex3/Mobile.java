package Ex3;

import jdk.jfr.Enabled;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
@NoArgsConstructor
public class Mobile {
    @Id
    @GeneratedValue
    private long id;
    @Transient
    private String Brand;
    @Transient
    private String model;
    private long mobileNumber;
    @ManyToOne
    @JoinColumn
    private UserDetails userDetails;

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", userDetailsList=" + userDetails +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
