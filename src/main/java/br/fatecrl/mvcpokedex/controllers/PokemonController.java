package br.fatecrl.mvcpokedex.controllers;

import br.fatecrl.mvcpokedex.models.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pokedex")
public class PokemonController {
    private static final List<Pokemon> pokedex = new ArrayList<Pokemon>();

    public PokemonController() {
        pokedex.add(new Pokemon("1","Bulbasaur","Planta","Veneno",0.7,6.9));
        pokedex.add(new Pokemon("2","Ivysaur","Planta","Veneno",1,13));
        pokedex.add(new Pokemon("3","Venusaur","Planta","Veneno",2,100));
        pokedex.add(new Pokemon("4","Charmander","Fogo","",0.6,8.5));
        pokedex.add(new Pokemon("5","Charmeleon","Fogo","",1.1,19));
        pokedex.add(new Pokemon("6","Charizard","Fogo","Voador",1.7,90.5));
        pokedex.add(new Pokemon("7","Squirtle","Água","",0.5,9));
        pokedex.add(new Pokemon("8","Wartortle","Água","",1,22.5));
        pokedex.add(new Pokemon("9","Blastoise","Água","",1.6,85.5));
    }

    @GetMapping
    public String getPokedex(Model model)
    {
        model.addAttribute("pokedex", pokedex);
        return "pokedex";
    }
}
