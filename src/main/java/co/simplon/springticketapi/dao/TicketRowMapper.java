package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TicketRowMapper implements RowMapper<Ticket> {

    // Transformation de la ligne SQL en objet Java
    @Override
    public Ticket mapRow(ResultSet resultSet, int id) throws SQLException {
        return new Ticket(resultSet.getInt("id"), resultSet.getTimestamp("date").toLocalDateTime(),
                resultSet.getString("description"),resultSet.getBoolean("resolved"),
                resultSet.getInt("idLearner"));
        }
}
