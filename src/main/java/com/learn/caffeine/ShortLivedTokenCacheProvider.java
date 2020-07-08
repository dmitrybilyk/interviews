package com.learn.caffeine;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by dmitry on 26.04.18.
 */
public class ShortLivedTokenCacheProvider {

  static {
    cache = Caffeine.newBuilder()
      .expireAfterAccess(20, TimeUnit.SECONDS)
      .build();
  }

  private ShortLivedTokenCacheProvider() {
  }

  private static Cache<String, String> cache;

  public static void addValueToCache(String login) {
    cache.put(UUID.randomUUID().toString(), login);
  }

  public static String getLoginByToken(String token) {
    if(token == null) {
      return null;
    }
    return cache.getIfPresent(token);
  }

  /**
   * @param login user login
   * @return fetches token by user login value
   */
  public static String getTokenByLogin(String login) {
    ConcurrentMap<String, String> stringStringConcurrentMap = cache.asMap();
    for (Map.Entry<String, String> entry : stringStringConcurrentMap.entrySet()) {
      if (stringStringConcurrentMap.get(entry.getKey()).equals(login)) {
        return entry.getKey();
      }
    }
    return null;
  }

}
