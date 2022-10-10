package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarFirmaDTO;
import co.gov.coran.licencias.repository.AntecedentesConsultaRepository;
import co.gov.coran.licencias.repository.GuardarFirmaRepository;
import co.gov.coran.licencias.service.GuardarFirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardarFirmaServiceImpl implements GuardarFirmaService {
    @Autowired
    private GuardarFirmaRepository guardarFirmaRepository;

    @Override
    public String guardarFirma(GuardarFirmaDTO guardarFirmaDTO) {
        return guardarFirmaRepository.guardarFirma(guardarFirmaDTO);
    }
}
