package uk.ac.standrews.cs.fs.interfaces;

import uk.ac.standrews.cs.fs.exceptions.AccessFailureException;
import uk.ac.standrews.cs.fs.persistence.interfaces.IAttributes;
import uk.ac.standrews.cs.fs.persistence.interfaces.IStatefulObject;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
public interface IFileSystemObject extends IStatefulObject {

    /**
     * Returns the object's attributes.
     *
     * @return the object's attributes
     */
    IAttributes getAttributes();

    /**
     * Sets the object's attributes.
     *
     * @param attributes the new attributes
     */
    void setAttributes(IAttributes attributes);

    /**
     * Returns the time at which the object was created.
     *
     * @return the time at which the object was created
     *
     * @throws AccessFailureException if the creation time could not be accessed
     */
    long getCreationTime() throws AccessFailureException;

    /**
     * Returns the time at which the object was last modified.
     *
     * @return the time at which the object was last modified
     *
     * @throws AccessFailureException if the modification time could not be accessed
     */
    long getModificationTime() throws AccessFailureException;

    void setParent(IDirectory parent);

    String getName();
    void setName(String name);
}
