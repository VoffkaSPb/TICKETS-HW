package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.RepositoryOfTickets;

import java.util.Arrays;

public class TicketManager {
    private RepositoryOfTickets repository;

    public TicketManager(RepositoryOfTickets repository) {
        this.repository = repository;
    }

    public void add(Ticket ticket) {
        repository.save(ticket);
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] ans = new Ticket[0];
        for (Ticket ticket : repository.getAll()) {
            if (ticket.getFromAP() == from && ticket.getToAP() == to) {
                Ticket[] tmp = new Ticket[ans.length + 1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans[i];
                }
                tmp[tmp.length - 1] = ticket;
                ans = tmp;
            }
        }
        Arrays.sort(ans);
        return ans;
    }

}
