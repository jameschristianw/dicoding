package jameschristian.pottato.dev.dota2heroes.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.Serializable;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import jameschristian.pottato.dev.dota2heroes.R;
import jameschristian.pottato.dev.dota2heroes.activity.DetailActivity;
import jameschristian.pottato.dev.dota2heroes.data.Hero;

public class CardViewHeroAdapter extends RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder> {
  private ArrayList<Hero> heroes;
  private Context mContext;

  public CardViewHeroAdapter(ArrayList<Hero> heroes) {
    this.heroes = heroes;
  }

  @NonNull
  @Override
  public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_hero, parent, false);
    return new CardViewHeroAdapter.CardViewViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
    final Hero hero = heroes.get(position);

    holder.tvHeroName.setText(hero.getName());
    holder.tvHeroBio.setText(hero.getBiography());
    Glide.with(holder.itemView.getContext())
            .load(hero.getPhoto())
            .apply(new RequestOptions().override(70, 70))
            .into(holder.heroImage);

    holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
//        Toast.makeText(holder.itemView.getContext(), hero.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
        intent.putExtra("HERONAME", hero.getName());
        mContext.startActivity(intent);
      }
    });
  }

  @Override
  public int getItemCount() {
    return heroes.size();
  }

  public class CardViewViewHolder extends RecyclerView.ViewHolder {
    CircleImageView heroImage;
    TextView tvHeroName, tvHeroBio;

    public CardViewViewHolder(@NonNull View itemView) {
      super(itemView);

      mContext = itemView.getContext();
      heroImage = itemView.findViewById(R.id.circleHeroImage);
      tvHeroName = itemView.findViewById(R.id.tvHeroName);
      tvHeroBio = itemView.findViewById(R.id.tvHeroBio);
    }
  }
}
