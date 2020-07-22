package jameschristian.pottato.dev.recyclerview_modelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridHeroAdapter extends RecyclerView.Adapter<GridHeroAdapter.GridViewHolder> {
  private ArrayList<Hero> listHero;

  public GridHeroAdapter(ArrayList<Hero> listHero) {
    this.listHero = listHero;
  }

  @NonNull
  @Override
  public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_hero, parent, false);
    return new GridViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
    final Hero hero = new Hero();
    hero.setName(listHero.get(position).getName());

    Glide.with(holder.itemView.getContext())
            .load(listHero.get(position).getPhoto())
            .apply(new RequestOptions().override(350, 350))
            .into(holder.imgPhoto);

    holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(holder.itemView.getContext(), hero.getName(), Toast.LENGTH_SHORT).show();
      }
    });
  }

  @Override
  public int getItemCount() {
    return listHero.size();
  }

  public class GridViewHolder extends RecyclerView.ViewHolder {
    ImageView imgPhoto;

    public GridViewHolder(@NonNull View itemView) {
      super(itemView);
      imgPhoto = itemView.findViewById(R.id.imgItemPhoto);
    }
  }
}
