Feature: Bixtrix24
  1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background: Marketing login scenario
    Given User is on the login page
    And   User logs in as a User (marketing)
    Then  User should see the Stream
    Then  User clicks to Message


  Scenario: Upload file and pictures
    Given User should click upload files icon
    Then  Select a file from local disk
    Then  User should see the file uploaded



