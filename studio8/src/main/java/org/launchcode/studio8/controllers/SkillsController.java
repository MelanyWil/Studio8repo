package org.launchcode.studio8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "<p>Click <a href='/form'> here</a> to select to favorite." +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displayForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName' /><br/>" +
                "<label>My favorite language:</label>" +
                "<select name='fave1'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br/>" +
                "<label>My second favorite language:</label>" +
                "<select name='fave2'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br/>" +
                "<label>My third favorite language:</label>" +
                "<select name='fave3'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br/>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String processForm(@RequestParam String userName, String fave1, String fave2, String fave3) {
       return "<html>" +
               "<body>" +
               "<h1>" + userName + "</h1>" +
               "<h3>Favorite Languages</h3>" +
               "<ol>" +
               "<li>" + fave1 + "</li>" +
               "<li>" + fave2 + "</li>" +
               "<li>" + fave3 + "</li>" +
               "</ol>" +
               "</html>" +
               "</body>";
    }
}
