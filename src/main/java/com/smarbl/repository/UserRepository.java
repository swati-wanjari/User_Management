package com.smarbl.repository;

import com.smarbl.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {

    public boolean existsByEmail(String email);

    public UserDtls findByEmail(String email);

}