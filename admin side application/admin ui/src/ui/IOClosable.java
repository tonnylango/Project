/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;

/**
 *
 * @author DEGUZMAN
 */
public interface IOClosable extends AutoCloseable{
    public void close() throws IOException;
}
