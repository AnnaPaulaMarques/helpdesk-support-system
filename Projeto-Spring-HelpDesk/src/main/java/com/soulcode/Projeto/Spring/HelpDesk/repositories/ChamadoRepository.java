package com.soulcode.Projeto.Spring.HelpDesk.repositories;


import com.soulcode.Projeto.Spring.HelpDesk.models.ChamadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<ChamadoModel , Long> {
}
