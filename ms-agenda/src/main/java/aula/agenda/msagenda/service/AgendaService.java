package aula.agenda.msagenda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import aula.agenda.msagenda.dto.AgendaDTO;
import aula.agenda.msagenda.model.Agenda;
import aula.agenda.msagenda.repository.AgendaRepository;

@Service
public class AgendaService {

    @Autowired
    private static AgendaRepository agendaRepository;

    @Autowired
    // private RestTemplate restTemplate;

    public static List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    public static Agenda findById(long id) {
        Optional<Agenda> dtos = agendaRepository.findById(id);
        if (dtos.isPresent()) {
            return dtos.get();
        }
        throw new RuntimeException();

    }

    public Agenda save(AgendaDTO dtos) {
        return null;
    }

}
