package com.app.service;

import com.app.model.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTicket();

    Ticket getTicketById(int id);

    void saveOrUpdate(Ticket ticket);
    void saveCustomer(Ticket ticket);

    void deleteTicket(int id);
}
