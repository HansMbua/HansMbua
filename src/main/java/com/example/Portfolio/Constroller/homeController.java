package com.example.Portfolio.Constroller;

import com.example.Portfolio.Service.hansServiceInter;
import com.example.Portfolio.entity.Contact;
import com.example.Portfolio.entity.Quote;
import com.example.Portfolio.entity.value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("home")
public class homeController {

    @Autowired
    private hansServiceInter  hansServiceInter;

     @GetMapping("/homePage")
    public String homePage(Model theModel){
         Quote theQuote = hansServiceInter.getTheQuote();

         theModel.addAttribute("QuoteOfTheDay",theQuote.getQ());
         return "homePage";
     }

     @GetMapping("/contactMe")
    public String ContactMe(Model theModel){

         // create send data to contact
         Contact contact = new Contact();
         theModel.addAttribute("contact",contact);

         return "contact/contactMe";
     }


     @PostMapping("/send")
    public String send(@ModelAttribute("contact") Contact contact){
         Logger theLogger = Logger.getLogger(this.getClass().getName());

         theLogger.info("the email is: "+contact.getEmail());
         theLogger.info("the employer name is: "+contact.getName());
         theLogger.info("the message is: "+contact.getMessages());
         // call a message service and pass the message and the user from the object

         return "redirect:/home/homePage";
     }




}
