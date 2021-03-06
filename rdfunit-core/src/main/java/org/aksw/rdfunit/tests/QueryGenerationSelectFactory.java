package org.aksw.rdfunit.tests;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import org.aksw.rdfunit.services.PrefixNSService;

/**
 * Factory that returns simple select queries
 *
 * @author Dimitris Kontokostas
 * @since 7/25/14 10:02 PM
 * @version $Id: $Id
 */
public class QueryGenerationSelectFactory implements QueryGenerationFactory {
    /** {@inheritDoc} */
    @Override
    public String getSparqlQueryAsString(TestCase testCase) {
        return PrefixNSService.getSparqlPrefixDecl() +
                " SELECT DISTINCT ?resource WHERE " + testCase.getSparqlWhere();
    }

    /** {@inheritDoc} */
    @Override
    public Query getSparqlQuery(TestCase testCase) {
        return QueryFactory.create(this.getSparqlQueryAsString(testCase));
    }
}
