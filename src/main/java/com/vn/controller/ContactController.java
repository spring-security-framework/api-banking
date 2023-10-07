package com.vn.controller;

import com.vn.model.Contact;
import com.vn.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

@RestController
@RequestMapping
public class ContactController {
    @Autowired
    private ContactRepo contactRepo;

    @PostMapping("/contact")
    public Contact saveContactInquiryDetails(
            @RequestBody Contact contact
    ) {
        contact.setContactId(getServiceReqNumber());
        contact.setCreateDt(new Date(System.currentTimeMillis()));
        return contactRepo.save(contact);
    }

    public String getServiceReqNumber() {
        Random random = new Random();
        int ranNum = random.nextInt(999999999 - 9999) + 9999;
        return "SR"+ranNum;
    }
}
