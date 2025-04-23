package com.ccstudent.gcccprestamoservice.Feign;

import com.ccstudent.gcccprestamoservice.Dto.UsuarioDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gccc-usuario-service", path = "/usuario")
public interface UsuarioFeign {
    @GetMapping("{id}")
    public ResponseEntity<UsuarioDto> buscarUsuario(@PathVariable Long id);

}
