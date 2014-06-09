/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.io.IOException;

/**
 *
 * @author fetox
 */
public interface IDAO<T> {
    
    boolean save(T contact) throws IOException;
    boolean update(T contact) throws IOException;    
}

