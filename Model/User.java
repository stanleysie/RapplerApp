/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Miggy
 * @author Stanley Sie
 */
public abstract class User {
    
    public static final String TABLE_NAME = "User";
    
    private String sessionID;
    
    public static final String COL_SESSIONID = "SessionID";
}
