package co.simplon.springticketapi.model;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private LocalDateTime date;
    private String description;


    public Ticket(LocalDateTime localDateTime) {
        this.date = localDateTime;
    }

    public Ticket(int id, LocalDateTime date,String description) {
        this.id = id;
        this.date = date;
        this.description = description ;
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

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
