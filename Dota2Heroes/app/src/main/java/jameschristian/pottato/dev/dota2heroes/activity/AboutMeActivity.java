package jameschristian.pottato.dev.dota2heroes.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import jameschristian.pottato.dev.dota2heroes.R;

public class AboutMeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about_me);

    if (getSupportActionBar() != null){
      this.setTitle("About Me");
    }
  }
}
