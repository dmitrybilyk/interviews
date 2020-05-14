//package com.learn.web.gwt.client.sap;
//
////import com.sap.sailing.domain.common.RankingMetrics;
////import com.sap.sailing.domain.common.RegattaAndRaceIdentifier;
////import com.sap.sailing.domain.common.RegattaNameAndRaceName;
////import com.sap.sailing.domain.common.security.SecuredDomainType;
////import com.sap.sse.security.shared.HasPermissions;
////import com.sap.sse.security.shared.QualifiedObjectIdentifier;
////import com.sap.sse.security.shared.TypeRelativeObjectIdentifier;
////import com.sap.sse.security.shared.dto.AccessControlListDTO;
////import com.sap.sse.security.shared.dto.OwnershipDTO;
////import com.sap.sse.security.shared.dto.SecuredDTO;
////import com.sap.sse.security.shared.dto.SecurityInformationDTO;
//
///**
// * Master data about a single race that is to be transferred to the client.<p>
// *
// * @author Axel Uhl (d043530)
// *
// */
//public class RaceDTO extends BasicRaceDTO implements SecuredDTO {
//    private static final long serialVersionUID = 2613189982608149975L;
//
//    private SecurityInformationDTO securityInformation = new SecurityInformationDTO();
//
//    /**
//     * Tells if this race is currently being tracked, meaning that a {@link RaceTracker} is
//     * listening for incoming GPS fixes, mark passings etc., to update a {@link TrackedRace} object
//     * accordingly.
//     */
//    public boolean isTracked;
//
//    public RaceStatusDTO status;
//
//    public PlacemarkOrderDTO places;
//
//    public TrackedRaceStatisticsDTO trackedRaceStatistics;
//
//    private String regattaName;
//    public String boatClass;
//
//    private RankingMetrics rankingMetricType;
//
//    public RaceDTO() {}
//
//    public RaceDTO(RegattaAndRaceIdentifier raceIdentifier, TrackedRaceDTO trackedRace, boolean isCurrentlyTracked, RankingMetrics rankingMetricType) {
//        super(raceIdentifier, trackedRace);
//        this.regattaName = raceIdentifier.getRegattaName();
//        this.isTracked = isCurrentlyTracked;
//        this.rankingMetricType = rankingMetricType;
//    }
//
//    public RegattaAndRaceIdentifier getRaceIdentifier() {
//        return new RegattaNameAndRaceName(regattaName, getName());
//    }
//
//    public RankingMetrics getRankingMetricType() {
//        return rankingMetricType;
//    }
//
//    public String getRegattaName() {
//        return regattaName;
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = super.hashCode();
//        result = prime * result + ((boatClass == null) ? 0 : boatClass.hashCode());
//        result = prime * result + (isTracked ? 1231 : 1237);
//        result = prime * result + ((places == null) ? 0 : places.hashCode());
//        result = prime * result + ((regattaName == null) ? 0 : regattaName.hashCode());
//        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
//        RaceDTO other = (RaceDTO) obj;
//        if (boatClass == null) {
//            if (other.boatClass != null)
//                return false;
//        } else if (!boatClass.equals(other.boatClass))
//            return false;
//        if (isTracked != other.isTracked)
//            return false;
//        if (places == null) {
//            if (other.places != null)
//                return false;
//        } else if (!places.equals(other.places))
//            return false;
//        if (regattaName == null) {
//            if (other.regattaName != null)
//                return false;
//        } else if (!regattaName.equals(other.regattaName))
//            return false;
//        if (status == null) {
//            if (other.status != null)
//                return false;
//        } else if (!status.equals(other.status))
//            return false;
//        return true;
//    }
//
//    @Override
//    public final AccessControlListDTO getAccessControlList() {
//        return securityInformation.getAccessControlList();
//    }
//
//    @Override
//    public final OwnershipDTO getOwnership() {
//        return securityInformation.getOwnership();
//    }
//
//    @Override
//    public final void setAccessControlList(final AccessControlListDTO accessControlList) {
//        this.securityInformation.setAccessControlList(accessControlList);
//    }
//
//    @Override
//    public final void setOwnership(final OwnershipDTO ownership) {
//        this.securityInformation.setOwnership(ownership);
//    }
//
//    @Override
//    public HasPermissions getPermissionType() {
//        return SecuredDomainType.TRACKED_RACE;
//    }
//
//    @Override
//    public QualifiedObjectIdentifier getIdentifier() {
//        return getPermissionType().getQualifiedObjectIdentifier(getTypeRelativeObjectIdentifier());
//    }
//
//    public TypeRelativeObjectIdentifier getTypeRelativeObjectIdentifier() {
//        return new TypeRelativeObjectIdentifier(regattaName, getName());
//    }
//
//}
