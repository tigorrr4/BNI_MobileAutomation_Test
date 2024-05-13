Feature:  Login


  @Login @Negative
  Scenario: User login with invalid email and invalid password
    Given User landing on login page
    When  User tap profil button
    And   User tap Sign up or Log in
    And   User tap login
    When  User input email "michaeljosua49@gmail.comm"
    And   User input password "Reniwati123m"
    When  User tap login button
    Then  User verify failed login

  @Login @Negative
  Scenario: User login with invalid email and valid password
    Given User landing on login page
    When  User tap profil button
    And   User tap Sign up or Log in
    And   User tap login
    When  User input email "michaeljosua49@gmail.comm"
    And   User input password "Reniwati123"
    When  User tap login button
    Then  User verify failed login

  @Login @Negative
  Scenario: User login with valid email and invalid password
    Given User landing on login page
    When  User tap profil button
    And   User tap Sign up or Log in
    And   User tap login
    When  User input email "michaeljosua49@gmail.com"
    And   User input password "Reniwati123mm"
    When  User tap login button
    Then  User verify failed login


  @Login @Negative
  Scenario: User login with empty email and valid password
    Given User landing on login page
    When  User tap profil button
    And   User tap Sign up or Log in
    And   User tap login
    When  User input email ""
    And   User input password "Reniwati123"
    Then  User cant tap login button are disable

  @Login @Negative
  Scenario: User login with valid email and empty password
    Given User landing on login page
    When  User tap profil button
    And   User tap Sign up or Log in
    And   User tap login
    When  User input email "michaeljosua49@gmail.comm"
    And   User input password ""
    Then  User cant tap login button are disable
#
  @Login @Negative
  Scenario: User login with empty email and empty password
    Given User landing on login page
    When  User tap profil button
    And   User tap Sign up or Log in
    And   User tap login
    When  User input email ""
    And   User input password ""
    Then  User cant tap login button are disable

  @Login @Positive
  Scenario: User login with valid email and valid password
    Given User landing on login page
    When  User tap profil button
    And   User tap Sign up or Log in
    And   User tap login
    When  User input email "michaeljosua49@gmail.com"
    And   User input password "Reniwati123"
    When  User tap login button




