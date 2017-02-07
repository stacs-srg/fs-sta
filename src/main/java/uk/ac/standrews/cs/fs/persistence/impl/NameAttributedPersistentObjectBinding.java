/*
 * Created on May 22, 2005 at 2:35:52 PM.
 */
package uk.ac.standrews.cs.fs.persistence.impl;

import uk.ac.standrews.cs.fs.interfaces.IFileSystemObject;
import uk.ac.standrews.cs.fs.persistence.interfaces.INameAttributedPersistentObjectBinding;

/**
 * Implements a binding between a logical name and an IFileSystemObject
 * A Directory contains a collection of these bindings.
 *
 * @author al
 */
public class NameAttributedPersistentObjectBinding implements INameAttributedPersistentObjectBinding {

    private String name;
    private IFileSystemObject obj;
    
    /**
     * Creates a binding between a name and a GUID.
     * 
     * @param name the name
     * @param obj an IFileSystemObject
     */
    public NameAttributedPersistentObjectBinding(String name, IFileSystemObject obj) {
        this.name = name;
        this.obj = obj;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the IFileSystemObject.
     * 
     * @return the IFileSystemObject
     */
    public IFileSystemObject getObject() {
        return obj;
    }

}
