package br.edu.ifpb.pweb2.bizurada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifpb.pweb2.bizurada.model.Usuario;
import br.edu.ifpb.pweb2.bizurada.repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @GetMapping
    public ModelAndView getForm(ModelAndView model) {
        model.setViewName("auth/login");
        model.addObject("usuario", new Usuario());
        return model;
    }

    @PostMapping
    public ModelAndView valide(Usuario usuario, HttpSession session, ModelAndView model,
            RedirectAttributes redirectAttts) {
        if ((usuario = this.isValido(usuario)) != null) {
            session.setAttribute("usuario", usuario);
            model.setViewName("redirect:/sala-de-perguntas");
        } else {
            redirectAttts.addFlashAttribute("mensagem", "Login inválidos!");
            model.setViewName("redirect:/auth");
        }
        return model;
    }

    @GetMapping("/logout")
    public ModelAndView logout(ModelAndView mav, HttpSession session) {
        session.invalidate();
        mav.setViewName("redirect:/auth");
        return mav;
    }

    private Usuario isValido(Usuario usuario) {
        Usuario usuarioEncontrado = usuarioRepo.findByName(usuario.getName());
        if (usuarioEncontrado != null) {
            return usuarioEncontrado;
        }
        return null;
    }

}

