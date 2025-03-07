package placementservice;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/placements")
public class PlacementController {
    @Autowired
    private PlacementService placementService;

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return placementService.getPlacementById(id);
    }

    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return placementService.addPlacement(placement);
    }

    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        return placementService.updatePlacement(id, placement);
    }

    @DeleteMapping("/{id}")
    public void deletePlacement(@PathVariable Long id) {
        placementService.deletePlacement(id);
    }
}