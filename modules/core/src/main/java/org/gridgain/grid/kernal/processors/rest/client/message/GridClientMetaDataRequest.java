/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.processors.rest.client.message;

import org.gridgain.grid.portables.*;
import org.gridgain.grid.util.typedef.internal.*;

import java.util.*;

/**
 * Metadata request.
 */
public class GridClientMetaDataRequest extends GridClientAbstractMessage {
    /** */
    private Collection<Integer> typeIds;

    /**
     * @return Type IDs.
     */
    public Collection<Integer> typeIds() {
        return typeIds;
    }

    /** {@inheritDoc} */
    @Override public void writePortable(GridPortableWriter writer) throws GridPortableException {
        super.writePortable(writer);

        GridPortableRawWriter raw = writer.rawWriter();

        raw.writeCollection(typeIds);
    }

    /** {@inheritDoc} */
    @Override public void readPortable(GridPortableReader reader) throws GridPortableException {
        super.readPortable(reader);

        GridPortableRawReader raw = reader.rawReader();

        typeIds = raw.readCollection();
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return S.toString(GridClientMetaDataRequest.class, this);
    }
}
