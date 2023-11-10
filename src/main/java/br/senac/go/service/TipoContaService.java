package br.senac.go.service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.TipoConta;
import br.senac.go.model.TipoConta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TipoContaService implements IService<TipoConta,Integer> {
    @Override
    public TipoConta create(TipoConta entity) {
        log.info("Método tipoContaService.create executado");
        log.debug(String.format("Método tipoContaService.create executado com o objeto: %d ", entity.toString()));

        return null;
    }

    @Override
    public TipoConta readById(Integer id) throws Exception {
        log.info("Método TipotipoContaService.readById executado");
        log.debug(String.format("Método TipoContaService.readById executado com o objeto: %s ", id));

        return null;
    }

    @Override
    public TipoConta read(TipoConta entity) throws Exception {
        log.info("Método TipoContaService.read executado");
        log.debug(String.format("Método TipoContaService.raed executado com o objeto: %d ", entity.toString()));

        return null;
    }

    @Override
    public TipoConta update(TipoConta entity) {
        log.info("Método TipoContaService.update executado");
        log.debug(String.format("Método TipoContaService.update executado com o objeto: %d ", entity.toString()));

        return null;
    }

    @Override
    public TipoConta updatepart(Integer id, TipoConta entity) throws Exception {
        log.info("Método TipoContaService.updatePart executado");
        log.debug(String.format("Método TipoContaService.updatePart executado com o objeto: %d | %s", id, entity.toString()));

        return null;
    }

    @Override
    public TipoConta updatefull(Integer id, TipoConta entity) {
        log.info("Método TipoContaService.updatefull executado");
        log.debug(String.format("Método TipoContaService.updatefull executado com o objeto: %d | %s", id, entity.toString()));

        return null;
    }

    @Override
    public TipoConta deleteById(Integer id) {
        log.info("Método TipoContaService.deleteById executado");
        log.debug(String.format("Método TipoContaService.deleteByd executado com o objeto:  %s", id ));

        return null;
    }

    @Override
    public TipoConta delete(TipoConta entity) {
        log.info("Método TipoContaService.delete executado");
        log.debug(String.format("Método TipoContaService.delete executado com o objeto: %d " , entity.toString()));

        return null;
    }
}
