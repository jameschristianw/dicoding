package jameschristian.pottato.dev.dota2heroes.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import jameschristian.pottato.dev.dota2heroes.R;
import jameschristian.pottato.dev.dota2heroes.adapter.CardViewHeroAdapter;
import jameschristian.pottato.dev.dota2heroes.adapter.ListHeroAdapter;
import jameschristian.pottato.dev.dota2heroes.data.Hero;
import jameschristian.pottato.dev.dota2heroes.data.HeroesData;

public class MainActivity extends AppCompatActivity {

  private RecyclerView rvHeroList;
  private ArrayList<Hero> heroes = new ArrayList<>();
  private MenuItem menuWithCardView, menuWithoutCardView;
  private int viewMode;
  private Menu menuList;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    rvHeroList = findViewById(R.id.rvHeroList);
    rvHeroList.setHasFixedSize(true);

    invalidateOptionsMenu();

    if(menuList != null){
      menuWithCardView = menuList.findItem(R.id.action_cardview);
      menuWithoutCardView = menuList.findItem(R.id.action_no_cardview);

      if(viewMode == R.id.action_cardview ){
        menuWithCardView.setEnabled(false);
        menuWithoutCardView.setEnabled(true);
//        menuWithoutCardView.setVisible(true);
//        menuWithCardView.setVisible(false);
      } else {
        menuWithCardView.setEnabled(true);
        menuWithoutCardView.setEnabled(false);
//        menuWithoutCardView.setVisible(false);
//        menuWithCardView.setVisible(true);
      }
    }

    heroes.addAll(HeroesData.getListData());
//    showRecyclerList();
    showRecyclerCard();
  }

  private void showRecyclerList(){
    viewMode = R.id.action_no_cardview;
    rvHeroList.setLayoutManager(new LinearLayoutManager(this));
    ListHeroAdapter listHeroAdapter = new ListHeroAdapter(heroes);
    rvHeroList.setAdapter(listHeroAdapter);
  }

  private void showRecyclerCard(){
    viewMode = R.id.action_cardview;
    rvHeroList.setLayoutManager(new LinearLayoutManager(this));
    CardViewHeroAdapter listHeroAdapter = new CardViewHeroAdapter(heroes);
    rvHeroList.setAdapter(listHeroAdapter);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_list, menu);
    menuList = menu;
    return super.onCreateOptionsMenu(menu);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    setMode(item.getItemId());
    return super.onOptionsItemSelected(item);
  }

  public void setMode(int selectedMode) {
    switch (selectedMode) {
      case R.id.action_no_cardview:
        showRecyclerList();
        break;
      case R.id.action_cardview:
        showRecyclerCard();
        break;
      case R.id.action_about_me:
        Intent i = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(i);
//        makeToast("Menu About Me");
    }
  }

  public void makeToast(String text){
    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
  }
}
