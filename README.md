# Ennoncé du TP:
La pharmacie gère des clients et des médicaments, elle est donc caractérisé par un
tableau de clients et un tableau de médicaments.
Un client est caractérisé par un nom(de type String) et un crédit (de type Double). Le
crédit représente la somme que ce client doit à la pharmacie. Le crédit peut être négatif si
le client a versé plus d'argent que le montant.
Un médicament est caractérisé par un nom (de type String), un prix (de type double) et
un stock (de type int).
Il y aura 4 classe à définir une classe "Pharmacie", une classe "Client", une classe
"Medicament" et une classe Object qui contient le "main" du programme.
Les fonctions à définir dans la classe "Pharmacie" auront les caractéristiques suivantes:
- affichage(..) permet d'afficher les clients et leurs crédits respectifs ainsi que les
médicaments et leurs stocks respectifs.
- approvisionner(..) permet d'approvisionner le stock d'un médicament. Le nom du
médicament à approvisionner ainsi que la quantité à ajouter au stock doivent être lus
depuis le terminal. Lorsque le nom du médicament est introduit, il faut vérifier qu'il s'agit
bien d'un nom connu dans la liste des médicaments de la pharmacie. Le programme doit
boucler jusqu'à introduction d'un nom correct. Cette procédure de vérification sera prise en
charge par la fonction lireMedicament(..) (voir plus bas) dans la même classe.
- achat(..) permet de traiter un achat fait par un client. l'achat porte sur un
médicament donné dans une quantité donnée. Pour cette transaction le client paie un
certain prix (de son choix). Une opération d'achat aura pour effet de déduire la quantité
achetée du stock du médicaments correspondant et d’augmenter (ou diminuer) le crédit du
client (d'un montant équivalent au montant de l'achat moins la somme payée). Les noms
du client et du médicament doivent être lus depuis le terminal. Le programme doit
boucler jusqu'à introduction de noms connus aussi bien pour les clients que les
médicament. Ces procédures de vérification seront prises en charge par les fonctions
lireClient(…) et lireMedicament(…) (voir plus bas). La quantité achetée et le montant
payé sont aussi lus depuis le terminal. Ils seront supposés corrects.
- quitter(..) affiche le message "Merci et aurevoir’’, et le programme s’arrête.
Vous définirez une fonction auxiliaire lireClient(..). Elle permettra de lire le nom d'un client
depuis le terminal et de vérifier si ce client existe dans le tableau des clients. Dans ce cas
le client sera retourné. Cette fonction doit boucler jusqu'à ce qu'un client soit trouvé. Elle
sera utilisée par la fonction achat(..). Une fonction similaire, lireMedicament(..) pour la
vérification des noms de médicaments sera fournie. Elle sera utilisée par les fonctions
achat(..) et approvisionnement(..).
Vous êtes libre de définir, en plus de ces fonctions, toutes celles que vous jugerez
nécessaires.
Lors de la programmation, il vous est demandé de respecter scrupuleusement les
indications suivantes:
- Votre programme doit être bien claire à la fois sous forme de fonctions auxiliaires
de la fonction main() et sous forme de classes pour les objets du programme. En
particulier et très important :
- Pour chaque classe, il faut utiliser le mot-clé private, pour la déclaration de ces
champs, autant que possible. Ce qui signifie, toutes les variables d'instances
seront privées. Ce qui amène à avoir pour chaque variable une fonction
getVariable(…) qui retourne la valeur de celle-ci.
Dans la classe Client il faut en plus des fonctions getVariable(…) définir une fonction
pour augmenter (ou diminuer) le crédit du client.
Dans la classe médicament il faut en plus des fonctions getVariable(…) définir deux
fonctions, une pour augmenter le stock et une autre pour le diminuer.
Dans la fonction "Main", commencer le programme par :
1- Définir au minimum deux clients avec les valeurs de leurs paramètres (nom, crédit), en
les ajoutant dans un premier tableau
2- Définir au minimum deux médicaments avec les valeurs de leurs paramètres (nom, prix,
stock) en les ajoutant dans un deuxième tableau
3- Créer un objet de la classe Pharmacie, en lui passant comme paramètres les tableaux
de clients et de médicaments créé précédemment
4- Afficher un menu de ce type :
1 : Achat de médicament
2 : Approvisionnement en médicaments
3 : Etats des stocks et des crédits
4 : Quitter
et demander à l’utilisateur de choisir en saisissant un chiffre entre 1 et 4
1 => achat(…)
2 => approvisionner(…)
3 => affichage(…)
4 => quitter(…)
NB1 : L’utilisateur ne peut quitter le programme que en appuyant sur "4" dans le menu.
NB2 : Prenez aussi en compte que l’utilisateur peut saisir un chiffre différent de ceux qui
sont proposés.
NB3 : Pour les méthodes lireClient(…) et lireMedicament(…) (décrit précédemment), le
programme doit demander à l’utilisateur de saisir un nom (du client ou du médicament),
jusqu’à ce que celui-ci en saisisse un se trouvant bien dans son tableau correspondant.
