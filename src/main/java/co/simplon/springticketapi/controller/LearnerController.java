package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.LearnerDao;
import co.simplon.springticketapi.model.Learner;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/learner")
@RestController
public class LearnerController {

    private final LearnerDao learnerDao;

    public LearnerController(LearnerDao learnerDao) {
        this.learnerDao = learnerDao;
    }

    @GetMapping
    public List<Learner> getAllLearner() {
        return learnerDao.getAll();
    }

    @GetMapping("/{id}")
    public Learner getLearner(@PathVariable int id) {
        return learnerDao.get(id);
    }

    @PostMapping
    public void postLearner(@RequestBody Learner learner) {
        learnerDao.save(learner);
    }

    @DeleteMapping
    public void deleteLearner(@RequestBody Learner learner) {
        learnerDao.delete(learner.getIdLearner());
    }
}
