# language: no
Egenskap: I morgen
  Alle varianter av "i morgen" skal gi morgensdagens dato.

  Scenario: imorgen
    Gitt datoen 2018-05-27
    Når man skriver "imorgen"
    Så får man 2018-05-28

  Scenario: i morgen
    Gitt datoen 2018-07-26
    Når man skriver "i morgen"
    Så får man 2018-07-27
