package com.learn.web.gwt.client.sap;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

//import com.sap.sse.common.Distance;
//import com.sap.sse.common.Duration;

/**
 * Holds data about one competitor and all races represented by the owning {@link LeaderboardDTO leaderboard}.
 * 
 * @author Axel Uhl (D043530)
 *
 */
public class LeaderboardRowDTO implements Serializable {
    private static final long serialVersionUID = -5421934148931661900L;
    public CompetitorDTO competitor;
    public BoatDTO boat;
    public Map<String, LeaderboardEntryDTO> fieldsByRaceColumnName;
    public Double carriedPoints;
    public Double netPoints;
    public Double totalTimeSailedInSeconds;
    public Double totalTimeSailedDownwindInSeconds;
    public Double maximumSpeedOverGroundInKnots;
    public Date whenMaximumSpeedOverGroundWasAchieved;
    public Double totalTimeSailedUpwindInSeconds;
    public Double totalTimeSailedReachingInSeconds;
    public Double totalDistanceTraveledInMeters;
    public Double totalDurationFoiledInSeconds;
    public Double totalDistanceFoiledInMeters;
    public Integer totalScoredRaces;
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carriedPoints == null) ? 0 : carriedPoints.hashCode());
        result = prime * result + ((competitor == null) ? 0 : competitor.hashCode());
        result = prime * result + ((boat == null) ? 0 : boat.hashCode());
        result = prime * result + ((fieldsByRaceColumnName == null) ? 0 : fieldsByRaceColumnName.hashCode());
        result = prime * result
                + ((maximumSpeedOverGroundInKnots == null) ? 0 : maximumSpeedOverGroundInKnots.hashCode());
        result = prime * result
                + ((totalDistanceTraveledInMeters == null) ? 0 : totalDistanceTraveledInMeters.hashCode());
        result = prime * result
                + ((totalDurationFoiledInSeconds == null) ? 0 : totalDurationFoiledInSeconds.hashCode());
        result = prime * result
                + ((totalDistanceFoiledInMeters == null) ? 0 : totalDistanceFoiledInMeters.hashCode());
        result = prime * result + ((netPoints == null) ? 0 : netPoints.hashCode());
        result = prime * result
                + ((totalTimeSailedDownwindInSeconds == null) ? 0 : totalTimeSailedDownwindInSeconds.hashCode());
        result = prime * result + ((totalTimeSailedInSeconds == null) ? 0 : totalTimeSailedInSeconds.hashCode());
        result = prime * result
                + ((totalTimeSailedReachingInSeconds == null) ? 0 : totalTimeSailedReachingInSeconds.hashCode());
        result = prime * result
                + ((totalTimeSailedUpwindInSeconds == null) ? 0 : totalTimeSailedUpwindInSeconds.hashCode());
        result = prime
                * result
                + ((whenMaximumSpeedOverGroundWasAchieved == null) ? 0 : whenMaximumSpeedOverGroundWasAchieved
                        .hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LeaderboardRowDTO other = (LeaderboardRowDTO) obj;
        if (carriedPoints == null) {
            if (other.carriedPoints != null)
                return false;
        } else if (!carriedPoints.equals(other.carriedPoints))
            return false;
        if (competitor == null) {
            if (other.competitor != null)
                return false;
        } else if (!competitor.equals(other.competitor))
            return false;
        if (boat == null) {
            if (other.boat != null)
                return false;
        } else if (!boat.equals(other.boat))
            return false;
        if (fieldsByRaceColumnName == null) {
            if (other.fieldsByRaceColumnName != null)
                return false;
        } else if (!fieldsByRaceColumnName.equals(other.fieldsByRaceColumnName))
            return false;
        if (maximumSpeedOverGroundInKnots == null) {
            if (other.maximumSpeedOverGroundInKnots != null)
                return false;
        } else if (!maximumSpeedOverGroundInKnots.equals(other.maximumSpeedOverGroundInKnots))
            return false;
        if (totalDistanceTraveledInMeters == null) {
            if (other.totalDistanceTraveledInMeters != null)
                return false;
        } else if (!totalDistanceTraveledInMeters.equals(other.totalDistanceTraveledInMeters))
            return false;
        if (totalDurationFoiledInSeconds == null) {
            if (other.totalDurationFoiledInSeconds != null)
                return false;
        } else if (!totalDurationFoiledInSeconds.equals(other.totalDurationFoiledInSeconds))
            return false;
        if (totalDistanceFoiledInMeters == null) {
            if (other.totalDistanceFoiledInMeters != null)
                return false;
        } else if (!totalDistanceFoiledInMeters.equals(other.totalDistanceFoiledInMeters))
            return false;
        if (netPoints == null) {
            if (other.netPoints != null)
                return false;
        } else if (!netPoints.equals(other.netPoints))
            return false;
        if (totalTimeSailedDownwindInSeconds == null) {
            if (other.totalTimeSailedDownwindInSeconds != null)
                return false;
        } else if (!totalTimeSailedDownwindInSeconds.equals(other.totalTimeSailedDownwindInSeconds))
            return false;
        if (totalTimeSailedInSeconds == null) {
            if (other.totalTimeSailedInSeconds != null)
                return false;
        } else if (!totalTimeSailedInSeconds.equals(other.totalTimeSailedInSeconds))
            return false;
        if (totalTimeSailedReachingInSeconds == null) {
            if (other.totalTimeSailedReachingInSeconds != null)
                return false;
        } else if (!totalTimeSailedReachingInSeconds.equals(other.totalTimeSailedReachingInSeconds))
            return false;
        if (totalTimeSailedUpwindInSeconds == null) {
            if (other.totalTimeSailedUpwindInSeconds != null)
                return false;
        } else if (!totalTimeSailedUpwindInSeconds.equals(other.totalTimeSailedUpwindInSeconds))
            return false;
        if (whenMaximumSpeedOverGroundWasAchieved == null) {
            if (other.whenMaximumSpeedOverGroundWasAchieved != null)
                return false;
        } else if (!whenMaximumSpeedOverGroundWasAchieved.equals(other.whenMaximumSpeedOverGroundWasAchieved))
            return false;
        return true;
    }
    
    public Distance getDistanceTraveled(String raceColumnName) {
        final Distance result = null;
//        LeaderboardEntryDTO fieldsForRace = fieldsByRaceColumnName.get(raceColumnName);
//        if (fieldsForRace != null) {
//            result = fieldsForRace.getDistanceTraveled();
//        } else {
//            result = null;
//        }
        return result;
    }
    
    public Duration getTimeSailed(String raceColumnName) {
        final Duration result = null;
//        LeaderboardEntryDTO fieldsForRace = fieldsByRaceColumnName.get(raceColumnName);
//        if (fieldsForRace != null) {
//            result = fieldsForRace.getTimeSailed();
//        } else {
//            result = null;
//        }
        return result;
    }
    
    public Distance getDistanceFoiled(String raceColumnName) {
        final Distance result = null;
//        LeaderboardEntryDTO fieldsForRace = fieldsByRaceColumnName.get(raceColumnName);
//        if (fieldsForRace != null) {
//            result = fieldsForRace.getDistanceFoiled();
//        } else {
//            result = null;
//        }
        return result;
    }
    
    public Duration getDurationFoiled(String raceColumnName) {
        final Duration result = null;
//        LeaderboardEntryDTO fieldsForRace = fieldsByRaceColumnName.get(raceColumnName);
//        if (fieldsForRace != null) {
//            result = fieldsForRace.getDurationFoiled();
//        } else {
//            result = null;
//        }
        return result;
    }
    
    @Override
    public String toString() {
        return "LeaderboardRowDTO for competitor "+competitor;
    }
}
