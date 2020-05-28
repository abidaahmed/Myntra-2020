


@tag
Feature: Myntra's kids section verification
  This feature will test Myntra's kids section.
  
 Background:
 Given Myntra Homepage is launched.
   
 
   @Sprint1 @Auto
  Scenario: Verify if customer can purchase kids backpack from Myntra.
    
    When Customer mouse over on kids button
    Then selects Bags & BackPacks button
    Then click on Nike Brand
    Then select a random bag
    Then Customer should successfully add to bag.
    