/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.PubRevistas;
import java.util.Collection;

/**
 *
 * @author carls
 */
public interface IPubRevistasDAO {

    public void create(PubRevistas pubRevistas);

    public PubRevistas read(Integer id);

    public void update(PubRevistas pubRevistas);

    public void delete(PubRevistas pubRevistas);

     public Collection<PubRevistas> getAll();
    
}
