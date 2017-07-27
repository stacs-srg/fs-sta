/*
 * Created on Jun 16, 2005 at 9:03:03 AM.
 */
package uk.ac.standrews.cs.fs.persistence.impl;

import uk.ac.standrews.cs.fs.exceptions.AccessFailureException;
import uk.ac.standrews.cs.fs.interfaces.IDirectory;
import uk.ac.standrews.cs.fs.interfaces.IFileSystemObject;
import uk.ac.standrews.cs.fs.persistence.interfaces.IAttributes;
import uk.ac.standrews.cs.fs.persistence.interfaces.IData;
import uk.ac.standrews.cs.guid.IGUID;
import uk.ac.standrews.cs.guid.IPID;

/**
 * Adds support for attributes to the state held by StatefulObject
 * 
 * @author al
 */
public abstract class FileSystemObject extends StatefulObject implements IFileSystemObject {

    IAttributes atts;

    protected String name;
    private IDirectory parent;
    
    /**
     * @param atts
     */
    public FileSystemObject(IAttributes atts) {
        super();
        this.atts = atts;
    }
 
    public FileSystemObject(IGUID guid, IAttributes atts) {
        super(guid);
        this.atts = atts;
    }
    
    public FileSystemObject(IData data, IAttributes atts) {
        super(data);
        this.atts = atts;
    }
    
    public FileSystemObject(IData data, IPID pid, IGUID guid, IAttributes atts ) {
        super( data, pid, guid );
        this.atts = atts;
    }

    public IAttributes getAttributes() {
        return atts;
    }

    public void setAttributes( IAttributes atts ) {
        this.atts = atts;
    }

    public abstract long getCreationTime() throws AccessFailureException;

    public abstract long getModificationTime() throws AccessFailureException;

    public IDirectory getParent() {
        return this.parent;
    }

    public void setParent(IDirectory parent) {
        this.parent = parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
