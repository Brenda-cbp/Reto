# Autor: Brenda Barahona

@stories
Feature: Register a new user in UTest
    As a user, I want to register on UTest
    @scenario1
    Scenario: Fill out the UTest platform registration form
        Given than Camilo wants to register on UTest platform
        When he completes the registration form with his data
        | firstName | lastName  | email            | monthBirth | birthDay | yearBirth | city   | zip   | country  | computer | version | language | mobile  | model  | operatingSystem | password         |
        | Camilo    | Rodriguez | camilo@gmail.com | September  | 7        | 2001      | Bogota | 11011 | Colombia | Windows  | 10      | English  | Samsung | Galaxy | Android 4.1     | academyChoucair1 |
        Then he finds the final button and registration is successful
        | finalButtonText |
        | Complete Setup  |
