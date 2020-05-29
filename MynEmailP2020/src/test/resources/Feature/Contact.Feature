@tag

Feature: Myntra's email verification policy messag
  This feature will test Myntra's email verification policy message.
  
 Background:
 Given Myntra Homepage is launched1.
   
 
   @Sprint1, @Auto1
  Scenario: Verify if customer can view myntra's email verification policy message.
    
  
    When click on contact us
    Then click on frequently asked questions
    Then customer scrolled down and click to view Email verification policy
    Then customer should be able to view the policy message.
    