package nikiforov.app.controller;

import nikiforov.app.entity.Group;
import nikiforov.app.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String saveGroup(@ModelAttribute("group") @Valid Group group, BindingResult result) {
        if (!result.hasErrors()) {
            if (groupService.getGroupByName(group.getGroupName()) == null) {
                groupService.saveGroup(group);
                return "redirect:/groups";
            }
            result.rejectValue("groupName", "error.groupName", "Введённая группа уже существует");
        }
        return "new-group";
    }

    @RequestMapping("/edit")
    public String showEditStudent(@RequestParam("groupID") int id, Model model) {

        model.addAttribute("group", groupService.getGroupById(id));

        return "new-group";
    }
}