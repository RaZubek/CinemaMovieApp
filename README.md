# CinemaMovieApp
Zápočtový projekt

Dokumentace - Rezervační systém pro rezervaci lístku do kina

Technické parametry
--------------------
Autor: Radim Zubek (ZUB0050)
Apache NetBeanns IDE 12.0
JDK 11
Encoding UTF-8
--------------------

Popis aplikace:
Uživatel má možnost v aplikaci nahlédnout na seznam promítaných filmů, prohlížet si detail filmů,
následně si uživatel vybere, který z filmů si chce rezervovat a obdrží svůj lístek.
--------------------

Průvodce aplikací:
1) Uživateli se zobrazí číselný seznam promítaných filmů.
2) Uživatel může dle čísla, které zadá do konzole zobrazovat detail jednotlivých filmů, opakovaně a libovolně.
3) Pokud má uživatel vybráno přejde k dalšímu kroku zadáním Y do konzole, pokud si nic nevybral a chce odejít zadá do konzole N.
4) Uživatel do konzole vloží číslo filmu, jakožto jeho finální verdikt.
5) Aplikace se dotáže, zda chce uživatel jeho vybraný film(finální verdikt) nezávazně rezervovat.
   Pokud ano zadá uživatel do konzole Y, pokud si uživatel svůj finální verdikt rozmyslel, zadá do konzole N
   a svůj finální verdikt změní.
6) Po potvrzení aplikace uživateli vytiskne lístek s názvem ticket.txt, který nalezne v souborech aplikace.
