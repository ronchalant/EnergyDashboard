package org.example.controller;

import org.example.entity.EnergyDashboard;
import org.example.service.EnergyDashboardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

/**
 * Create a controller to handle HTTP requests.
 * This controller will serve as the backend for the dashboard.
 */
@Controller
public class DashboardController {

    private final EnergyDashboardService energyDashboardService;

    public DashboardController(EnergyDashboardService energyDashboardService) {
        this.energyDashboardService = energyDashboardService;
    }

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        List<EnergyDashboard> energyDashboardList = energyDashboardService.getAllEnergyData();
        model.addAttribute("energyDashboardList", energyDashboardList);
        return "dashboard";
    }
}