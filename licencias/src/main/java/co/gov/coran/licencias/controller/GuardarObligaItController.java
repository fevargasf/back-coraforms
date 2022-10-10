package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.GuardarObligacionItDTO;
import co.gov.coran.licencias.service.GuardarObligacionItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class GuardarObligaItController {

    @Autowired
    private GuardarObligacionItService guardarObligacionItService;

    @PostMapping(value ="/guardar_ObligacionIt")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    String guardarObigaIt(@RequestParam(name = "niSecEEta") String niSecEEta,
                          @RequestParam(name = "nioLinea") String nioLinea,
                          @RequestParam(name = "niSecDoc") String niSecDoc,
                          @RequestParam(value="niSecTer") String niSecTer,
                          @RequestParam(value = "viObligacion") String viObligacion,
                          @RequestParam(value = "viPeriodica") String viPeriodica,
                          @RequestParam(value = "niPlazo") String niPlazo,
                          @RequestParam(value = "viCumple") String viCumple,
                          @RequestParam(value = "viObs") String viObs,
                          @RequestParam(value = "viMotivoParcial") String viMotivoParcial,
                          @RequestParam(value = "viIdUsuario") String  viIdUsuario

                          ){
                            GuardarObligacionItDTO guardarObligacionItDTO = new GuardarObligacionItDTO();
                              guardarObligacionItDTO.setNiSecEEta(niSecEEta);
                              guardarObligacionItDTO.setNioLinea(nioLinea);
                              guardarObligacionItDTO.setNiSecDoc(niSecDoc);
                              guardarObligacionItDTO.setNiSecTer(niSecTer);
                              guardarObligacionItDTO.setViObligacion(viObligacion);
                              guardarObligacionItDTO.setViPeriodica(viPeriodica);
                              guardarObligacionItDTO.setNiPlazo(niPlazo);
                              guardarObligacionItDTO.setViCumple(viCumple);
                              guardarObligacionItDTO.setViObs(viObs);
                              guardarObligacionItDTO.setViMotivoParcial(viMotivoParcial);
                              guardarObligacionItDTO.setViIdUsuario(viIdUsuario);
                               return  this.guardarObligacionItService.guardarObigaIt(guardarObligacionItDTO);
                        }

                    }
