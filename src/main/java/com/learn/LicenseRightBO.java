package com.learn;

import org.apache.commons.collections.ListUtils;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public enum LicenseRightBO implements Serializable {
  VIEW_CONVERSATION_SCREEN,
  VIEW_REVIEWS,
  VIEW_SURVEYS,
  SPEECHREC_ADMIN,
  VIEW_TRAININGS,
  LIVE_MONITOR_VIEW;

  @NotNull
  public static List<String> fullRights() {
    EnumSet<LicenseRightBO> fullPermissions = EnumSet
        .of(
            VIEW_CONVERSATION_SCREEN,
            VIEW_REVIEWS,
            SPEECHREC_ADMIN,
            VIEW_TRAININGS,
            LIVE_MONITOR_VIEW);
    return asStringList(fullPermissions);
  }

  @NotNull
  public static List<String> asStringList(EnumSet<LicenseRightBO> fullPermissions) {
    return fullPermissions
        .stream()
        .map(e -> e.toString())
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println(getRoles());
  }

  private static List<String> getRoles() {
    return ListUtils.union(EnumSet.allOf(RightBO.Rights.class)
                    .stream()
                    .map(Enum::toString)
                    .collect(Collectors.toList()),
            LicenseRightBO.fullRights());
  }
}
