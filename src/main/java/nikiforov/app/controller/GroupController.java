package nikiforov.app.controller;

import nikiforov.app.entity.Group;
import nikiforov.app.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * todo Document type GroupController
 */

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
    public String saveGroup(@ModelAttribute("group") Group group) {

        groupService.saveGroup(group);

        return "redirect:/groups";
    }
}