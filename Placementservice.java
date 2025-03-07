package placementservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public class PlacementService {
    @Autowired
    private PlacementRepository placementRepository;

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    public Placement addPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public Placement updatePlacement(Long id, Placement updatedPlacement) {
        Placement existingPlacement = placementRepository.findById(id).orElse(null);
        if (existingPlacement != null) {
            existingPlacement.setCompanyName(updatedPlacement.getCompanyName());
            existingPlacement.setJobRole(updatedPlacement.getJobRole());
            existingPlacement.setPackageOffered(updatedPlacement.getPackageOffered());
            return placementRepository.save(existingPlacement);
        }
        return null;
    }

    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
