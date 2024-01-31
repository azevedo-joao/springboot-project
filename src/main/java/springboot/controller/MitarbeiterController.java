package springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.entity.Mitarbeiter;
import springboot.service.MitarbeiterService;

import java.util.List;

@Controller
@RequestMapping("/mitarbeiter")
public class MitarbeiterController {

    private MitarbeiterService mitarbeiterService;

    public MitarbeiterController(MitarbeiterService mitarbeiterService) {
        this.mitarbeiterService = mitarbeiterService;
    }

    @GetMapping("/liste")
    public String mitarbeiterAuflisten(Model model) {

        List<Mitarbeiter> mitarbeiterListe = mitarbeiterService.findAll();

        model.addAttribute("mitarbeiter", mitarbeiterListe);

        return "liste-mitarbeiter";
    }

    @GetMapping("/neuerEintrag")
    public String eintragformularAnzeigen(Model model) {

        Mitarbeiter mitarbeiter = new Mitarbeiter();
        model.addAttribute("mitarbeiter", mitarbeiter);

        return "eintrag-formular";
    }

    @GetMapping("/eintragAktualisieren")
    public String aktualisierenFormularAnzeigen(@RequestParam("mitarbeiterId") int id, Model model) {

        Mitarbeiter mitarbeiter = mitarbeiterService.findById(id);

        model.addAttribute("mitarbeiter", mitarbeiter);

        return "eintrag-formular";
    }

    @PostMapping("/hinzufuegen")
    public String eintragHinzufuegen(@ModelAttribute("mitarbeiter") Mitarbeiter mitarbeiter) {

        mitarbeiterService.save(mitarbeiter);

        return "redirect:/mitarbeiter/liste";
    }

    @GetMapping("/loeschen")
    public String eintragLoeschen(@RequestParam("mitarbeiterId") int id) {

        mitarbeiterService.deleteById(id);
        return "redirect:/mitarbeiter/liste";
    }
}
