package RcTech_Solutions;

import java.util.Collection;

public interface TicketService {
	
	public Ticket bookTicket(Passenger p);
	
	public Collection<Ticket> getAllTickets();
	

}
