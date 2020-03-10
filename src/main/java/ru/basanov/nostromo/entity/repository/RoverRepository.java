package ru.basanov.nostromo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.basanov.nostromo.entity.Rover;

public interface RoverRepository extends JpaRepository<Rover, Long> {

}
