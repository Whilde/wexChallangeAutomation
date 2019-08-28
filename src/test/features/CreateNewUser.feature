 Feature: Execute Automation Selenium Site

   Background: Login in the site
     Given  a "user" and "password"
     And  click in login
     Then the site will open a home page

   Scenario: Create new User
     Given  choose the  Title
     And    insert the Initial
     And    insert the First Name
     And    insert the Middle Name
     And    choose the Gender
     And    choose the Languages Know
     When   Click in Save
     And    Click in Generate
     Then   Confirm first alert
     And    Confirm second alert





