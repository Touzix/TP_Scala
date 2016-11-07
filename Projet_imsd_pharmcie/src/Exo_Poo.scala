/**
  * Created by mouradkaroui on 20/10/2016.
  */
object Exo_Poo {
  def main(args: Array[String]): Unit = {



    /* 1- Déclaration des deux tableaux
       Le premier de type client
       Le deuxième de type médicament
    */
    val tab_client= new Array[Client](3)
    val tab_medicament= new Array[Medicament](3)

    /* 2- Définir au minimum deux clients et deux médicaments
      et les ajouter à leurs tableaux respectifs
    */

    tab_client(0)=new Client("Marwen",100)
    tab_client(1)=new Client("Salma",20)
    tab_client(2)=new Client("Hiba",0)
    tab_medicament(0)=new Medicament("Doliprane",30,2)
    tab_medicament(1)=new Medicament("Zyrtec",10,4)
    tab_medicament(2)=new Medicament("Aspegic",2,50)

    /* 3- Définir un objet de la classe pharmacie
      en lui passant comme paramètre les deux tableaux
      défini précédemment
    */
    //ps: Si j'ai bien compris, ici il s'agit d'une instance de la classe et non pas un objet car si je me rappelle bien
    // l'objet sous scala est créé directement lors de la déclaration
    // C'est à dire au lieur de déclarer la classe pharmacie avec le mot "class" on met "objet" ou on utilise la notion de singleton
    // et comme on utilise une seule pharmacie ça serait mieu de la déclarer directement comme objet
    //si c'est pas correcte veillez me corriger (touzi.marwen@gmail.com)  et merci bien.
  val pharmacie=new Pharmacie(tab_client,tab_medicament)


    /* 4- Afficher à l'utilisateur le menu :
      Des que l'utilisateur termine une opération le menu lui sera
      réafficher, jusqu'à ce qu'il choisisse de le quitte (en choisissant l'option 4)
      NB : Essayer de passer par une fonction pour afficher le menu
    */
    var choix =0
    do{
      println ("======================MENU========================")
      println("Si vous voulez faire une opération d'achat, cliquez sur ==> 1")
      println("Si vous voulez faire une opération d'approvisionnement, cliquez sur==> 2")
      println("Si vous voulez obtenir l'affichage, cliquez sur ==> 3")
      println("Si vous voulez quitter, cliquez sur ==> 4")
      println ("======================================================")
      choix=saisir_choix()
      matching(choix)
    }while(choix != 4 )


    def saisir_choix():Int={
      var choix=0
      do{
        var ch=scala.io.StdIn.readLine()
        try{
          choix=ch.toInt
        }
        catch {
          case e: Exception => {
            println("ouuups ")

          }
        }

        if (choix>4 || choix<=0) println("desole mais votre choix ne figure pas parmis notre menu, merci de rééseyer")
      }while(choix>4 || choix<=0 )
      return choix
    }
    def matching(x:Int):Any=x match{
      case 1 =>pharmacie.achat()
      case 2 =>pharmacie.approvisionnement()
      case 3 => pharmacie.affichage()
      case 4 => pharmacie.quitter()
    }

  }
}


