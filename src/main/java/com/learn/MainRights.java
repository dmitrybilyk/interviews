package com.learn;

import lombok.Data;
import org.apache.commons.collections.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class MainRights {
  public static void main(String[] args) {
    Role role1 = new Role();
    role1.setName("role1");

    Role role2 = new Role();
    role2.setName("role2");

    Role role3 = new Role();
    role3.setName("role3");

    Role compositeRole1 = new Role();
    compositeRole1.setName("compositeRole1");
    compositeRole1.setComposites(Arrays.asList(role1, role2));

    Role compositeRole2 = new Role();
    compositeRole2.setName("compositeRole2");
    compositeRole2.setComposites(Collections.singletonList(role3));

    KeycloakUser user = new KeycloakUser();
    user.setRoles(new HashSet<>(Arrays.asList(compositeRole2, compositeRole1)));

    System.out.println(hasRight(user.getRoles(), "role2"));

  }

  private static boolean hasRight(Set<Role> roles, String roleName) {
    return roles.stream()
            .anyMatch(role -> CollectionUtils.isNotEmpty(role.getComposites()) &&
                    role.getComposites().stream()
                            .map(Role::getName)
                            .collect(Collectors.toList()).stream()
                            .anyMatch(childRoleName -> childRoleName.equalsIgnoreCase(roleName)));
  }
}

@Data
class Role {
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;
  private List<Role> composites;
}

@Data
class KeycloakUser {
  private Set<Role> roles;
}
