package com.app.controller;
import com.app.model.Ticket;
import com.app.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//This is to allow calls from React... NOT IMPORTANT RIGHT NOW
@CrossOrigin(origins = { "http://localhost:3000"})

@RestController

public class TicketController {

    private final TicketService service;

    //Constructor Injection: this is telling the spring framework to wire up your
    //dependencies for the employeeService.
    @Autowired
    public TicketController(@Qualifier("TServiceImpl")TicketService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView welcomePage(){

        return new ModelAndView("wc");
    }

    // Course List

    @GetMapping("/list")
    public ModelAndView ticketList(){

        ModelAndView model =new ModelAndView();
        List<Ticket> ticketList = service.getAllTicket();
        model.addObject("ticketLists",ticketList);
        model.setViewName("customer_list");
        return model;
    }

    @GetMapping("/addDestinationPage")
    public ModelAndView addDestinationPage(){
        Ticket ticket = new Ticket();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("destinationForm",ticket);
        modelAndView.setViewName("create-project");
        return modelAndView;
    }

    @PostMapping("/addDestination")
    public ModelAndView addCustomer(@ModelAttribute Ticket ticket) {

        service.saveTicket(ticket);
        return new ModelAndView("result");
    }

    // Login form
    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }




    /*@GetMapping("/addCustomerPage")
    public ModelAndView addCustomerPage(){
        Customer customer = new Customer();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customerForm",customer);
        modelAndView.setViewName("eform");
        return modelAndView;
    }*/


    // add Course

    /*@PostMapping("/addCustomer")
    public ModelAndView addCustomer(@ModelAttribute("destinationForm") Ticket ticket){

        service.saveCustomer(ticket);
        return new ModelAndView("redirect:/addDestinationPage");
    }*/
}