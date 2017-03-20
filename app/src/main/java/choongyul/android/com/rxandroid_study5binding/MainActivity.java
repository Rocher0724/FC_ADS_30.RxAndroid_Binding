package choongyul.android.com.rxandroid_study5binding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RxTextView.textChangeEvents(
                (EditText) findViewById(R.id.et1))
                .subscribe(
                        word -> Log.e("search word",word.text().toString())
                );
    }
}
