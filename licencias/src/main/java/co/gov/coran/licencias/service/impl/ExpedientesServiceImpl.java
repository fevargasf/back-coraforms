package co.gov.coran.licencias.service.impl;


import co.gov.coran.licencias.models.dto.ExpedientDTO;
import co.gov.coran.licencias.models.dto.ListaExpedientes;
import co.gov.coran.licencias.repository.ExpedientesRepository;
import co.gov.coran.licencias.service.ExpedienteService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExpedientesServiceImpl implements ExpedienteService {
    private ExpedientesRepository expedientesRepository;

    public ExpedientesServiceImpl(ExpedientesRepository expedientesRepository ) {
        this.expedientesRepository = expedientesRepository ;
    }

    public ListaExpedientes listarExpedientes(Integer sequenceThirdParty) {
        ListaExpedientes listaExpedientes = new ListaExpedientes();

        List<Object> objects = expedientesRepository .listarExpedientes(sequenceThirdParty);

        List<ExpedientDTO> expedients = new ArrayList<>();


        for (Object expedient : objects) {
            listaExpedientes.setResult(Boolean.TRUE);
            Object[] expedientAux = (Object[]) expedient;
            ExpedientDTO expedientDTO = new ExpedientDTO();

            expedientDTO.setExp_sec((BigDecimal)expedientAux[0]);
            expedientDTO.setExpediente(((String) expedientAux[1]));
            expedientDTO.setAsu_codigo((String) expedientAux[2]);
            expedientDTO.setNombre_asunto((String) expedientAux[3]);
            expedientDTO.setExp_estado((String) expedientAux[4]);
            expedientDTO.setTerritorial((String) expedientAux[5]);
            expedientDTO.setTer_sec((BigDecimal) expedientAux[6]);
            expedientDTO.setTer_tipo_documento((String) expedientAux[7]);
            expedientDTO.setTer_documento((String) expedientAux[8]);
            expedientDTO.setTer_nombres((String) expedientAux[9]);
            expedientDTO.setTer_direccion((String) expedientAux[10]);
            expedientDTO.setTer_dir_municipio((String) expedientAux[11]);
            expedientDTO.setTer_dir_depto((String) expedientAux[12]);
            expedientDTO.setTer_email((String) expedientAux[13]);
            expedientDTO.setTer_telefono((String) expedientAux[14]);
            expedientDTO.setTer_celular((String) expedientAux[15]);
            expedientDTO.setTer_naturaleza((String) expedientAux[16]);
            expedientDTO.setUltima_autogestion((String) expedientAux[17]);
            expedientDTO.setAdmite_autogestion(String.valueOf(expedientAux[18]));
            expedientDTO.setMotivo_no_admite((String) expedientAux[19]);

            expedients.add(expedientDTO);
        }
        listaExpedientes.setLista_expedientes(expedients);

        return listaExpedientes;
    }
}
