package nikiforov.app.controller;

import nikiforov.app.entity.Group;
import nikiforov.app.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping
    public String showAllGroups(Model model) {
        List<Group> allGroups = groupService.getAllGroups();

        model.addAttribute("allGroups", allGroups);

        return "all-groups";
    }

    @RequestMapping("/new")
    public String showNewGroup(Model model) {

        model.addAttribute("group", new Group());

        return "new-group";
    }

    @RequestMapping("/save")
    public String saveGroup(@Valid @ModelAttribute("group") Group group, BindingResult bindingResult) {

        if (!bindingResult.hasErrors()) {
            groupService.saveGroup(group);

            return "redirect:/groups";
        } else {
            return "new-group";
        }
    }
}