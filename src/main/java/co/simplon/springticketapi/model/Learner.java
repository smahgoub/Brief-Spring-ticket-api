package co.simplon.springticketapi.model;

public class Learner {
    private int idLearner;
    private String firstName;
    private String lastName;
    private String promotion;

    public Learner(int idLearner, String firstName, String lastName, String promotion) {
        this.idLearner = idLearner;
        this.firstName = firstName;
        this.lastName = lastName;
        this.promotion = promotion;
    }

    public int getIdLearner() {
        return idLearner;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPromotion() {
        return promotion;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "idLearner=" + idLearner +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", promotion='" + promotion + '\'' +
                '}';
    }
}
