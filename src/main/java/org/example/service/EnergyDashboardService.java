package org.example.service;

import org.example.entity.EnergyDashboard;
import java.util.List;
import org.example.repository.EnergyDashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  A service class to manage business logic and interact with the repository.
 *  This class can be used to retrieve data for the dashboard.
 */
@Service
public class EnergyDashboardService {

    private final EnergyDashboardRepository energyDashboardRepository;

    @Autowired
    public EnergyDashboardService(EnergyDashboardRepository energyDashboardRepository) {
        this.energyDashboardRepository = energyDashboardRepository;
    }

    public List<EnergyDashboard> getAllEnergyData() {
        return energyDashboardRepository.findAll();
    }
}
