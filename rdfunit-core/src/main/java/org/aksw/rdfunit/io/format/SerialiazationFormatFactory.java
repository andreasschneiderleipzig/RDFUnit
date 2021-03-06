package org.aksw.rdfunit.io.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * <p>SerialiazationFormatFactory class.</p>
 *
 * @author Dimitris Kontokostas
 *         Description
 * @since 6/18/14 4:27 PM
 * @version $Id: $Id
 */
public final class SerialiazationFormatFactory {

    private SerialiazationFormatFactory() {
    }

    /**
     * Returns a list with all the defined serialization formats
     *
     * @return a {@link java.util.Collection} object.
     */
    public static Collection<SerializationFormat> getAllFormats() {
        ArrayList<SerializationFormat> serializationFormats = new ArrayList<>();

        serializationFormats.add(createTurtle());
        serializationFormats.add(createN3());
        serializationFormats.add(createNTriples());
        serializationFormats.add(createJsonLD());
        serializationFormats.add(createRDFJson());
        serializationFormats.add(createRDFXMLAbbrevOut());
        serializationFormats.add(createRDFXMLIn());
        serializationFormats.add(createRDFXMLOut());
        serializationFormats.add(createRDFa());
        serializationFormats.add(createHTML());


        return serializationFormats;
    }


    /**
     * <p>createHTML.</p>
     *
     * @return an HTML format as output only
     */
    public static SerializationFormat createHTML() {
        // HTML -> only output
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("html", "htm"));
        return new SerializationFormat(
                "html", SerializationFormatType.output, "html", "text/html", currentSynonyms);

    }

    /**
     * <p>createTurtle.</p>
     *
     * @return a new TURTLE format for input/output
     */
    public static SerializationFormat createTurtle() {
        // Turtle -> input & output
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("turtle", "ttl"));
        return new SerializationFormat(
                "TURTLE", SerializationFormatType.inputAndOutput, "ttl", "text/turtle", currentSynonyms);

    }

    /**
     * <p>createN3.</p>
     *
     * @return a new N3 format for input/output
     */
    public static SerializationFormat createN3() {
        // N3 -> input & output
        HashSet<String> currentSynonyms = new HashSet<>();
        return new SerializationFormat(
                "N3", SerializationFormatType.inputAndOutput, "n3", "rdf+n3", currentSynonyms);
    }

    /**
     * <p>createNTriples.</p>
     *
     * @return a new NTRIPLES format for input/output
     */
    public static SerializationFormat createNTriples() {
        // ntriples -> input & output
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("n-triple", "n-triples", "ntriple", "ntriples", "nt"));
        return new SerializationFormat(
                "N-TRIPLE", SerializationFormatType.inputAndOutput, "nt", "application/n-triples", currentSynonyms);

    }

    /**
     * <p>createJsonLD.</p>
     *
     * @return a new JSON-LD format for input/output
     */
    public static SerializationFormat createJsonLD() {
        // JSON-LD -> input & output
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("JSON-LD", "JSONLD", "JSON/LD"));
        return new SerializationFormat(
                "JSON-LD", SerializationFormatType.inputAndOutput, "jsonld", "application/ld+json", currentSynonyms);
    }

    /**
     * <p>createRDFJson.</p>
     *
     * @return a new RDF/JSON format for input/output
     */
    public static SerializationFormat createRDFJson() {
        // RDF/JSON -> input & output
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("RDF/JSON", "RDF-JSON", "RDFJSON", "RJ"));
        return new SerializationFormat(
                "RDF/JSON", SerializationFormatType.inputAndOutput, "rj", "application/rdf+json", currentSynonyms);
    }

    /**
     * <p>createRDFXMLAbbrevOut.</p>
     *
     * @return a new XML/RDF-ABBREV format for output only
     */
    public static SerializationFormat createRDFXMLAbbrevOut() {
        // RDF/XML-ABBREV -> output only
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("RDF/XML-ABBREV", "RDF-XML-ABBREV", "RDFXMLABBREV"));
        return new SerializationFormat(
                "RDF/XML-ABBREV", SerializationFormatType.output, "rdf", "application/rdf+xml", currentSynonyms);
    }

    /**
     * <p>createRDFXMLOut.</p>
     *
     * @return a new XML/RDF format for output only
     */
    public static SerializationFormat createRDFXMLOut() {
        // RDF/XML -> output (split it to disambiguate abbrev)
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("RDF/XML", "RDF-XML", "RDFXML"));
        return new SerializationFormat(
                "RDF/XML", SerializationFormatType.output, "rdf", "application/rdf+xml", currentSynonyms);

    }

    /**
     * <p>createRDFXMLIn.</p>
     *
     * @return a new XML/RDF format for input only
     */
    public static SerializationFormat createRDFXMLIn() {
        // RDF/XML -> input
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("RDF/XML", "RDF-XML", "RDFXML", "RDF/XML-ABBREV", "RDF-XML-ABBREV", "RDFXML-ABBREV", "RDFXMLABBREV", "RDF", "XML"));
        return new SerializationFormat(
                "RDF/XML", SerializationFormatType.input, "rdf", "application/rdf+xml", currentSynonyms);

    }

    /**
     * <p>createRDFa.</p>
     *
     * @return a new RDFa format for input only
     * @since 0.7.2
     */
    public static SerializationFormat createRDFa() {
        // RDF/XML -> input
        HashSet<String> currentSynonyms = new HashSet<>();
        currentSynonyms.addAll(Arrays.asList("RDFa", "html", "htm"));
        return new SerializationFormat(
                "RDFA", SerializationFormatType.input, "html", "text/html", currentSynonyms);

    }
}
