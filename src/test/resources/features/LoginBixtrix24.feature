Feature: Login
  1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Scenario: Marketing login scenario
    Given User is on the login page
    Then  User logs in as a User (marketing)
    Then  User should see the Stream

    Scenario:

