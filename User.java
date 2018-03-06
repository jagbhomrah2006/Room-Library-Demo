package homeloan.sphm.com.roomlibraryexample;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by SPHM-APP on 06-03-2018.
 */

@Entity
public class User {

    @PrimaryKey
    public int id;
    public String name;
    public String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
