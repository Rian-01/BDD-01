Feature: Login functional in Linkedin
  As a Linkedin user
  I want to see my timeline
  So that I can like or comment my friend post

  Scenario: Login Success
    Given I am on the Sign in page
    When I enter my username and Password correctly
    And I click 'Sign in' buttom
    Then I am taken to the dashboard

  Scenario: Login Failed Case Blank
    Given I am on the Sign in page with link
    When I enter my username and Password incorrectly
    And I click 'Sign in' buttom with failed case
    Then Warning Username not valid and stay Sign in page

  Scenario: Login Failed Username Incorrectly
    Given I am on the Sign in Page with Web
    When I enter username incorrectly and Password correctly
    And I click 'Sign in' butt username incorrectly
    Then Warning Username Failed and stay Sign in page

  Scenario: Login Failed Password Incorrectly
    Given  I am on the Sign in page With Link https
    When I enter Password incorrectly
    And I click 'Sign in' buttom Password incorrectly
    Then Warning Password not Right and stay Sign in page

  Scenario: Login Blank Case
    Given I am on the Sign in page with apk
    When I enter username and Password Blank
    And I click 'Sign in' buttom in page
    Then I am stay in login page