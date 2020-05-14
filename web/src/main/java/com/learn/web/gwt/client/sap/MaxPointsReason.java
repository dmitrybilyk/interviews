package com.learn.web.gwt.client.sap;

/**
 * The reasons why a competitor may get the maximum number of points, usually equaling the
 * number of competitors enlisted for the regatta plus one.
 * 
 * @author Axel Uhl (d043530)
 *
 */
public enum MaxPointsReason {
    
    /** The competitor finished the race properly */
    NONE(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ false, /* appliesAtStartOfRace */ false),
    /** Did Not Start */
    DNS(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ true), 
    /** Did Not Finish */
    DNF(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** DiSQualified */
    DSQ(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** On Course Side (jumped the gun) */
    OCS(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ true),
    /** Disqualified, non-discardable */
    DND(/* discardable */ false, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** 20 % penalty under rule 30.2 */
    ZFP(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ false, /* appliesAtStartOfRace */ false),
    /** Took a Scoring penalty under rule 44.3 (a) */
    SCP(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ false, /* appliesAtStartOfRace */ false),
    /** Disqualification not excludable under rule 90.3 (b) */
    DNE(/* discardable */ false, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** Disqualification for gross misconduct not excludable under rule 90.3 (b) */
    DGM(/* discardable */ false, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** Redress given */
    RDG(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ false, /* appliesAtStartOfRace */ false),
    /** Black Flag Disqualified */
    BFD(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ true),
    /** Did Not Compete */
    DNC(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ true),
    /** Retired After Finishing */
    RAF(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** Discretionary Penalty Imposed by the race committee */
    DPI(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ false, /* appliesAtStartOfRace */ false),
    /** Retired */
    RET(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** Uniform Flag Disqualification */
    UFD(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ true),
    /** Time limit Expired */
    TLE(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** Standard Penalty by Race Committee; gives a certain number of penalty points on top of rank-inferred score */
    STP(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ false, /* appliesAtStartOfRace */ true),
    /** Disqualified after causing a tangle in an incident */
    DCT(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false),
    /** Retired after causing a tangle */
    RCT(/* discardable */ true, /* advanceCompetitorsTrackedWorse */ true, /* appliesAtStartOfRace */ false);
    
    private final boolean discardable;
    
    private final boolean advanceCompetitorsTrackedWorse;
    
    private final boolean appliesAtStartOfRace;

    private MaxPointsReason(boolean discardable, boolean advanceCompetitorsTrackedWorse, boolean appliesAtStartOfRace) {
        this.discardable = discardable;
        this.advanceCompetitorsTrackedWorse = advanceCompetitorsTrackedWorse;
        this.appliesAtStartOfRace = appliesAtStartOfRace;
    }

    public boolean isDiscardable() {
        return discardable;
    }
    
    /**
     * Most "max points reasons" are a penalty. If the competitor has finished the race and by the penalty is ranked to the "bottom,"
     * those competitors tracked worse usually will advance by one rank. However, "max points reasons" such as a redress given (RDG)
     * are different. In this case, only the points awarded to the competitor change without any effect on other competitors.
     */
    public boolean isAdvanceCompetitorsTrackedWorse() {
        return advanceCompetitorsTrackedWorse;
    }

    public boolean isAppliesAtStartOfRace() {
        return appliesAtStartOfRace;
    }
}
