package com.mfortune.softwarephoenix.repository;

import com.mfortune.softwarephoenix.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
