package com.girard.mndeptedanalysis.exceptions;

public class DataNotFound extends RuntimeException{
    public DataNotFound(Integer id){
        super("Could not find the data with id "+ id);
    }
}
