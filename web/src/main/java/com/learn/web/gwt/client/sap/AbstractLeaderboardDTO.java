package com.learn.web.gwt.client.sap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

//import com.sap.sailing.domain.common.LeaderboardType;
//import com.sap.sailing.domain.common.RaceIdentifier;
//import com.sap.sailing.domain.common.RegattaAndRaceIdentifier;
//import com.sap.sailing.domain.common.ScoringSchemeType;
//import com.sap.sse.common.Util;
//import com.sap.sse.security.shared.dto.NamedDTO;

public abstract class AbstractLeaderboardDTO extends NamedDTO implements Serializable {
    private static final long serialVersionUID = -205106531931903527L;

//    private List<RaceColumnDTO> races;
    public Map<CompetitorDTO, String> competitorDisplayNames;
    public Map<CompetitorDTO, LeaderboardRowDTO> rows;
    public boolean hasCarriedPoints;
    public int[] discardThresholds;

    /**
     * Set to the non-<code>null</code> regatta name if this DTO represents a <code>RegattaLeaderboard</code>.
     */
    public String regattaName;
    public String displayName;
//    public List<CourseAreaDTO> courseAreas;
    public ScoringSchemeType scoringScheme;
//    public LeaderboardType type;
    public boolean canBoatsOfCompetitorsChangePerRace;

    private Long delayToLiveInMillisForLatestRace;
    private BoatClassDTO boatClass;

    @Deprecated
    protected AbstractLeaderboardDTO() {} // for GWT serialization only

    public AbstractLeaderboardDTO(BoatClassDTO boatClass) {
        this.boatClass = boatClass;
//        races = new ArrayList<RaceColumnDTO>();
    }

    public BoatClassDTO getBoatClass() {
        return boatClass;
    }

    protected void setBoatClass(BoatClassDTO boatClass) {
        this.boatClass = boatClass;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayName(CompetitorDTO competitor) {
        if (competitorDisplayNames == null || competitorDisplayNames.get(competitor) == null) {
            return competitor.getName();
        } else {
            return competitorDisplayNames.get(competitor);
        }
    }

    /**
     * If the race column whose name is specified in <code>raceColumnName</code> has at least one competitor who has valid
     * the leg details is returned, telling the number of legs that the race column shall display. Otherwise, -1 is returned.
     * If you specify an non null <code>preselectedRace</code> the leg count is calculated only for that race for the column
     * holding that race. All other columns will be unaffected by <code>preselectedRace</code> and will return their regular
     * leg count. Note that this may lead to a situation where some competitors may have sailed more legs than others because
     * their fleet association may have varied across races.<p>
     *
     * See also bug 2604 and bug 2035.
     */
//    public int getLegCount(String raceColumnName, RaceIdentifier preselectedRace) {
//        int result = -1;
//        final boolean preselectedRaceIsInRaceColumn = isRaceInColumn(preselectedRace, raceColumnName);
//        for (LeaderboardRowDTO row : rows.values()) {
//            LeaderboardEntryDTO leaderboardEntryDTO = row.fieldsByRaceColumnName.get(raceColumnName);
//            if (leaderboardEntryDTO != null && leaderboardEntryDTO.legDetails != null
//                    // when no race is pre-selected, always use the actual leg count;
//                    // otherwise, if the pre-selected race is in the column identified by
//                    // raceColumnName, use the entry only if it's in the pre-selected race;
//                    // otherwise (a race is pre-selected but a different column's leg count
//                    // is requested), use the regular leg count as is.
//                    && (preselectedRace == null || !preselectedRaceIsInRaceColumn || preselectedRace.equals(leaderboardEntryDTO.race))) {
//                result = Math.max(result, leaderboardEntryDTO.legDetails.size());
//            }
//        }
//        return result;
//    }

//    private boolean isRaceInColumn(RaceIdentifier preselectedRace, String raceColumnName) {
//        RaceColumnDTO raceColumn = getRaceColumnByName(raceColumnName);
//        return raceColumn.containsRace(preselectedRace);
//    }
//
//    /**
//     * Tells if the <code>competitor</code> scored (and therefore presumably participated) in a medal race represented
//     * in this leaderboard.
//     */
//    public boolean scoredInMedalRace(CompetitorWithBoatDTO competitor) {
//        LeaderboardRowDTO row = rows.get(competitor);
//        for (RaceColumnDTO race : races) {
//            if (race.isMedalRace() && row.fieldsByRaceColumnName.get(race.getRaceColumnName()).netPoints > 0) {
//                return true;
//            }
//        }
//        return false;
//    }

    public Double getTotalPoints(CompetitorWithBoatDTO competitor, String nameOfLastRaceSoFar) {
        Double totalPoints = null;
        final LeaderboardRowDTO row = rows.get(competitor);
        if (row != null) {
            LeaderboardEntryDTO field = row.fieldsByRaceColumnName.get(nameOfLastRaceSoFar);
            if (field != null &&  field.totalPoints != null) {
                totalPoints = field.totalPoints;
            }
        }
        return totalPoints;
    }

//    public boolean raceIsTracked(String raceColumnName) {
//        for (RaceColumnDTO race : races) {
//            if (race.getRaceColumnName().equals(raceColumnName)) {
//                for (FleetDTO fleet : race.getFleets()) {
//                    if (race.isTrackedRace(fleet)) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//
//    }

//    public boolean raceIsMedalRace(String raceColumnName) {
//        return getRaceColumnByName(raceColumnName).isMedalRace();
//    }
//
//    /**
//     * If the {@link RaceColumnDTO} by the name <code>raceColumnName</code> doesn't exist yet within this leaderboard
//     * DTO, it is created, setting is {@link RaceColumnDTO#isValidInTotalScore()} to <code>true</code>. This method
//     * ensures that a fleet named <code>fleetName</code> is present. If it's not present yet, it's added to the race
//     * column's fleet name list. The <code>trackedRaceIdentifier</code> and <code>race</code> are associated with the
//     * column for the fleet identified by <code>fleetName</code>.
//     *
//     * @param explicitFactor
//     *            factor by which to multiply the race column's points for the overall score; if <code>null</code>, the
//     *            default will be determined by whether or not the column is marked as medal race
//     * @param effectiveFactor
//     *            is what you get when you call {@link RaceColumn#getFactor()} on the race column that the resulting
//     *            {@link RaceColumnDTO} represents
//     * @param regattaName
//     *            must not be <code>null</code> if <code>seriesName</code> is not <code>null</code>; specified
//     *            separately from <code>trackedRaceIdentifier</code> because a column may belong to regatta/series
//     *            despite not having a tracked race associated
//     * @param seriesName
//     *            if <code>null</code>, this method will produce a {@link RaceColumnDTO}, otherwise a
//     *            {@link RaceColumnInSeriesDTO}
//     * @param fleetDTO
//     *            must not be null
//     */
//    public RaceColumnDTO addRace(String raceColumnName, Double explicitFactor, double effectiveFactor,
//            String regattaName, String seriesName, FleetDTO fleetDTO, boolean medalRace,
//            RegattaAndRaceIdentifier trackedRaceIdentifier, RaceDTO race, boolean isMetaLeaderboardColumn) {
//        assert fleetDTO != null;
//        RaceColumnDTO raceColumnDTO = getRaceColumnByName(raceColumnName);
//        if (raceColumnDTO == null) {
//            raceColumnDTO = RaceColumnDTOFactory.INSTANCE.createRaceColumnDTO(raceColumnName, medalRace,
//                explicitFactor, regattaName, seriesName, isMetaLeaderboardColumn);
//            races.add(raceColumnDTO);
//        }
//        raceColumnDTO.setEffectiveFactor(effectiveFactor);
//        boolean contains = false;
//        for (FleetDTO fleet : raceColumnDTO.getFleets()) {
//            if (fleet.getName().equals(fleetDTO.getName())) {
//                contains = true;
//                break;
//            }
//        }
//        if (!contains) {
//            raceColumnDTO.addFleet(fleetDTO);
//        }
//        raceColumnDTO.setRaceIdentifier(fleetDTO, trackedRaceIdentifier);
//        raceColumnDTO.setRace(fleetDTO, race);
//        return raceColumnDTO;
//    }
//
//    public RaceColumnDTO createEmptyRaceColumn(String raceColumnName, boolean medalRace, String regattaName,
//            String seriesName, boolean isMetaLeaderboardColumn) {
//        final RaceColumnDTO raceColumn = RaceColumnDTOFactory.INSTANCE.createRaceColumnDTO(raceColumnName,
//                medalRace, /* explicit factor */ null, regattaName, seriesName, isMetaLeaderboardColumn);
//        races.add(raceColumn);
//        return raceColumn;
//    }
//
//    public RaceColumnDTO getRaceColumnByName(String raceColumnName) {
//        for (RaceColumnDTO race : races) {
//            if (race.getRaceColumnName().equals(raceColumnName)) {
//                return race;
//            }
//        }
//        return null;
//    }
//
//    public int getRaceColumnsCount() {
//        return races.size();
//    }
//
//    public int getRacesCount() {
//        int result = 0;
//        for (RaceColumnDTO race : getRaceList()) {
//            result += race.getFleets().size();
//        }
//        return result;
//    }
//
//    public int getTrackedRacesCount() {
//        int result = 0;
//        for (RaceColumnDTO raceColumn : getRaceList()) {
//            for (FleetDTO fleet : raceColumn.getFleets()) {
//                RaceDTO race = raceColumn.getRace(fleet);
//                if(race != null && race.trackedRace != null && race.trackedRace.hasGPSData && race.trackedRace.hasWindData) {
//                    result++;
//                }
//            }
//        }
//        return result;
//    }
//
//    public List<RaceColumnDTO> getRaceList() {
//        return races;
//    }
//
//    public void setRaceList(List<RaceColumnDTO> raceList) {
//        this.races = raceList;
//    }
//
//    public boolean raceListContains(String raceColumnName) {
//        return getRaceColumnByName(raceColumnName) != null;
//    }
//
//    public void moveRaceUp(String raceColumnName) {
//        RaceColumnDTO race = getRaceColumnByName(raceColumnName);
//        int index = races.indexOf(race);
//        index--;
//        if (index >= 0) {
//            races.remove(index + 1);
//            races.add(index, race);
//        }
//    }
//
//    public void moveRaceDown(String raceColumnName) {
//        RaceColumnDTO race = getRaceColumnByName(raceColumnName);
//        int index = races.indexOf(race);
//        if (index != -1) {
//            index++;
//            if (index < races.size()) {
//                races.remove(index - 1);
//                races.add(index, race);
//            }
//        }
//    }
//
//    public void setIsMedalRace(String raceColumnName, boolean medalRace) {
//        getRaceColumnByName(raceColumnName).setMedalRace(medalRace);
//    }
//
//    /**
//     * @return The earliest start date of the races, or <code>null</code> if no start dates of the races are available.
//     */
//    public Date getStartDate() {
//        Date leaderboardStart = null;
//        for (RaceColumnDTO race : getRaceList()) {
//            for (FleetDTO fleet: race.getFleets()) {
//                Date raceStart = race.getStartDate(fleet);
//                if (raceStart != null) {
//                    if (leaderboardStart == null) {
//                        leaderboardStart = new Date();
//                    } else {
//                        leaderboardStart = leaderboardStart.before(raceStart) ? leaderboardStart : raceStart;
//                    }
//                }
//            }
//        }
//        return leaderboardStart;
//    }
//
//    /**
//     * Takes the {@link PlacemarkOrderDTO} of all races in this leaderboard, if the PlacemarkOrderDTO for the race is
//     * available, and fills all {@link PlacemarkDTO} in a new PlacemarkOrderDTO.<br />
//     * The order of the races in this leaderboard determine the order of the PlacemarkDTOs in the PlacemarkOrderDTO.
//     *
//     * @return The places of this leaderboard in form of a {@link PlacemarkOrderDTO}, or <code>null</code> if the
//     *         {@link PlacemarkOrderDTO places} of no race are available
//     */
//    public PlacemarkOrderDTO getPlaces() {
//        PlacemarkOrderDTO leaderboardPlaces = null;
//        for (RaceColumnDTO race : getRaceList()) {
//            PlacemarkOrderDTO racePlaces = race.getPlaces();
//            if (racePlaces != null) {
//                if (leaderboardPlaces == null) {
//                    leaderboardPlaces = new PlacemarkOrderDTO();
//                }
//                leaderboardPlaces.getPlacemarks().addAll(racePlaces.getPlacemarks());
//            }
//        }
//        return leaderboardPlaces;
//    }
//
//    /**
//     * @return <code>true</code> if the leaderboard contains a race which is live
//     */
//    public boolean hasLiveRace(long serverTimePointAsMillis) {
//        for (RaceColumnDTO race : getRaceList()) {
//            for (FleetDTO fleet : race.getFleets()) {
//                if (race.isLive(fleet, serverTimePointAsMillis)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public List<Util.Pair<RaceColumnDTO, FleetDTO>> getLiveRaces(long serverTimePointAsMillis) {
//        List<Util.Pair<RaceColumnDTO, FleetDTO>> result = new ArrayList<Util.Pair<RaceColumnDTO, FleetDTO>>();
//        for (RaceColumnDTO race : getRaceList()) {
//            for (FleetDTO fleet : race.getFleets()) {
//                if (race.isLive(fleet, serverTimePointAsMillis)) {
//                    result.add(new Util.Pair<RaceColumnDTO, FleetDTO>(race, fleet));
//                }
//            }
//        }
//        return result;
//    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((competitorDisplayNames == null) ? 0 : competitorDisplayNames.hashCode());
//        result = prime * result + Arrays.hashCode(discardThresholds);
//        result = prime * result + (hasCarriedPoints ? 1231 : 1237);
//        result = prime * result + ((type == null) ? 0 : type.hashCode());
//        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
//        result = prime * result + ((scoringScheme == null) ? 0 : scoringScheme.hashCode());
//        if (races == null) {
//            result = prime * result;
//        } else {
//            List<String> raceNames = new ArrayList<String>();
//            for (RaceColumnDTO race : races) {
//                raceNames.add(race != null ? race.getName() : null);
//            }
//            result = prime * result + raceNames.hashCode();
//        }
//        result = prime * result + ((rows == null) ? 0 : rows.hashCode());
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        AbstractLeaderboardDTO other = (AbstractLeaderboardDTO) obj;
//        if (competitorDisplayNames == null) {
//            if (other.competitorDisplayNames != null)
//                return false;
//        } else if (!competitorDisplayNames.equals(other.competitorDisplayNames))
//            return false;
//        if (!Arrays.equals(discardThresholds, other.discardThresholds))
//            return false;
//        if (hasCarriedPoints != other.hasCarriedPoints)
//            return false;
//        if (type != other.type)
//            return false;
//        if (scoringScheme != other.scoringScheme)
//            return false;
//        if (getName() == null) {
//            if (other.getName() != null)
//                return false;
//        } else if (!getName().equals(other.getName()))
//            return false;
//        if (races == null) {
//            if (other.races != null)
//                return false;
//        } else {
//            // compare race column names only, not the contents
//            if (races.size() != (other.races==null?0:other.races.size())) {
//                return false;
//            }
//            List<String> raceColumnNames = new ArrayList<String>(races.size());
//            List<String> otherRaceColumnNames = new ArrayList<String>(races.size());
//            for (RaceColumnDTO race : races) {
//                raceColumnNames.add(race != null ? race.getName() : null);
//            }
//            if (other.races != null) {
//                for (RaceColumnDTO otherRace : other.races) {
//                    otherRaceColumnNames.add(otherRace != null ? otherRace.getName() : null);
//                }
//            }
//            if (!raceColumnNames.equals(otherRaceColumnNames))
//                return false;
//            if (rows == null) {
//                if (other.rows != null)
//                    return false;
//            } else if (!rows.equals(other.rows))
//                return false;
//        }
//        return true;
//    }

    public boolean isDisplayNameSet(CompetitorDTO competitor) {
        return competitorDisplayNames.get(competitor) != null;
    }

    public Long getDelayToLiveInMillisForLatestRace() {
        return delayToLiveInMillisForLatestRace;
    }

    public void setDelayToLiveInMillisForLatestRace(Long delayToLiveInMillisForLatestRace) {
        this.delayToLiveInMillisForLatestRace = delayToLiveInMillisForLatestRace;
    }

//    public List<String> getNamesOfRaceColumns() {
//        List<String> result = new ArrayList<>(races.size());
//        for(RaceColumnDTO column : races) {
//            result.add(column.getRaceColumnName());
//        }
//        return result;
//    }
}
