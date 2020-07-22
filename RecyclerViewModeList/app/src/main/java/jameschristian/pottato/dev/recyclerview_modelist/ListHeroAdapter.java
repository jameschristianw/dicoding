package jameschristian.pottato.dev.recyclerview_modelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {

  private ArrayList<Hero> listHero;

  private OnItemClickCallback onItemClickCallback;

  public ListHeroAdapter(ArrayList<Hero> listHero) {
    this.listHero = listHero;
  }

  @NonNull
  @Override
  public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hero, parent, false);
    return new ListViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
    final Hero hero = listHero.get(position);
    Glide.with(holder.itemView.getContext())
            .load(hero.getPhoto())
            .apply(new RequestOptions().override(55, 55))
            .into(holder.imgPhoto);
    holder.tvName.setText(hero.getName());
    holder.tvDetail.setText(hero.getDetail());

    holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        onItemClickCallback.onItemClicked(hero);
      }
    });
  }

  @Override
  public int getItemCount() {
    return listHero.size();
  }

  public class ListViewHolder extends RecyclerView.ViewHolder {
    CircleImageView imgPhoto;
    TextView tvName, tvDetail;

    public ListViewHolder(@NonNull View itemView) {
      super(itemView);

      imgPhoto = itemView.findViewById(R.id.imgItemPhoto);
      tvName = itemView.findViewById(R.id.tvItemName);
      tvDetail = itemView.findViewById(R.id.tvItemDetail);
    }
  }

  public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
    this.onItemClickCallback = onItemClickCallback;
  }

  public interface OnItemClickCallback {
    void onItemClicked(Hero data);
  }
}
