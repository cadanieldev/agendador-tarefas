package com.javanauta.agendadortarefas.infrastructure.client;


import com.javanauta.agendadortarefas.business.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

// cliente padrao para comunicaçao sincronas com openfeign e craiar uma interface
@FeignClient(name = "usuario", url = "${usuario.url}")// chamar o feignclient, com o nome e a url, apontar a url com uma variavel
public interface UsuarioClient {

    @GetMapping("/usuario")
    UsuarioDTO buscaUsuarioPorEmail(@RequestParam("email") String email,
                                    @RequestHeader("Authorization") String token);


}
