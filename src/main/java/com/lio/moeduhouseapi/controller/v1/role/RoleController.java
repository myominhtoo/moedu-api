package com.lio.moeduhouseapi.controller.v1.role;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lio.moeduhouseapi.exception.custom.Index.DuplicateRoleException;
import com.lio.moeduhouseapi.exception.custom.Index.InvalidRoleIdException;
import com.lio.moeduhouseapi.exception.custom.Index.UnableUpdateRoleException;
import com.lio.moeduhouseapi.model.dto.HttpResponse;
import com.lio.moeduhouseapi.model.entity.Role;
import com.lio.moeduhouseapi.service.implementation.RoleServiceImpl;

@RestController
@RequestMapping( value =  "/api/v1" )
public class RoleController {
    
    private RoleServiceImpl roleService;

    @Autowired
    public RoleController( RoleServiceImpl roleService ){
        this.roleService = roleService;
    }

    /*
     * getting all roles
     */
    @GetMapping( value = "/roles" )
    public List<Role> getAllRoles(){
        return this.roleService.getRoles();
    }

    /*
     * getting target role
     */
    @GetMapping( value = "/roles/{roleId}" )
    public ResponseEntity<Role> getRole( @PathVariable("roleId") Integer roleId ){
        return ResponseEntity.ok().body(this.roleService.getRoleById(roleId));
    }

    /*
     * create new role
     */
    @PostMapping( value = "/roles" )
    public ResponseEntity<HttpResponse<Role>> postCreateNewRole( @RequestBody Role role ) throws DuplicateRoleException{
        Role createdRole = this.roleService.createRole(role);
        boolean createdStatus = createdRole != null;
        HttpResponse<Role> httpResponse = new HttpResponse<Role>(
            LocalDateTime.now() , 
            createdStatus ? "Successfully Created Role!" : "Failed to create role!" ,
            createdStatus ,
            createdStatus ? HttpStatus.OK : HttpStatus.BAD_REQUEST ,
            createdStatus ? HttpStatus.OK.value() : HttpStatus.BAD_REQUEST.value() , 
            createdRole );
        return ResponseEntity.ok().body(httpResponse);
    }

    /*
     * to update role
     */
    @PutMapping( value = "/roles/{roleId}" )
    public ResponseEntity<HttpResponse<Role>> putUpdateRole( @RequestBody Role role ) throws InvalidRoleIdException, UnableUpdateRoleException, DuplicateRoleException{
        Role updatedRole = this.roleService.updateRole(role);
        boolean updatedStatus = updatedRole != null;
        HttpResponse<Role> httpResponse = new HttpResponse<Role>( 
            LocalDateTime.now(), 
            updatedStatus ? "Successfully Updated Role!" : "Failed to update role!" , 
            updatedStatus , 
            updatedStatus ? HttpStatus.OK : HttpStatus.BAD_REQUEST ,
            updatedStatus ? HttpStatus.OK.value() : HttpStatus.BAD_REQUEST.value()  , 
            updatedRole );
        return ResponseEntity.ok().body(httpResponse);
    }

}
