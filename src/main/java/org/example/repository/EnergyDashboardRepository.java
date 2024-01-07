package org.example.repository;

import org.example.entity.EnergyDashboard;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create a repository interface that extends JpaRepository to interact with the database.
 */
public interface EnergyDashboardRepository extends JpaRepository<EnergyDashboard, Long> {
    // Custom queries can be added if needed
}