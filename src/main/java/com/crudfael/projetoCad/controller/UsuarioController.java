package com.crudfael.projetoCad.controller;

import com.crudfael.projetoCad.business.UsuarioService;
import com.crudfael.projetoCad.infrastructure.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUser(@RequestBody Usuario usuario){
        usuarioService.salvarUser(usuario);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Usuario> buscarUserPorEmail(@RequestBody String email){
        return ResponseEntity.ok(usuarioService.buscarUserPorEmail(email));
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarUserPorEmail(@RequestBody String email){
        usuarioService.deletarUserPorEmail(email);
        return ResponseEntity.ok().build();
    }


}
