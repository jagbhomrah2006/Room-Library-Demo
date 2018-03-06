package homeloan.sphm.com.roomlibraryexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by SPHM-APP on 06-03-2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class DatabaseClass extends RoomDatabase {

    private static DatabaseClass INSTANCE;
    private static String DB_NAME = "sample.db";

    public static synchronized DatabaseClass getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = create(context);
        }
        return INSTANCE;
    }

    private static DatabaseClass create(final Context context) {
        return Room.databaseBuilder(
                context,
                DatabaseClass.class,
                DB_NAME).build();
    }

    public abstract UserDao userDao();

}
