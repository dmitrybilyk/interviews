package com.learn.testing.mockito.codeprojectcom;

public interface PersonDao
{
    public Person fetchPerson(Integer personID);
    public void update(Person person);
} 