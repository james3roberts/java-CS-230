package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // if user has a roll and that role is called allow access. 
        return user.getRoles() !=null && user.getRoles().contains(role);
    	
    }
}