/*
 * Created on Jun 17, 2005 at 9:25:04 AM.
 */
package uk.ac.standrews.cs.fs.persistence.interfaces;



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
     * Gets the IAttributedStatefulObject.
     * 
     * @return the IAttributedStatefulObject
     */
    IAttributedStatefulObject getObject();
}