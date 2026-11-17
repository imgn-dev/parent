package be.imgn.it;

import be.imgn.gaia.core.io.ByteSource;

/** A type whose API takes one of gaia's types. */
public final class Reader {

    private Reader() {}

    /**
     * Returns its source.
     *
     * @param source the source
     * @return the source
     */
    public static ByteSource read(ByteSource source) {
        return source;
    }
}
