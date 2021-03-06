package org.aksw.rdfunit.tests.results;

import com.hp.hpl.jena.datatypes.xsd.XSDDateTime;

import java.util.Calendar;

/**
 * <p>DatasetOverviewResults class.</p>
 *
 * @author Dimitris Kontokostas
 *         Holds the overview results for a dataset
 * @since 6/11/14 7:48 AM
 * @version $Id: $Id
 */
public class DatasetOverviewResults {

    private long totalTests = 0;
    private long successfullTests = 0;
    private long failedTests = 0;
    private long timeoutTests = 0;
    private long errorTests = 0;
    private long individualErrors = 0;

    private XSDDateTime startTime;
    private XSDDateTime endTime;

    /**
     * <p>Constructor for DatasetOverviewResults.</p>
     */
    public DatasetOverviewResults() {
        reset();
    }

    /*
    * reset all variables
    * */
    /**
     * <p>reset.</p>
     */
    public final void reset() {
        successfullTests = 0;
        failedTests = 0;
        timeoutTests = 0;
        errorTests = 0;
        individualErrors = 0;

        startTime = null;
        endTime = null;
    }

    /**
     * <p>set.</p>
     *
     * @param results a {@link org.aksw.rdfunit.tests.results.DatasetOverviewResults} object.
     */
    public void set(DatasetOverviewResults results) {
        this.totalTests = results.totalTests;
        this.successfullTests = results.successfullTests;
        this.failedTests = results.failedTests;
        this.timeoutTests = results.timeoutTests;
        this.errorTests = results.errorTests;
        this.individualErrors = results.individualErrors;

        this.startTime = results.startTime;
        this.endTime = results.endTime;
    }


    /**
     * <p>Getter for the field <code>totalTests</code>.</p>
     *
     * @return a long.
     */
    public long getTotalTests() {
        return totalTests;
    }

    /**
     * <p>Setter for the field <code>totalTests</code>.</p>
     *
     * @param totalTests a long.
     */
    public void setTotalTests(long totalTests) {
        this.totalTests = totalTests;
    }

    /**
     * <p>Getter for the field <code>successfullTests</code>.</p>
     *
     * @return a long.
     */
    public long getSuccessfullTests() {
        return successfullTests;
    }

    /**
     * <p>increaseSuccessfullTests.</p>
     */
    public void increaseSuccessfullTests() {
        this.successfullTests++;
    }

    /**
     * <p>Getter for the field <code>failedTests</code>.</p>
     *
     * @return a long.
     */
    public long getFailedTests() {
        return failedTests;
    }

    /**
     * <p>increaseFailedTests.</p>
     */
    public void increaseFailedTests() {
        this.failedTests++;
    }

    /**
     * <p>Getter for the field <code>timeoutTests</code>.</p>
     *
     * @return a long.
     */
    public long getTimeoutTests() {
        return timeoutTests;
    }

    /**
     * <p>increaseTimeoutTests.</p>
     */
    public void increaseTimeoutTests() {
        this.timeoutTests++;
    }

    /**
     * <p>Getter for the field <code>errorTests</code>.</p>
     *
     * @return a long.
     */
    public long getErrorTests() {
        return errorTests;
    }

    /**
     * <p>increaseErrorTests.</p>
     */
    public void increaseErrorTests() {
        this.errorTests++;
    }

    /**
     * <p>Getter for the field <code>individualErrors</code>.</p>
     *
     * @return a long.
     */
    public long getIndividualErrors() {
        return individualErrors;
    }

    /**
     * <p>increaseIndividualErrors.</p>
     *
     * @param totalErrors a long.
     */
    public void increaseIndividualErrors(long totalErrors) {
        this.individualErrors = this.individualErrors + totalErrors;
    }

    /**
     * <p>Getter for the field <code>startTime</code>.</p>
     *
     * @return a {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime} object.
     */
    public XSDDateTime getStartTime() {
        return startTime;
    }

    /**
     * <p>Setter for the field <code>startTime</code>.</p>
     */
    public void setStartTime() {
        this.startTime = new XSDDateTime(Calendar.getInstance());
    }

    /**
     * <p>Getter for the field <code>endTime</code>.</p>
     *
     * @return a {@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime} object.
     */
    public XSDDateTime getEndTime() {
        return endTime;
    }

    /**
     * <p>Setter for the field <code>endTime</code>.</p>
     */
    public void setEndTime() {
        this.endTime = new XSDDateTime(Calendar.getInstance());
    }
}
