package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Learner;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class LearnerRowMapper implements RowMapper<Learner> {

    // Création d'une nouvelle ligne apprenant
    @Override
    public Learner mapRow(ResultSet resultSet, int id) throws SQLException {
        return new Learner(resultSet.getInt("id"), resultSet.getString("firstname"),
                resultSet.getString("lastName"),resultSet.getString("promotion"));
         }
}
