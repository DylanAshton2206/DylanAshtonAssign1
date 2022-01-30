package Dylan.Ashton.n01442206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

//Dylan Ashton n01442206 RNA
public class AshtonActivity extends AppCompatActivity {

    TextView Edit;
    String Txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashton);

        Edit=findViewById(R.id.DylanTextView2);
        Txt=getIntent().getExtras().getString("Value");
        Edit.setText(Txt);
    }
}