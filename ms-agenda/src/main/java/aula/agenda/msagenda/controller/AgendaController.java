package aula.agenda.msagenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import aula.agenda.msagenda.dto.AgendaDTO;
import aula.agenda.msagenda.model.Agenda;
import aula.agenda.msagenda.service.AgendaService;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

  @Autowired
  private AgendaService agendaService;

  @GetMapping()
  public List<Agenda> findAll() {
    return AgendaService.findAll();
  }

  @GetMapping("/{id}")
  public Agenda findById(@PathVariable(name = "id") Long id) {
    return AgendaService.findById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Agenda save(@RequestBody AgendaDTO dtos) {
    return agendaService.save(dtos);
  }

}
