package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Learner;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LearnerDao {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Learner> learnerRowMapper;

    public LearnerDao(JdbcTemplate jdbcTemplate, RowMapper<Learner> learnerRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.learnerRowMapper = learnerRowMapper;
    }

    // Sélection des apprenants par leur ID
    public Learner get(int id) {
        return jdbcTemplate.queryForObject("select * from ticket where id = ?", learnerRowMapper, id);
    }

    // Sélection de tous les apprenants
    public List<Learner> getAll() {
        return jdbcTemplate.query("SELECT * FROM learner", learnerRowMapper);
    }

//    // Création des apprenants en base de données
//    @Override
//    public void save(Learner learner) {
//        jdbcTemplate.execute("INSERT INTO learner (id, firstName, lastName) VALUES ('" + learner.getIdLearner() + "','" + learner.getFisrtName() + "','" + learner.getLastName()+"')");
//    }
}
