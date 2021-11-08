package com.app.service;
import com.app.model.Ticket;
import com.app.repo.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TServiceImpl implements TicketService {
    @Autowired
    TicketRepository repository;

    @Override
    public List<Ticket> getAllTicket() {
        return (List<Ticket>) repository.findAll();
    }


    @Override
    public Ticket getTicketById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveTicket(Ticket ticket) {

        repository.save(ticket);
    }

    @Override
    public void deleteTicket(int id) {

        repository.deleteById(id);
    }

    @Override
    public void saveCustomer(Ticket ticket) {

        repository.save(ticket);
    }



}
