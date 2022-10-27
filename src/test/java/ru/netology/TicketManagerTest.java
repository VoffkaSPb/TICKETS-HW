package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.manager.TicketManager;
import ru.netology.repository.RepositoryOfTickets;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketManagerTest {
    private Ticket ticket1 = new Ticket(1, 350, "SPB", "MSC", 75);
    private Ticket ticket2 = new Ticket(2, 700, "SPB", "SCH", 220);
    private Ticket ticket3 = new Ticket(3, 550, "MSC", "SCH", 160);
    private Ticket ticket4 = new Ticket(4, 200, "SPB", "MSC", 90);
    private Ticket ticket5 = new Ticket(5, 450, "SPB", "MSC", 60);
    private Ticket ticket6 = new Ticket(6, 700, "SPB", "SCH", 200);

    @Test
    void ShouldFindTickets() {
        TicketManager manager = new TicketManager(new RepositoryOfTickets());
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Ticket[] actual = manager.findAll("SPB", "MSC");
        Ticket[] expected = {ticket4, ticket1, ticket5};

        assertArrayEquals(actual, expected);
    }

    @Test
    void ShouldFindTicketsEqualPrice() {
        TicketManager manager = new TicketManager(new RepositoryOfTickets());
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Ticket[] actual = manager.findAll("SPB", "SCH");
        Ticket[] expected = {ticket2, ticket6};

        assertArrayEquals(actual, expected);
    }

}
