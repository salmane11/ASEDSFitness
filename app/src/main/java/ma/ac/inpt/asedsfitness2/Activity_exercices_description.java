package ma.ac.inpt.asedsfitness2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Activity_exercices_description extends AppCompatActivity {
    CardView cardView;
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<ExerciseObject> exerciceList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercices_description);
        cardView = findViewById(R.id.cardViewExerciceDescription);
        recyclerView = findViewById(R.id.recyclerViewExerciceDescription);
        recyclerView.setLayoutManager(new LinearLayoutManager(Activity_exercices_description.this));
        emptyList();
        fullList();


        recyclerAdapter = new RecyclerAdapter(exerciceList,Activity_exercices_description.this);
        recyclerView.setAdapter(recyclerAdapter);

    }

    private void emptyList() {
        exerciceList.clear();
    }

    private void fullList() {
        exerciceList.add(new ExerciseObject(R.drawable.abdos,"ABDOS",R.drawable.abdodesc1,R.drawable.abdodesc2,"Muscle: Droit de l'Abdomen\n" +
                "Étape 1: Allongez-vous sur un banc décliné. Positionnez vos mains au-dessus de la tête. Fléchissez les genoux.\n" +
                "Étape 2: Enroulé le buste tout en gardant le bas du dos contre le banc. Tenez la position pendant une seconde. Revenez à la position initiale."));
        exerciceList.add(new ExerciseObject(R.drawable.dorsaux,"DORSAUX",R.drawable.dorseauxdesc1,R.drawable.dorseauxdesc2,"Muscle: Grand Dorsal\n" +
                "Étape 1 : Choisissez un poids adéquat, agenouillez-vous ou tenez-vous debout sur la plateforme et saisissez les poignées. Gardez les muscles abdominaux et lombaires contractés, puis dépliez vos bras jusqu'à ce qu'ils soient complètement tendus. Assurez-vous que vos épaules soient rétractées vers le bas afin d'isoler la tension au niveau des muscles du dos.\n" +
                "Étape 2 : Tout en contrôlant le mouvement ainsi que les coudes pointés en arrière et vers le bas, tirez sur les bras pour revenir à la position initiale. Faites le nombre de répétitions que vous désirez."));
        exerciceList.add(new ExerciseObject(R.drawable.biceps,"BICEPS",R.drawable.bicepsdesc1,R.drawable.bicepsdesc2,"Étape 1: Tenez-vous debout avec les pieds dans l'alignement de vos hanches, travaillez avec vos abdominaux lorsque vous tenez deux haltères moyennement lourds devant vos cuisses. Fléchissez les biceps et pliez les bras pour élever les poids vers vos épaules.\n" +
                "Étape 2: Gardez les coudes en place, soulevez les poids aussi haut que vous le pouvez sans bouger les coudes. Abaissez doucement les poids en gardant les coudes légèrement fléchis lorsqu'ils sont au niveau des cuisses (ne bloquez pas l'articulation et essayez de ne pas relâcher l'effort)."));
        exerciceList.add(new ExerciseObject(R.drawable.mollet,"MOLLET",R.drawable.molletdesc1,R.drawable.molletdesc2,"Étape 1 : Tenez-vous debout et droit avec les pieds dans l'alignement de vos hanches et en tenant un haltère lourd dans chaque main. Gardez les bras le long du corps.\n" +
                "Étape 2 : Tout en gardant le dos droit, mettez-vous doucement sur la pointe des pieds en élevant vos talons aussi haut que possible.\n" +
                "Étape 3 : Marquez une pause lorsque vous êtes au point culminant, puis reposez doucement les talons au sol."));
        exerciceList.add(new ExerciseObject(R.drawable.pecroraux,"PECTORAUX",R.drawable.pectorauxdesc1,R.drawable.pectorauxdesc2,"Muscle: Pectoraux\n" +
                "Étape 1: Allongez-vous sur un banc avec les pieds posés au sol. La barre placée sur son support doit se trouver légèrement derrière votre tête. Il est recommandé d'effectuer cet exercice accompagné d'une autre personne afin d'éviter que le poids ne tombe sur vous, en particulier si vous utilisez une barre ou des haltères libres.\n"+
                "Étape 2: Une fois que vous avez soulevé la barre hors de son support, elle doit se trouver directement dans l'alignement de votre buste. Gardez la tête contre le banc tout au long de l'exercice. Lorsque la barre est stable, abaissez-la au niveau du buste et, si vous en êtes capable, avec les bras dirigés vers l'extérieur pendant la descente. Lorsque vous avez descendu la barre au maximum, repoussez la barre vers le haut jusqu'à ce que vos bras soient tendus. Concentrez l'effort sur les pectoraux et les bras en accompagnant la barre verticalement."));
        exerciceList.add(new ExerciseObject(R.drawable.avant_bras,"AVANT-BRAS",R.drawable.avant_brasdesc1,R.drawable.avant_brasdesc2,"Muscle: Long Radial\n" +
                "Étape 1 : Asseyez-vous avec les avant-bras posés sur les cuisses ou sur un banc. Saisissez une barre en supination et relâchez les poignets. Inspirez puis effectuez une flexion des poignets.\n" +
                "Étape 2 : Expirez lorsque vous terminez le mouvement"));
        exerciceList.add(new ExerciseObject(R.drawable.jambes,"JAMBES",R.drawable.jambesdesc1,R.drawable.jambesdesc2,"Muscle: Fessiers\n" +
                "Etape 1 : Placez la barre sur vos épaules et tenez-vous debout avec les pieds dans l'alignement de vos hanches.\n" +
                "Étape 2: Baissez-vous jusqu'à ce que vos cuisses soient parallèles au sol. Redressez-vous, marquez une pause, puis baissez-vous à nouveau.\n" +
                "Étape 3 : Marquez une pause à nouveau, puis revenez à la position initiale."));
        exerciceList.add(new ExerciseObject(R.drawable.epaules,"EPAULES",R.drawable.epaulesdesc1,R.drawable.epaulesdesc2,"Muscle: Deltoïdes\n" +
                "Étape 1: Commencez par vous assoir sur le banc (avec dossier). Saisissez la barre en pronation. Placez la barre derrière vous et légèrement au-dessus de vos épaules, vos coudes sont pointés vers le sol.\n" +
                "Étape 2: Poussez sur les bras jusqu'à ce qu'ils soient tendus afin de soulever la barre au-dessus de votre tête. Après avoir marqué une pause, abaissez la barre pour revenir à la position initiale."));
        exerciceList.add(new ExerciseObject(R.drawable.tricipes,"TRICIPES",R.drawable.tricipesdesc1,R.drawable.tricipesdesc2,"Étape 1: Allongez-vou sur un banc de musculation avec barre libre. Saisissez la barre au-dessus de vous en prise étroite.\n" +
                "Étape 2: La distance entre vos mains doit être d'environ 15-20cm. Soulevez la barre hors de son support et abaissez-la à environ 10cm au-dessus de votre buste, puis revenez à la position initiale.\n" +
                "Étape 3: Assurez-vous de garder les coudes en position le long du corps pendant toute l'exécution de l'exercice."));
    }
}