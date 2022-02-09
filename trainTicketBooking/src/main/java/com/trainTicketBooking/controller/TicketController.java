package com.trainTicketBooking.controller;

import com.trainTicketBooking.entity.PassangerRequest;
import com.trainTicketBooking.entity.TicketResponse;
import com.trainTicketBooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @PostMapping(value = "/post",consumes = {"application/json","application/xml"})
    public ResponseEntity<String> PostPassangerDate(@RequestBody PassangerRequest passangerRequest){
       String pnr =ticketService.bookTicket(passangerRequest);
       String msg="Ticket created "+pnr;
        return new ResponseEntity<>(msg,HttpStatus.CREATED);
    }

    @GetMapping(value = "/Get/{pnr}",produces = {"application/json","application/xml"})
    public ResponseEntity<TicketResponse> getTicket(@PathVariable String pnr){
       TicketResponse ticket =ticketService.getTicketByPnr(pnr);
        System.out.println(ticket);
        return new ResponseEntity<>(ticket,HttpStatus.OK);
    }
}
