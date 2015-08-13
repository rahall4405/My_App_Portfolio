package rahall.com.nanodegree.myappportfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyPortfolioMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_portfolio_main);

    }




    public void popularMoviesAction(View view) {

        generateToast(getString(R.string.toast_placeholder_general) + getString(R.string.toast_placeholder_movies_app));

    }

    public void superDuoAction(View view) {

        generateToast(getString(R.string.toast_placeholder_general) + getString(R.string.toast_placeholder_super_duo_app));

    }

    public void buildItBiggerAction(View view) {

        generateToast(getString(R.string.toast_placeholder_general) + getString(R.string.toast_placeholder_build_it_bigger_app));

    }

    public void makeAppMaterialAction(View view) {

        generateToast(getString(R.string.toast_placeholder_general) + getString(R.string.toast_placeholder_make_app_material_app));

    }

    public void goUbiquitousAction(View view) {

        generateToast(getString(R.string.toast_placeholder_general) + getString(R.string.toast_placeholder_go_ubiquitous_app));

    }

    public void capstoneAction(View view) {

        generateToast(getString(R.string.toast_placeholder_general) + getString(R.string.toast_placeholder_capstone_app));

    }


    public void generateToast(String message) {
        Toast.makeText(getApplicationContext(), (String) message,
                Toast.LENGTH_LONG).show();
    }
}
