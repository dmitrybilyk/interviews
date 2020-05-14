//package com.learn.web.gwt.client.sap;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
////import com.sap.sailing.domain.common.LeaderboardNameConstants;
////import com.sap.sailing.domain.common.RaceIdentifier;
////import com.sap.sailing.domain.common.RegattaAndRaceIdentifier;
////import com.sap.sse.common.Util;
////import com.sap.sse.security.shared.dto.NamedDTO;
//
//public class RaceColumnDTO extends NamedDTO implements Serializable {
//    private static final long serialVersionUID = -3228244237400937852L;
//    private boolean medalRace;
//    private List<FleetDTO> fleets;
//    private Map<FleetDTO, RegattaAndRaceIdentifier> trackedRaceIdentifiersPerFleet;
//    private Map<FleetDTO, RaceDTO> racesPerFleet;
//    private Double explicitFactor;
//    private double effectiveFactor;
//    private Map<FleetDTO, RaceLogTrackingInfoDTO> raceLogTrackingInfos;
//
//    public enum RaceColumnLiveState { NOT_TRACKED, TRACKED, TRACKED_AND_LIVE };
//
//    public RaceColumnDTO() {
//        trackedRaceIdentifiersPerFleet = new HashMap<FleetDTO, RegattaAndRaceIdentifier>();
//        raceLogTrackingInfos = new HashMap<FleetDTO, RaceLogTrackingInfoDTO>();
//        racesPerFleet = new HashMap<FleetDTO, RaceDTO>();
//        fleets = new ArrayList<FleetDTO>();
//    }
//
//    public RaceColumnLiveState getLiveState(long serverTimePointAsMillis) {
//        RaceColumnLiveState result = RaceColumnLiveState.NOT_TRACKED;
//        if (hasLiveRaces(serverTimePointAsMillis) && hasGPSData() && hasWindData()) {
//            result = RaceColumnLiveState.TRACKED_AND_LIVE;
//        } else if (hasTrackedRaces()) {
//            result = RaceColumnLiveState.TRACKED;
//        }
//        return result;
//    }
//
//    public String getRaceColumnName() {
//        return getName();
//    }
//
//    public Double getExplicitFactor() {
//        return explicitFactor;
//    }
//
//    public void setExplicitFactor(Double explicitFactor) {
//        this.explicitFactor = explicitFactor;
//    }
//
//    public boolean hasTrackedRace(RaceIdentifier raceIdentifier) {
//        return trackedRaceIdentifiersPerFleet.values().contains(raceIdentifier);
//    }
//
//    public FleetDTO getFleet(RaceIdentifier raceIdentifier) {
//        FleetDTO result = null;
//        for (FleetDTO identifier : trackedRaceIdentifiersPerFleet.keySet()) {
//            if (Util.equalsWithNull(trackedRaceIdentifiersPerFleet.get(identifier), raceIdentifier)) {
//                result = identifier;
//                break;
//            }
//        }
//        return result;
//    }
//
//    public boolean isMedalRace() {
//        return medalRace;
//    }
//
//    public void setMedalRace(boolean medalRace) {
//        this.medalRace = medalRace;
//    }
//
//    public boolean isTrackedRace(FleetDTO fleet) {
//        return trackedRaceIdentifiersPerFleet.get(fleet) != null;
//    }
//
//    public void setRaceIdentifier(FleetDTO fleet, RegattaAndRaceIdentifier raceIdentifier) {
//        this.trackedRaceIdentifiersPerFleet.put(fleet, raceIdentifier);
//    }
//
//    /**
//     * @return a non-<code>null</code> race identifier if this column represents a <em>tracked</em> race. Such a race's
//     *         data can be obtained from the server in great detail, as opposed to non-tracked races for which only
//     *         result points may have been entered manually.
//     */
//    public RegattaAndRaceIdentifier getRaceIdentifier(FleetDTO fleet) {
//        return trackedRaceIdentifiersPerFleet.get(fleet);
//    }
//
//    /**
//     * Returns an object with data (e.g. start date or places) for the RaceInLeaderboardDTO. Is <code>null</code>, if
//     * the method {@link RaceColumnDTO#isTrackedRace(String)} returns <code>false</code>.
//     *
//     * @return An Object with additional data, or <code>null</code> if the race isn't tracked
//     */
//    public RaceDTO getRace(FleetDTO fleet) {
//        return racesPerFleet.get(fleet);
//    }
//
//    public void setRace(FleetDTO fleet, RaceDTO race) {
//        this.racesPerFleet.put(fleet, race);
//    }
//
//    public List<FleetDTO> getFleets() {
//        return fleets;
//    }
//
//    /**
//     * @return The start of race, or the start of tracking if the start of race is <code>null</code>, or
//     *         <code>null</code> if no race or no start date and no start of tracking are available.
//     */
//    public Date getStartDate(FleetDTO fleet) {
//        Date start = null;
//        RaceDTO raceDTO = racesPerFleet.get(fleet);
//        if (raceDTO != null) {
//            start = raceDTO.startOfRace;
//            if (start == null && raceDTO.isTracked) {
//                start = raceDTO.trackedRace.startOfTracking;
//            }
//        }
//        return start;
//    }
//
//    public Date getStartOfTracking(FleetDTO fleet){
//        Date start = null;
//        RaceDTO raceDTO = racesPerFleet.get(fleet);
//        if (raceDTO != null && raceDTO.isTracked) {
//            start = raceDTO.trackedRace.startOfTracking;
//        }
//        return start;
//    }
//
//    public Date getEndOfTracking(FleetDTO fleet){
//        Date start = null;
//        RaceDTO raceDTO = racesPerFleet.get(fleet);
//        if (raceDTO != null && raceDTO.isTracked) {
//            start = raceDTO.trackedRace.endOfTracking;
//        }
//        return start;
//    }
//
//    /**
//     * @return The {@link PlacemarkOrderDTO places} or <code>null</code>, if no places are available
//     */
//    public PlacemarkOrderDTO getPlaces() {
//        PlacemarkOrderDTO places = null;
//        for (RaceDTO race : racesPerFleet.values()) {
//            if (race != null) {
//                if (places == null) {
//                    places = race.places;
//                } else {
//                    places.add(race.places);
//                }
//            }
//        }
//        return places;
//    }
//
//    /**
//     * @see {@link TrackedRace#isLive} for further explanation.
//     * @param serverTimePointAsMillis
//     *            the time point (in server clock time) at which to determine whether the race for <code>fleet</code>
//     *            is/was live
//     * @return <code>true</code> if <code>serverTimePointAsMillis</code> is between (inclusively) the start and end time
//     *         point of the "live" interval as defined above.
//     */
//    public boolean isLive(FleetDTO fleet, long serverTimePointAsMillis) {
//        boolean result = false;
//        final RaceDTO raceDTO = racesPerFleet.get(fleet);
//        if (raceDTO != null) {
//            result = raceDTO.isLive(serverTimePointAsMillis);
//        }
//        return result;
//    }
//
//    public boolean containsRace(RaceIdentifier preSelectedRace) {
//        return trackedRaceIdentifiersPerFleet.values().contains(preSelectedRace);
//    }
//
//    public boolean hasLiveRaces(long serverTimePointAsMillis) {
//        boolean result = false;
//        for (FleetDTO fleet: fleets) {
//            result |= isLive(fleet, serverTimePointAsMillis);
//        }
//        return result;
//    }
//
//    public boolean hasTrackedRaces() {
//        Set<RegattaAndRaceIdentifier> raceIdentifiers = new HashSet<RegattaAndRaceIdentifier>(trackedRaceIdentifiersPerFleet.values());
//        raceIdentifiers.remove(null);
//        return !raceIdentifiers.isEmpty();
//    }
//
//    public void addFleet(FleetDTO fleet) {
//        fleets.add(fleet);
//    }
//
//    public boolean hasGPSData() {
//        for (RaceDTO race : racesPerFleet.values()) {
//            if (race != null && race.trackedRace != null && race.trackedRace.hasGPSData) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean hasWindData() {
//        for (RaceDTO race : racesPerFleet.values()) {
//            if (race != null && race.trackedRace != null && race.trackedRace.hasWindData) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = super.hashCode();
//        long temp;
//        temp = Double.doubleToLongBits(effectiveFactor);
//        result = prime * result + (int) (temp ^ (temp >>> 32));
//        result = prime * result + ((explicitFactor == null) ? 0 : explicitFactor.hashCode());
//        result = prime * result + ((fleets == null) ? 0 : fleets.hashCode());
//        result = prime * result + (medalRace ? 1231 : 1237);
//        result = prime * result + ((racesPerFleet == null) ? 0 : racesPerFleet.hashCode());
//        result = prime * result
//                + ((trackedRaceIdentifiersPerFleet == null) ? 0 : trackedRaceIdentifiersPerFleet.hashCode());
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (!super.equals(obj))
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        RaceColumnDTO other = (RaceColumnDTO) obj;
//        if (Double.doubleToLongBits(effectiveFactor) != Double.doubleToLongBits(other.effectiveFactor))
//            return false;
//        if (explicitFactor == null) {
//            if (other.explicitFactor != null)
//                return false;
//        } else if (!explicitFactor.equals(other.explicitFactor))
//            return false;
//        if (fleets == null) {
//            if (other.fleets != null)
//                return false;
//        } else if (!fleets.equals(other.fleets))
//            return false;
//        if (medalRace != other.medalRace)
//            return false;
//        if (racesPerFleet == null) {
//            if (other.racesPerFleet != null)
//                return false;
//        } else if (!racesPerFleet.equals(other.racesPerFleet))
//            return false;
//        if (trackedRaceIdentifiersPerFleet == null) {
//            if (other.trackedRaceIdentifiersPerFleet != null)
//                return false;
//        } else if (!trackedRaceIdentifiersPerFleet.equals(other.trackedRaceIdentifiersPerFleet))
//            return false;
//        return true;
//    }
//
//    public void setEffectiveFactor(double effectiveFactor) {
//        this.effectiveFactor = effectiveFactor;
//    }
//
//    public double getEffectiveFactor() {
//        return effectiveFactor;
//    }
//
//    public RaceLogTrackingInfoDTO getRaceLogTrackingInfo(FleetDTO fleet) {
//        return raceLogTrackingInfos.get(fleet);
//    }
//
//    public void setRaceLogTrackingInfo(FleetDTO fleet, RaceLogTrackingInfoDTO info) {
//        raceLogTrackingInfos.put(fleet, info);
//    }
//
//    public String getSeriesName() {
//        return LeaderboardNameConstants.DEFAULT_SERIES_NAME;
//    }
//}
