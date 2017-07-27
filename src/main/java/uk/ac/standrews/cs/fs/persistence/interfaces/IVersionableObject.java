package uk.ac.standrews.cs.fs.persistence.interfaces;

import uk.ac.standrews.cs.fs.interfaces.IFileSystemObject;
import uk.ac.standrews.cs.guid.IGUID;

import java.util.Collection;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
public interface IVersionableObject extends IFileSystemObject {

    Collection<IGUID> getPrevious();

    IGUID getInvariant();

}
