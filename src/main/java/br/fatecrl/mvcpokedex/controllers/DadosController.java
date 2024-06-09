package br.fatecrl.mvcpokedex.controllers;

import br.fatecrl.mvcpokedex.models.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/pokedex")
public class DadosController {
    private static final List<Pokemon> pokedex = new ArrayList<Pokemon>();

    public DadosController() {
        pokedex.add(new Pokemon("113","Chansey","Normal","",1.1,34.6));
        pokedex.add(new Pokemon("242","Blissey","Normal","",1.5,46.8));
        pokedex.add(new Pokemon("114","Tangela","Planta","",1,35));
        pokedex.add(new Pokemon("465","Tangrowth","Planta","",2,128.6));
    }

    @GetMapping
    public List<Pokemon> getPokedex(){
        return pokedex;
    }
}
