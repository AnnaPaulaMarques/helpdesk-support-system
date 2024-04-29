package com.soulcode.Projeto.Spring.HelpDesk.repositories;

import com.soulcode.Projeto.Spring.HelpDesk.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {

}
