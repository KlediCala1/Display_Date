package com.dojo.display_date.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DisplayDateController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model) {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("EEEE, MMM d, yyyy");
        String stringDate = DateFor.format(date);
        model.addAttribute("date", stringDate);
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model) {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("h:mm a");
        String stringDate = DateFor.format(date);
        model.addAttribute("time", stringDate);
        return "time.jsp";
    }


}
