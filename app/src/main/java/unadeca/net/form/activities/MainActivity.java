package unadeca.net.form.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

import unadeca.net.form.R;
import unadeca.net.form.database.models.TestModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo);
        Toolbar toolbar = findViewById(R.id.toolbar);
        HtmlTextView htmlview = findViewById(R.id.htmlText);

        TestModel t1 = new TestModel();
        t1.name = "Pedrito";
        t1.name = "Carmelo";
        t1.save();


        htmlview.setHtml("<h2>Hello wold</h2><img src=\"http://www.example.com/cat_pic.png\"/>",
                new HtmlHttpImageGetter(htmlview));

    }
}
