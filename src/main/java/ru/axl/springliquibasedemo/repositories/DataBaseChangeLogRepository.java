package ru.axl.springliquibasedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.axl.springliquibasedemo.entity.DataBaseChangeLog;

@Repository
public interface DataBaseChangeLogRepository extends JpaRepository<DataBaseChangeLog, String> {
}
