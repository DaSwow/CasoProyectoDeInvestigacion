/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.PubCongreso;
import java.util.Collection;

/**
 *
 * @author carls
 */
public interface IPubCongresoDAO {
    
     public void create(PubCongreso pubCongreso);

    public PubCongreso read(Integer id);

    public void update(PubCongreso pubCongreso);

    public void delete(PubCongreso pubCongreso);

     public Collection<PubCongreso> getAll();
    
}
