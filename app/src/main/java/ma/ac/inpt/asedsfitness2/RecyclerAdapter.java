package ma.ac.inpt.asedsfitness2;



import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ExerciceViewHolder> {

    private List<ExerciseObject> exercicesList;
    private Context context;

    public RecyclerAdapter(List<ExerciseObject> exercicesList, Context context) {
        this.exercicesList = exercicesList;
        this.context = context;
    }

    @NonNull
    @Override
    public ExerciceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_exervice_card,parent,false);

        return new ExerciceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciceViewHolder holder, int position) {
        holder.textViewExerciceName.setText(exercicesList.get(position).title);
        holder.imageViewExerciceImage.setImageResource(exercicesList.get(position).image);
        holder.cardView.setOnClickListener(view -> {

            Intent i = new Intent(context, Description.class);
            i.putExtra("ex", exercicesList.get(position));
            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return exercicesList.size();
    }

    public class ExerciceViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewExerciceName;
        private ImageView imageViewExerciceImage;
        private CardView cardView;

        public ExerciceViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewExerciceName = itemView.findViewById(R.id.textViewExerciceName);
            imageViewExerciceImage = itemView.findViewById(R.id.imageViewExercice);
            cardView = itemView.findViewById(R.id.cardViewExerciceDescription);
        }

    }

}
