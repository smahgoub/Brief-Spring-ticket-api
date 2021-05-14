package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

@Component
public class TicketDao implements Dao<Ticket> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Ticket> ticketRowMapper;

    public TicketDao(JdbcTemplate jdbcTemplate, RowMapper<Ticket> ticketRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.ticketRowMapper = ticketRowMapper;
    }

    // Sélection des ticket par leur ID
    @Override
    public Ticket get(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM ticket WHERE id = ?", ticketRowMapper, id);
    }

    // Création des tickets en base de données
    @Override
    public void save(Ticket ticket) {
        jdbcTemplate.execute("INSERT INTO ticket (date, description) VALUES ('" + ticket.getDate() + "','" + ticket.getDescription() + "')");
            }

    // Sélection de tous les tickets en cours non résolu
    @Override
    public List<Ticket> getAll() {
        return jdbcTemplate.query("SELECT * FROM ticket WHERE resolved=false ", ticketRowMapper);
    }

    // Suppression des tickets résolus
    @Override
    public void delete(int id) {
       jdbcTemplate.execute("DELETE FROM ticket WHERE resolved = true");
          }
}
