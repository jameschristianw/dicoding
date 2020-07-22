package jameschristian.pottato.dev.dota2heroes.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import jameschristian.pottato.dev.dota2heroes.R;
import jameschristian.pottato.dev.dota2heroes.data.Hero;
import jameschristian.pottato.dev.dota2heroes.data.HeroesData;

public class DetailActivity extends AppCompatActivity {

  ImageView imgHero, imgSkill1, imgSkill2, imgSkill3, imgSkill4;
  TextView tvHeroName, tvHeroBio;
  TextView tvHeroSkillTitle1, tvHeroSkillDesc1, tvHeroSkillTitle2, tvHeroSkillDesc2,
            tvHeroSkillTitle3, tvHeroSkillDesc3, tvHeroSkillTitle4, tvHeroSkillDesc4;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);

    Intent myIntent = getIntent();
    String heroName = myIntent.getStringExtra("HERONAME");
    Log.i("DetailActivity: ", heroName);
    Hero hero = HeroesData.getSpecificHero(heroName);

    //Init findViewById
    imgHero = findViewById(R.id.imgHero);
    imgSkill1 = findViewById(R.id.circleHeroSkill1);
    imgSkill2 = findViewById(R.id.circleHeroSkill2);
    imgSkill3 = findViewById(R.id.circleHeroSkill3);
    imgSkill4 = findViewById(R.id.circleHeroSkill4);

    tvHeroName = findViewById(R.id.tvHeroName);
    tvHeroBio = findViewById(R.id.heroDetailBiography);

    tvHeroSkillTitle1 = findViewById(R.id.tvHeroSkill1);
    tvHeroSkillTitle2 = findViewById(R.id.tvHeroSkill2);
    tvHeroSkillTitle3 = findViewById(R.id.tvHeroSkill3);
    tvHeroSkillTitle4 = findViewById(R.id.tvHeroSkill4);

    tvHeroSkillDesc1 = findViewById(R.id.tvHeroSkillDetail1);
    tvHeroSkillDesc2 = findViewById(R.id.tvHeroSkillDetail2);
    tvHeroSkillDesc3 = findViewById(R.id.tvHeroSkillDetail3);
    tvHeroSkillDesc4 = findViewById(R.id.tvHeroSkillDetail4);

    if (hero != null) {
      imgHero.setBackground(ContextCompat.getDrawable(getApplicationContext(), hero.getPhoto()));

      imgSkill1.setBackground(ContextCompat.getDrawable(getApplicationContext(), (hero.getSkills()).get(0).getSkillImage()));
      imgSkill2.setBackground(ContextCompat.getDrawable(getApplicationContext(), (hero.getSkills()).get(1).getSkillImage()));
      imgSkill3.setBackground(ContextCompat.getDrawable(getApplicationContext(), (hero.getSkills()).get(2).getSkillImage()));
      imgSkill4.setBackground(ContextCompat.getDrawable(getApplicationContext(), (hero.getSkills()).get(3).getSkillImage()));

      tvHeroName.setText(hero.getName());
      tvHeroBio.setText(hero.getBiography());

      tvHeroSkillTitle1.setText((hero.getSkills()).get(0).getSkillName());
      tvHeroSkillTitle2.setText((hero.getSkills()).get(1).getSkillName());
      tvHeroSkillTitle3.setText((hero.getSkills()).get(2).getSkillName());
      tvHeroSkillTitle4.setText((hero.getSkills()).get(3).getSkillName());

      tvHeroSkillDesc1.setText((hero.getSkills()).get(0).getSkillDesc());
      tvHeroSkillDesc2.setText((hero.getSkills()).get(1).getSkillDesc());
      tvHeroSkillDesc3.setText((hero.getSkills()).get(2).getSkillDesc());
      tvHeroSkillDesc4.setText((hero.getSkills()).get(3).getSkillDesc());
    } else {
      Toast.makeText(getApplicationContext(), "Really? Null?", Toast.LENGTH_SHORT).show();
    }
  }
}
