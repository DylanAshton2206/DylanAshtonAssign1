package Dylan.Ashton.n01442206;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//Dylan Ashton n01442206 RNA
public class DylanActivity extends AppCompatActivity {
    private Button DylanButton1;
    private Button DylanButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dylan);

        DylanButton1 = (Button) findViewById(R.id.DylanButton1);
        DylanButton2 = (Button) findViewById(R.id.DylanButton2);
        DylanButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenNewScreen();
            }
        });
        DylanButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast();
                goToWebPage("https://www.youtube.com/");
            }
        });
    }

    public void OpenNewScreen() {
        Intent intent = new Intent(this, AshtonActivity.class);
        startActivity(intent);
    }

    public void displayToast() {
        Toast.makeText(DylanActivity.this, "Dylan Ashton , youtube", Toast.LENGTH_SHORT).show();
    }

    public void goToWebPage(String yourUrl) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(yourUrl));
        startActivity(intent);
    }
}