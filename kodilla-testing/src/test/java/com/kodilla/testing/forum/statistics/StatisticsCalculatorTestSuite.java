package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StatisticsCalculatorTestSuite {

    private StatisticsCalculator statisticsCalculator;
    private Statistics statisticsMock;


    @BeforeEach
    public void setUp() {
        statisticsMock = new MockStatistics();
        statisticsCalculator = new StatisticsCalculator();
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts() {
        // Given
        List<String> users = Arrays.asList("User1", "User2");
        ((MockStatistics) statisticsMock).setUsers(users);
        ((MockStatistics) statisticsMock).setPosts(0);
        ((MockStatistics) statisticsMock).setComments(10);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(2, statisticsCalculator.getUsersCount());
        assertEquals(0, statisticsCalculator.getPostsCount());
        assertEquals(10, statisticsCalculator.getCommentsCount());
        assertEquals(0, statisticsCalculator.getAvgPostsPerUser());
        assertEquals(5, statisticsCalculator.getAvgCommentsPerUser());
        assertEquals(0, statisticsCalculator.getAvgCommentsPerPost());
    }
    @Test
    public void testCalculateAdvStatisticsWithThousandPosts() {
        // Given
        List<String> users = Arrays.asList("User1", "User2");
        ((MockStatistics) statisticsMock).setUsers(users);
        ((MockStatistics) statisticsMock).setPosts(1000);
        ((MockStatistics) statisticsMock).setComments(2000);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(2, statisticsCalculator.getUsersCount());
        assertEquals(1000, statisticsCalculator.getPostsCount());
        assertEquals(2000, statisticsCalculator.getCommentsCount());
        assertEquals(500, statisticsCalculator.getAvgPostsPerUser());
        assertEquals(1000, statisticsCalculator.getAvgCommentsPerUser());
        assertEquals(2, statisticsCalculator.getAvgCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroComments() {
        // Given
        List<String> users = Arrays.asList("User1", "User2");
        ((MockStatistics) statisticsMock).setUsers(users);
        ((MockStatistics) statisticsMock).setPosts(500);
        ((MockStatistics) statisticsMock).setComments(0);

        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(2, statisticsCalculator.getUsersCount());
        assertEquals(500, statisticsCalculator.getPostsCount());
        assertEquals(0, statisticsCalculator.getCommentsCount());
        assertEquals(250, statisticsCalculator.getAvgPostsPerUser());
        assertEquals(0, statisticsCalculator.getAvgCommentsPerUser());
        assertEquals(0, statisticsCalculator.getAvgCommentsPerPost());
    }
}