package homeloan.sphm.com.roomlibraryexample;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new InsertData().execute();
    }

    public class InsertData extends AsyncTask<Void, Void, Integer> {

        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Please Wait");
            pDialog.show();
        }

        @Override
        protected Integer doInBackground(Void... voids) {
            User user = new User();
            user.setId(2);
            user.setName("ABC");
            user.setAddress("ABCDEF");
            DatabaseClass.getInstance(MainActivity.this).userDao().insert(user);
            List<User> userslist = DatabaseClass.getInstance(MainActivity.this).userDao().getAll();
            Log.e(MainActivity.class.getSimpleName(), user.getAddress());
            return userslist.size();
        }

        @Override
        protected void onPostExecute(Integer integer) {
            Log.e(MainActivity.class.getSimpleName(), "Integer: " + integer);
            pDialog.dismiss();
        }
    }
}
