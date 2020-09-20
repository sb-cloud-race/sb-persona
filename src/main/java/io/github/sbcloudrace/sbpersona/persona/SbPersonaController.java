package io.github.sbcloudrace.sbpersona.persona;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
@AllArgsConstructor
public class SbPersonaController {

    private final SbPersonaRepository sbPersonaRepository;

    @RequestMapping("/personasByUser/{userId}")
    @ResponseBody
    public List<SbPersona> findByUserId(@PathVariable Long userId) {
        return sbPersonaRepository.findByUserId(userId);
    }

}
