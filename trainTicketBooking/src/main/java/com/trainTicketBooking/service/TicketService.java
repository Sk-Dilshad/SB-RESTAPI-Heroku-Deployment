package com.trainTicketBooking.service;

import com.trainTicketBooking.entity.PassangerRequest;
import com.trainTicketBooking.entity.TicketResponse;
import com.trainTicketBooking.repository.ticketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {


    @Autowired
    ticketRepo ticketRepo;

    public String bookTicket(PassangerRequest request){

        TicketResponse response=new TicketResponse();
        response.setName(request.getName());
        response.setFrom(request.getFrom());
        response.setTo(request.getTo());
        response.setjDate(request.getjDate());
        response.setStatus("confirmed");
        response.setCost(400.00);
        response.setTicketId(123);
        response.setPnr("PNR100");
       ticketRepo.saveTicket(response);
        return response.getPnr();

    }
    public TicketResponse getTicketByPnr(String pnr){
        return ticketRepo.getTicketByPnr(pnr);
    }

}
