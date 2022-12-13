package com.lio.moeduhouseapi.service.interfaces;

import java.util.List;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateRoleException;
import com.lio.moeduhouseapi.exception.custom.Index.InvalidRoleIdException;
import com.lio.moeduhouseapi.exception.custom.Index.UnableUpdateRoleException;
import com.lio.moeduhouseapi.model.entity.Role;

public interface RoleService {

    Role createRole( Role role ) throws DuplicateRoleException;
    
    boolean isRoleDuplicate( Role role );

    boolean isUpdateRoleDuplicate( Role role );

    Role getRoleById( Integer roleId );

    List<Role> getRoles();

    Role updateRole( Role role ) throws InvalidRoleIdException , UnableUpdateRoleException , DuplicateRoleException;

}
