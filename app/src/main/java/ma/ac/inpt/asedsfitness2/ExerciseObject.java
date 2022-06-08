package ma.ac.inpt.asedsfitness2;

import java.io.Serializable;

public class ExerciseObject implements Serializable {
    Integer image;
    String title;
    Integer descImage1;
    Integer descImage2;
    String description;


    public ExerciseObject(Integer image, String title, Integer descImage1, Integer descImage2, String description) {
        this.image = image;
        this.title = title;
        this.descImage1 = descImage1;
        this.descImage2 = descImage2;
        this.description = description;
    }
}
