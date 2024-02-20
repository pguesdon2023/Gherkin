Feature: Cura Login

  @test
  Scenario: Valid login
    Given I'm on Cura Login Page
    When I log with username "John Doe" and password "ThisIsNotAPassword"
    Then I am on appointment page

  @test
  Scenario: wrong id
    Given I'm on Cura Login Page
    When I log with username "Jane Doe" and password "ThisIsNotAPassword"
    Then I am on login page

    @test
    Scenario: wrong password
      Given I'm on Cura Login Page
      When I log with username "John Doe" and password "toto"
      Then I am on login page