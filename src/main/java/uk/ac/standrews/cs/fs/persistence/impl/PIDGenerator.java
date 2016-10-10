/*
 * Created on 11-Aug-2005
 */
package uk.ac.standrews.cs.fs.persistence.impl;

import uk.ac.standrews.cs.IPID;
import uk.ac.standrews.cs.exceptions.GUIDGenerationException;
import uk.ac.standrews.cs.fs.persistence.interfaces.IData;
import uk.ac.standrews.cs.fs.persistence.interfaces.IPIDGenerator;
import uk.ac.standrews.cs.fs.util.Error;
import uk.ac.standrews.cs.impl.SHAKeyFactory;

public class PIDGenerator implements IPIDGenerator {

    public IPID dataToPID(IData data) {
        IPID pid = null;
        try {
            pid = (IPID) SHAKeyFactory.generateKey(data.getState());
        } catch (GUIDGenerationException e) {
            Error.error("Unable to generate sha1 key");
        }
        return pid;
    }
}
