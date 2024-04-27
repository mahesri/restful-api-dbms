package DBMS.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {


@Autowired private UserService service;

<<<<<<< HEAD
    @GetMapping("/users")
    public String showUserList(Model model){
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

    @GetMapping("/users/new")
    public String showNewForm(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("pageTitle", "Add New User");
        return "userForm";
=======
@GetMapping("/users")
public String showUserList(Model model){
    List<User> listUsers = service.listAll();
    model.addAttribute("listUsers", listUsers);
    return "users";
    }

    @GetMapping("/user/new")
    public String showNewForm(Model model){
    model.addAttribute("user", new User());
    model.addAttribute("pageTitle", "Add New User");
    return "user_form";
    }
    @PostMapping("/user/save")
    public String saveUser(User user, RedirectAttributes ra) {
    service.save(user);
    ra.addFlashAttribute("message", "Pengguna berhasil ditambahkan!");
        return "redirect:/users";
    }
    @GetMapping("/users/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {
        User user = service.get(id);

        model.addAttribute("user", user);
            model.addAttribute("pageTitle", "Edit User (ID: "+ id +")");
            return "user_from";
        } catch (UserNotFondException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/users";
        }
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id, RedirectAttributes ra) {
        try {
            service.delete(id);
            ra.addFlashAttribute("message", "Penghapusan ID" + id + "berhasil!");
        } catch (UserNotFondException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/users";
>>>>>>> ab61f13cc677e45329765d506c89ba38d34e1239
    }


}
