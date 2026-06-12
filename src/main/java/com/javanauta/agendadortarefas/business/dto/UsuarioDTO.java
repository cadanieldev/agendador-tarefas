package com.javanauta.agendadortarefas.business.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    //Coisas que nao queremos que sejam expostas
    private String email;
    private String senha;

}
