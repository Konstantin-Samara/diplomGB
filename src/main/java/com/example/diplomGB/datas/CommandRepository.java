package com.example.diplomGB.datas;

import com.example.diplomGB.models.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, Long> {
}
