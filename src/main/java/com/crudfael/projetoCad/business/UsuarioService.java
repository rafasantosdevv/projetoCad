package com.crudfael.projetoCad.business;

import com.crudfael.projetoCad.infrastructure.entitys.Usuario;
import com.crudfael.projetoCad.infrastructure.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;


    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUser(Usuario usuario){
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUserPorEmail(String email){

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUserPorEmail(String email){
        repository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Não foi possível localizar seu ID")
        );
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ?
                        usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ?
                        usuario.getNome() : usuarioEntity.getNome())
                .cpf(usuario.getCpf() != null ?
                        usuario.getCpf() : usuarioEntity.getCpf())
                .id(usuarioEntity.getId())
                .build();

        repository.saveAndFlush(usuarioAtualizado);
    }

}