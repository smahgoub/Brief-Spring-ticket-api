package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.LearnerDao;
import co.simplon.springticketapi.dao.TicketDao;
import co.simplon.springticketapi.model.Learner;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/tickets")
@RestController
public class TicketController {

    private final TicketDao ticketDao;

    public TicketController(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketDao.getAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable int id) {
        return ticketDao.get(id);
    }

    @PostMapping
    public void postTicket(@RequestBody Ticket ticket) {
        ticketDao.save(ticket);
    }

    @DeleteMapping
    public void deleteTicket(@RequestBody Ticket ticket) {
        ticketDao.delete(ticket.getId());
    }
}
