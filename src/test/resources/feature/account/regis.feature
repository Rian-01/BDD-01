Feature: Registration functional in Linkedin
  As a Linkedin user
  I want to make new account
  So I can see my timeline and post my activity


  Scenario: Registration Success
    Given I am on the Sign up page account
    When I enter my number or email and password 6 or more character
    When I click 'Agree & Join' butt in page Sign Up
    When I enter First Name and Last Name
    When I click 'Continue' buttom in page Sign Up
    And  I click Verification in a Gmail Massage
    Then I am taken to the dashboard Linkedin
