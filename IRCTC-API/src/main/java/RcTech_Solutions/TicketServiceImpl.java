package RcTech_Solutions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
	
	Map<Integer, Ticket> dp = new HashMap<Integer, Ticket>();

	@Override
	public Ticket bookTicket(Passenger p) {
		Ticket t = new Ticket();
		Random r = new Random();
		int id = r.nextInt(100);
		t.setTicketNum(id);
		BeanUtils.copyProperties(p, t);
		t.setStatus("Ticket is Booked");
		dp.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		return dp.values();
	}

}
