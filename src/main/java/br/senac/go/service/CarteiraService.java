package br.senac.go.service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.Carteira;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class CarteiraService implements IService<Carteira,Integer> {
    @Override
    public Carteira create(Carteira entity) {
        log.info("Método CarteiraService.create executado");
        log.debug(String.format("Método ContaService.create executado com o objeto: %s", entity.toString()));
        return null;
    }

    @Override
    public Carteira readById(Integer id) throws Exception {
        log.info("Método CarteiraService.readByid executado");
        log.debug(String.format("Método ContaService.readByid executado com o objeto: %d",id ));
        return null;
    }

    @Override
    public Carteira read(Carteira entity) throws Exception {
        log.info("Método ContaService.read executado");
        log.debug(String.format("Método ContaService.read executado com o objeto: %s", entity.toString()));
        return null;
    }

    @Override
    public Carteira update(Carteira entity) {
        log.info("Método ContaService.update executado");
        log.debug(String.format("Método ContaService.update executado com o objeto: %s", entity.toString()));
        return null;
    }

    @Override
    public Carteira updatepart(Integer id, Carteira entity) throws Exception {
        log.info("Método ContaService.updatePart executado");
        log.debug(String.format("Método ContaService.updatePart executado com o objeto: %d | %s", id, entity.toString()));
        return null;
    }

    @Override
    public Carteira updatefull(Integer id, Carteira entity) {
        log.info("Método ContaService.updateFull executado");
        log.debug(String.format("Método ContaService.updateFull executado com o objeto: %d | %s", id, entity.toString()));
        return null;
    }

    @Override
    public Carteira deleteById(Integer id) {
        log.info("Método ContaService.deleteById executado");
        log.debug(String.format("Método ContaService.deleteById executado com o valor: %d", id));
        return null;
    }

    @Override
    public Carteira delete(Carteira entity) {
        log.info("Método ContaService.delete executado");
        log.debug(String.format("Método ContaService.delete executado com o objeto: %s", entity.toString()));
        return null;
    }
}
