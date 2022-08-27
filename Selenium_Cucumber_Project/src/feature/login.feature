#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@WebFormSubmissionInHeroKuapp
Feature: Web form submission
  I want to submit a webform in this site https://formy-project.herokuapp.com

  Background: User is Logged In
    Given I am in herokuapp home page
    And I navigate to herokuapp webform page

  @SmokeTest @SubmitWithBackDate
  Scenario: Submit a webform with back date
    When I enter name in herokuapp webform page
    And I select date in date field in herokuapp webform page
    And I click on submit button in herokuapp webform page
    Then I get success message for webform submission

  @RegressionTest @SubmitWebForm
  Scenario Outline: Submit a webform in herokuapp webform page
    When I enter first name <first name> in herokuapp webform page
    When I enter last name <last name> in herokuapp webform page
    And I select education level <level of education> in herokuapp webform page
    And I select sex as <sex> in herokuapp webform page
    And I select <years of experience> years of experience in herokuapp webform page
    And I click on submit button in herokuapp webform page
    Then I get success message for webform submission

    Examples: 
      | first name | last name | level of education | sex      | years of experience |
      | "Vinayaka" | "5"       | "College"          | "Male"   | "10"                 |
      | "Deepika"  | "7"       | "Grad School"      | "Female" | "3"                 |
