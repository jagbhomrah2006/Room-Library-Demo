package homeloan.sphm.com.roomlibraryexample;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by SPHM-APP on 06-03-2018.
 */

@Dao
public interface UserDao {

    @Query("select * from User")
    List<User> getAll();

    @Insert
    void insert(User user);
}
