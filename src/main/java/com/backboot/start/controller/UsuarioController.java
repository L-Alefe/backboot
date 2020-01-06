package com.backboot.start.controller;
import com.backboot.start.models.UsuarioModel;
import com.backboot.start.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("usuarios/nome/{nome}")
    public UsuarioModel getUsuarioPorNome (@PathVariable(value="nome") String nome) {
        return usuarioRepository.findByNome(nome);
    }
}
