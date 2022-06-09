package ma.ac.inpt.asedsfitness2;

import java.util.Date;

public class NewExercise {
    private String title;
    private String category;
    private double weight;
    private int repetitions;
    private int sets;
    private Date exerciseDate;

    public NewExercise(String title, String category, double weight, int repetitions, int sets, Date exerciseDate) {
        this.title = title;
        this.category = category;
        this.weight = weight;
        this.repetitions = repetitions;
        this.sets = sets;
        this.exerciseDate = exerciseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public Date getExerciseDate() {
        return exerciseDate;
    }

    public void setExerciseDate(Date exerciseDate) {
        this.exerciseDate = exerciseDate;
    }
}
