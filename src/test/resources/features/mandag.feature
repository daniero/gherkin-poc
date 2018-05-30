# language: no
Egenskap: Mandag
  Skal finne neste mandag

  Scenario: Det er onsdag
    Gitt datoen 2018-05-30
    Når man skriver "mandag"
    Så får man 2018-06-04

  Scenario: Det er mandag
    Gitt datoen 2018-05-14
    Når man skriver "mandag"
    Så får man 2018-05-14
