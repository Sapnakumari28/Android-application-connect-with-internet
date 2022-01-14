import android.content.Intent;

import android.net.Uri;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;



public class MainActivity extends AppCompatActivity {

Button button;



@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

button = findViewById(R.id.button);



button.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View v) {



gotoUrl("https://www.instagram.com/p/CV8JQ1sPeGq_poLCZwZxi3gC2FjlORPDIN

rxRM0/?utm_medium=copy_link");

}

});

}



private void gotoUrl(String s) {

Uri uri = Uri.parse(s);

startActivity(new Intent(Intent.ACTION_VIEW,uri));

}}
