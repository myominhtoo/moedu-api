package com.lio.moeduhouseapi.exception.custom;

public class Index{
    
    public static class DuplicateRoleException extends Exception{
        public DuplicateRoleException( String msg ){
            super(msg);
        }
    }

    public static class InvalidRoleIdException extends Exception{
        public InvalidRoleIdException( String msg ){
            super(msg);   
        }
    }

    public static class UnableUpdateRoleException extends Exception{
        public UnableUpdateRoleException( String msg ){
            super(msg);
        }
    }

    public static class DuplicateUserException extends Exception{
        public DuplicateUserException( String msg ){
            super(msg);
        }
    }

    public static class InvalidUserIdExcepton extends Exception{
        public InvalidUserIdExcepton( String msg ){
            super(msg);
        }
    }

}