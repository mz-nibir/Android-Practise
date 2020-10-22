package com.example.findcalender;

import java.util.ArrayList;
import java.util.List;

public class CalenderExpert {
    List<String> getMenu(String CalCategory) {
        List<String> menu = new ArrayList<>();
        if (CalCategory.equals("Days Name")) {
           menu.add("Saturday");
            menu.add("Sunday");
            menu.add("Monday");
            menu.add("Tuesday");
            menu.add("Wednesday");
            menu.add("Thursday");
            menu.add("Friday");
        }
        else if (CalCategory.equals("Months Name")) {
            menu.add("January");
            menu.add("February");
            menu.add("March");
            menu.add("April");
            menu.add("May");
            menu.add("June");
            menu.add("July");
            menu.add("August");
            menu.add("September");
            menu.add("October");
            menu.add("November");
            menu.add("December");

        }

        else {
            menu.add("Spring");
            menu.add("Summer");
            menu.add("Autumn");
            menu.add("Late Autumn");
            menu.add("Rainy season");
            menu.add("Winter");

        }
        return menu;
    }


}

