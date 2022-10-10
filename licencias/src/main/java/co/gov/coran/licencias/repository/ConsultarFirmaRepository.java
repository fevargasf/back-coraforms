package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ConsultarFirmaRepository {

    private  static   EntityManager entityManager;
    private  static   String CONSULTA_FIRMANTE="sirena.pks_it_gnral.consultar_firmantes";


    public ConsultarFirmaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static List<Object> listaFirmantes(BigDecimal niSecEETA){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_FIRMANTE);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETA",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETA",niSecEETA);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }


}
