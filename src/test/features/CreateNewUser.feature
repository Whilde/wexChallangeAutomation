 Feature: Execute Automation Selenium Site

   Background: Login in the site
     Given  a "user" and "password"
     And  click in login
     Then the site will open a home page

   Scenario: Create new User
     Given  choose the  Title
     And    insert the Initial "Pedro"
     And    insert the First  Name "Hildebrando"
     And    insert the Middle Name "Sacramento"
     And    choose the Gender Female
     And    deselect language English
     And    select language Hindi
     When   Click in Save
     And    Click in Generate
     Then   Confirm first alert
     And    Confirm second alert





