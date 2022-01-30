package Dylan.Ashton.n01442206;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

//Dylan Ashton n01442206 RNA
public class DylanActivity extends AppCompatActivity {
    private Button DylanButton1;
    private Button DylanButton2;
    private CoordinatorLayout coordinatorlayout;
    private EditText et;
    private String Txt;
    private String tag="Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dylan);


        et=findViewById(R.id.DylanEditText);

        DylanButton1 = findViewById(R.id.DylanButton1);    //Button 1
        DylanButton1.setOnClickListener(view -> {
            DisplayToast();
            GoToWebPage("https://www.youtube.com/");
        });

        coordinatorlayout = findViewById(R.id.DylanCoordinatorLayout); //Button 2 with SnackBar
        DylanButton2 = findViewById(R.id.DylanButton2);
        DylanButton2.setOnClickListener(view -> Showsnackbar());

    }

    public void DisplayToast() {
        Toast.makeText(DylanActivity.this, "Dylan Ashton , youtube", Toast.LENGTH_SHORT).show(); //unable to pass string.xml values
    }

    public void GoToWebPage(String yourUrl) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(yourUrl));
        startActivity(intent);
    }
    public void Showsnackbar() {
        Snackbar snackbar = Snackbar.make(coordinatorlayout, "Dylan Ashton Second screen", Snackbar.LENGTH_INDEFINITE) //unable to pass string.xml values
                .setAction("Next Screen", v -> Pass());
        snackbar.show();
    }
    public void Pass(){
        Intent i=new Intent(DylanActivity.this,AshtonActivity.class);
        Txt=et.getText().toString();
        i.putExtra("Value",Txt); //unable to pass string.xml values
        startActivity(i);
    }
    public void onStop(){
        super.onStop();
        Log.d(tag,"Dylan Ashton n01442206"); //unable to pass string.xml values
    }
}