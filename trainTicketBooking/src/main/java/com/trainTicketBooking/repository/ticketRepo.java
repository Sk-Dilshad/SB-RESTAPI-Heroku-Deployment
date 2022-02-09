package com.trainTicketBooking.repository;

import com.trainTicketBooking.entity.TicketResponse;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ticketRepo {

    Map<String,TicketResponse> ticketMap=new HashMap<>();

    public String saveTicket(TicketResponse response){
        ticketMap.put(response.getPnr(),response);
        return response.getPnr();
    }
    public  TicketResponse getTicketByPnr(String pnr){
        if(ticketMap.containsKey(pnr)){
            return ticketMap.get(pnr);
        }
        return null;
    }
}
