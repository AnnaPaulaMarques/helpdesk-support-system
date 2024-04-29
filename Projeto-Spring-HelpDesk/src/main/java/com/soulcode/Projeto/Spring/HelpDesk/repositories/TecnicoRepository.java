package com.soulcode.Projeto.Spring.HelpDesk.repositories;

import com.soulcode.Projeto.Spring.HelpDesk.models.TecnicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<TecnicoModel,Long> {
}
