package com.lio.moeduhouseapi.service.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateRoleException;
import com.lio.moeduhouseapi.exception.custom.Index.InvalidRoleIdException;
import com.lio.moeduhouseapi.exception.custom.Index.UnableUpdateRoleException;
import com.lio.moeduhouseapi.model.entity.Role;
import com.lio.moeduhouseapi.repository.RoleRepository;
import com.lio.moeduhouseapi.service.interfaces.RoleService;
import static com.lio.moeduhouseapi.model.constant.MoEdu.*;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl( RoleRepository roleRepository ){
        this.roleRepository = roleRepository;
    }

    @Override
    public Role createRole(Role role) throws DuplicateRoleException {
       if(!this.isRoleDuplicate(role)){
        return this.roleRepository.save(role);
       }else{
        throw new DuplicateRoleException("Duplicate Role!");
       }
    }

    @Override
    public Role getRoleById(Integer roleId) {
       Optional<Role> optionalRole = this.roleRepository.findById(roleId);
       return optionalRole.isPresent() ? optionalRole.get() : null;
    }

    @Override
    public List<Role> getRoles() {
       return this.roleRepository.findAll();
    }

    @Override
    public boolean isUpdateRoleDuplicate(Role role) {
       return (
         role.getId() == null
         ? true
         :  this.getRoles().stream()
            .filter( savedRole -> {
                return ( savedRole.getRoleName().equalsIgnoreCase(role.getRoleName()) &&
                ( role.getId() != null ? !savedRole.getId().equals(role.getId()) : true ) 
                );
            }).collect(Collectors.toList()).size() > 0
       );
    }

    @Override
    public boolean isRoleDuplicate(Role role) {
        return (
            ( role.getId() != null 
              ? this.getRoleById(role.getId()) != null 
              :  this.getRoles().stream()
                .filter( savedRole -> {
                    return ( savedRole.getRoleName().equalsIgnoreCase(role.getRoleName()) &&
                    ( role.getId() != null ? !savedRole.getId().equals(role.getId()) : true ) 
                    );
                }).collect(Collectors.toList()).size() > 0
            ) 
        );
    }

    @Override
    public Role updateRole(Role role) throws InvalidRoleIdException, UnableUpdateRoleException, DuplicateRoleException {
        if(Arrays.asList(UNUPDATABLE_ROLE_IDS).contains(role.getId())){
            throw new UnableUpdateRoleException("Unable to update!");
        }
        if( !this.isUpdateRoleDuplicate(role) ){
            Role savedRole = this.roleRepository.findById(role.getId())
                             .orElseThrow( () -> new InvalidRoleIdException("Invalid Role Id!"));
            savedRole.setRoleName(role.getRoleName());
            return this.roleRepository.save(savedRole);
        }else{
            throw new DuplicateRoleException("Duplicate Role!");
        }
    }
 

}
