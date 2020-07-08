package com.learn.caffeine;

/**
 * Created by dmitry on 28.04.18.
 */
public class CacheUser {
    public static void main(String[] args) throws InterruptedException {
        ShortLivedTokenCacheProvider.addValueToCache("ccmanager");
        String token = ShortLivedTokenCacheProvider.getTokenByLogin("ccmanager");
        System.out.println(token);
        Thread.sleep(30000l);
        token = ShortLivedTokenCacheProvider.getTokenByLogin("ccmanager");
        System.out.println("token after first 30 seconds - " + token);
        System.out.println(ShortLivedTokenCacheProvider.getLoginByToken(token));
        Thread.sleep(30000l);
        token = ShortLivedTokenCacheProvider.getTokenByLogin("ccmanager");
        System.out.println("token after second 30 seconds - " + token);
        System.out.println(ShortLivedTokenCacheProvider.getLoginByToken(token));
    }
}
