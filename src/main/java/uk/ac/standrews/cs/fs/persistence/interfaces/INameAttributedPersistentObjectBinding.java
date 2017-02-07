/*
 * Created on Jun 17, 2005 at 9:25:04 AM.
 */
package uk.ac.standrews.cs.fs.persistence.interfaces;

import uk.ac.standrews.cs.fs.interfaces.IFileSystemObject;

/**
 * @author al
 */
public interface INameAttributedPersistentObjectBinding {
    /**
     * Gets the name.
     * 
     * @return the name
     */
    String getName();

    /**
     * Gets the IFileSystemObject.
     * 
     * @return the IFileSystemObject
     */
    IFileSystemObject getObject();
}