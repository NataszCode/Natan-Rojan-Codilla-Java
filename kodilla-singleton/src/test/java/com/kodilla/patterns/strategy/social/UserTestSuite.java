package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("MillenialUser");
        User yGen = new YGeneration("YGenUser");
        User zGen = new ZGeneration("ZGenUser");

        // When
        String millenialPost = millenial.sharePost();
        String yGenPost = yGen.sharePost();
        String zGenPost = zGen.sharePost();

        // Then
        assertEquals("Facebook", millenialPost);
        assertEquals("Twitter", yGenPost);
        assertEquals("Snapchat", zGenPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User user = new Millenials("IndividualUser");

        // When
        String defaultPost = user.sharePost();
        user.setSocialPublisher(new TwitterPublisher());
        String updatedPost = user.sharePost();

        // Then
        assertEquals("Facebook", defaultPost);
        assertEquals("Twitter", updatedPost);
    }
}
