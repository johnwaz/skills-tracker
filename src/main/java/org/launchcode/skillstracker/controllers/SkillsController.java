package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String welcomePage() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String languageForm() {
        return "<form method = 'POST' action = '/form'>" +
                "<label>Name:</label><br>" +
                "<input type = 'text' name = 'name'><br>" +
                "<label>My Favorite Language</label><br>" +
                "<select name = 'firstLanguage'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<label>My Second Favorite Language</label><br>" +
                "<select name = 'secondLanguage'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<label>My Third Favorite Language</label><br>" +
                "<select name = 'thirdLanguage'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</form>";
    }

    @PostMapping("form")
    @ResponseBody
    public String displayForm(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>";
    }

}
