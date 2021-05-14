package co.simplon.springticketapi.model;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private LocalDateTime date;
    private String description;
    private boolean resolved;
    private int idLearner;


    public Ticket(LocalDateTime localDateTime) {
        this.date = localDateTime;
    }

    public Ticket(int id, LocalDateTime date, String description, boolean resolved, int idLearner) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.resolved = resolved;
        this.idLearner = idLearner;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public boolean isResolved() {
        return resolved;
    }

    public int getIdLearner() {
        return idLearner;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", resolved=" + resolved +
                ", idLearner=" + idLearner +
                '}';
    }
}
