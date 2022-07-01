package com.backend.system.repository;

import com.backend.system.models.CreateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface SystemRepository extends JpaRepository<CreateModel, Event.ID> {

}
