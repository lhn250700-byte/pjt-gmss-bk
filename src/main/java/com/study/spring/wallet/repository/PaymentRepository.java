package com.study.spring.wallet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.study.spring.Member.entity.Member;
import com.study.spring.wallet.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

//	Optional<Payment> findByOrderId(String paymentId);

}
