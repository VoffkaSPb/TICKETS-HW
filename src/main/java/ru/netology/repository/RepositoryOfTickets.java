package ru.netology.repository;

import ru.netology.domain.Ticket;

public class RepositoryOfTickets {
    private Ticket[] tickets = new Ticket[0];

    public void save(Ticket ticket) {
        Ticket[] ans = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            ans[i] = tickets[i];
        }
        ans[ans.length - 1] = ticket;
        tickets = ans;
    }

    public Ticket[] getAll() {
        return tickets;
    }

    public void deleteById(int id) {
        Ticket[] result = new Ticket[tickets.length - 1];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                result[index] = ticket;
                index++;
            }
        }
        tickets = result;
    }
}
