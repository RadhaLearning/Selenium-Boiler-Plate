Feature: Login Functionality

  Scenario Outline: Login with valid credentials
    Given User navigates to login page
    When User enters the valid email address "<email>" and valid password "<password>"
    And User clicks on the login button
    
    Examples: 
      | email                      | password   |
      | admintwo@yopmail.com					 | Test@123 |

      
  Scenario Outline: Login with invalid credentials
    Given User navigates to login page
    When User enters the invalid email address "<email>" and invalid password "<password>"
    And User clicks on the login button
     
    Examples: 
      | email                      | password   |
      | radha123@gmail.com				 | Testing123456 |


 Scenario Outline: Login with valid email and invalid password
    Given User navigates to login page
    When User enters the valid email address "<email>" and invalid password "<password>"
    And User clicks on the login button
   
    
     Examples: 
      | email                      | password   |
      | radha@gmail.com						 | Testing123456 |

  Scenario Outline: Login with invalid email and valid password
    Given User navigates to login page
    When User enters the invalid email address "<email>" and valid password "<password>"
    And User clicks on the login button
   
    
     Examples: 
      | email                      | password   |
      | radha123@gmail.com			   | Testing123 |

  
 