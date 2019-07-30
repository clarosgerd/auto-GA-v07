Feature: Api Documentation Validation

Scenario: Load Nasa API Page
    Given I Open the Nasa Page
    And click 'NasaApiListing' link on 'Left Panel' page #
    And newClick 'NasaApiListing' link on 'Left Panel' page
    And click 'Earth' link on 'Left Panel' page
    And click 'Imagering' sublink on 'LeftPanel' page
    Then verify the 'GETUrl' isEquals to 'urlGetText' in page
