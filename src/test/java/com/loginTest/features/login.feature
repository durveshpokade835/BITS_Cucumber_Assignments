#Feature: Login Functionality
#
#  Scenario: Login with valid credentials and verify successful login
#    Given I am on the login page
#    When User login with "hardstop-pharmacist6@mailinator.com" and "Password1#"
#    Then I should be redirected to the dashboard
#
#  Scenario: Login with invalid password and verify error message
#    Given I am on the login page
#    When User login with "hardstop-pharmacist6@mailinator.com" and "Password1#"
#    Then I should see an error message "Wrong username/password"
#
#  Scenario: Login with invalid email and verify error message
#    Given I am on the login page
#    When User login with "hardstop-pharmacist6@mailinator.com" and "Password1#"
#    Then I should see an error message "User not found"


Feature: Login Functionality

  Scenario: Login with valid credentials and verify successful login
    Given User on the login page
    When User login with "hardstop-pharmacist6@mailinator.com" and "Password1#"
    Then User should be redirected to the dashboard

  Scenario: Login with invalid password and verify error message
    Given User on the login page
    When User login with "hardstop-pharmacist6@mailinator.com" and "Password"
    Then User should see an error message "Wrong username/password"

  Scenario: Login with invalid email and verify error message
    Given User on the login page
    When User login with "hardstop-pharmacist6@mailinator.co" and "Password1#"
    Then User should see an error message "User not found"
