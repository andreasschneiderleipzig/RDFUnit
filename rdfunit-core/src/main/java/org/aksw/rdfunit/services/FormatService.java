package org.aksw.rdfunit.services;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import org.aksw.rdfunit.io.format.FormatType;
import org.aksw.rdfunit.io.format.FormatTypeFactory;
import org.apache.commons.collections4.BidiMap;

import java.util.Collection;
import java.util.Map;

/**
 * User: Dimitris Kontokostas
 * Static service that contains all the supported formats for input/output
 * Created: 6/18/14 7:23 PM
 */
public final class FormatService {
    private static Collection<FormatType> formatTypes = null;


    private static Collection<FormatType> getFormatTypes() {
        // initialize prefixNsBidiMap on first run
        if (formatTypes == null) {
            synchronized (FormatService.class) {
                if (formatTypes == null) {
                    formatTypes = FormatTypeFactory.getAllFormats();
                }
            }
        }
        return formatTypes;
    }

    /**
     * returns an input FormatType for a given name
     *
     * @param name the name of the format (e.g. 'ttl')
     * @return a FormatType that corresponds to the format name or null otherwise
     */
    public static FormatType getInputFormat(String name) {
        for (FormatType ft: getFormatTypes()) {
            if (ft.isAcceptedAsInput(name)) {
                return ft;
            }
        }
        return null;
    }

    /**
     * returns an output FormatType for a given name
     *
     * @param name the name of the format (e.g. 'ttl')
     * @return a FormatType that corresponds to the format name or null otherwise
     */
    public static FormatType getOutputFormat(String name) {
        for (FormatType ft: getFormatTypes()) {
            if (ft.isAcceptedAsOutput(name)) {
                return ft;
            }
        }
        return null;
    }
}