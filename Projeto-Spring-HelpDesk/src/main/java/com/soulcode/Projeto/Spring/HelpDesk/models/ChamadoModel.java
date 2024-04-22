package com.soulcode.Projeto.Spring.HelpDesk.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChamadoModel {
    private Long id;
    private String descricao;
    private String prioridade;
    private String status;
}