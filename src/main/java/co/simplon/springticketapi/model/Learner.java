package co.simplon.springticketapi.model;

import java.time.LocalDateTime;

public class Learner {
    private int idLearner;
    private String fisrtName;
    private String lastName;

    public Learner(int idLearner, String fisrtName, String lastName) {
        this.idLearner = idLearner;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
    }

    public int getIdLearner() {
        return idLearner;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "idLearner=" + idLearner +
                ", fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
