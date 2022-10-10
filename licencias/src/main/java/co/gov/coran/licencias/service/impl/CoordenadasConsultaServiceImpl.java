package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.CoordenadasConsultaDTO;
import co.gov.coran.licencias.models.dto.ListaCoordenadas;
import co.gov.coran.licencias.repository.ConsultarCoordenadasRepository;
import co.gov.coran.licencias.service.CoordenadasConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CoordenadasConsultaServiceImpl implements CoordenadasConsultaService {
   @Autowired
   private ConsultarCoordenadasRepository consultarCoordenadasRepository;

   public CoordenadasConsultaServiceImpl(ConsultarCoordenadasRepository consultarCoordenadasRepository){
       this.consultarCoordenadasRepository = consultarCoordenadasRepository;
   }

    @Override
    public ListaCoordenadas listaCoordenadas(BigDecimal niSecEETA, String viUsuario) {

       ListaCoordenadas listaCoordenadas = new ListaCoordenadas();
        List<Object> objects = ConsultarCoordenadasRepository.listaCoordenadas( niSecEETA,viUsuario);
        List<CoordenadasConsultaDTO> coordenadas = new ArrayList<>();

        for(Object coordenada:objects){

            listaCoordenadas.setResult(Boolean.TRUE);
            Object[] coordenadaAux= (Object[]) coordenada;

            CoordenadasConsultaDTO coordenadasConsultaDTO = new CoordenadasConsultaDTO();

            coordenadasConsultaDTO.setLinea((Integer) coordenadaAux[0]);
            coordenadasConsultaDTO.setCapta_sec((BigDecimal)coordenadaAux[1]);
            coordenadasConsultaDTO.setVert_sec((BigDecimal)coordenadaAux[2]);
            coordenadasConsultaDTO.setSistema_coordenadas((BigDecimal) coordenadaAux[3]);
            coordenadasConsultaDTO.setNombre_sistema_coordenadas((String) coordenadaAux[4]);
            coordenadasConsultaDTO.setX((BigDecimal) coordenadaAux[5]);
            coordenadasConsultaDTO.setY((BigDecimal) coordenadaAux[6]);
            coordenadasConsultaDTO.setMunicipio((String) coordenadaAux[7]);
            coordenadasConsultaDTO.setNivel_subsiguiente((String) coordenadaAux[8]);
            coordenadasConsultaDTO.setCota((BigDecimal) coordenadaAux[9]);
            coordenadasConsultaDTO.setDescripcion((String) coordenadaAux[10]);
            coordenadasConsultaDTO.setObservaciones((String) coordenadaAux[11]);
            coordenadasConsultaDTO.setFecha_creacion((Date) coordenadaAux[12]);
            coordenadasConsultaDTO.setCreado_por((String) coordenadaAux[13]);

            coordenadas.add(coordenadasConsultaDTO);
        }

        listaCoordenadas.setLista_coordenadas(coordenadas);
        return listaCoordenadas;
    }
}
