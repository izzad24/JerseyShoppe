package com.wayne.jerseyshop.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wayne.jerseyshop.entity.Product;

/**
 * ProductRepository
 */
@Transactional
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}