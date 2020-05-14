package com.learn.web.gwt.client.sap;

import java.util.Map;

//import com.sap.sailing.domain.common.dto.AbstractLeaderboardDTO;
//import com.sap.sailing.domain.common.dto.CompetitorDTO;
//import com.sap.sailing.domain.common.dto.LeaderboardRowDTO;

/**
 * A {@link ClassicLeaderboardPanel} does not always display all rows available. One reason for filtering can be a filter set
 * explicitly by the user. Another can be that the leaderboard panel is configured to only show entries for one
 * particular race. Other UI controls that need to know which rows are being shown shall not need to see the entire
 * {@link ClassicLeaderboardPanel} interface. Therefore, this interface provides the capabilities needed.
 * 
 * @author Axel Uhl (D043530)
 * 
 */
public interface DisplayedLeaderboardRowsProvider {
    /**
     * Extracts the rows to display of the <code>leaderboard</code>. These are all {@link AbstractLeaderboardDTO#rows
     * rows} in case {@link #preSelectedRace} is <code>null</code>, or only the rows of the competitors who scored in
     * the race identified by {@link #preSelectedRace} otherwise.
     */
    public Map<CompetitorDTO, LeaderboardRowDTO> getRowsToDisplay();
}
