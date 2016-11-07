import sun.font.TrueTypeFont
/**
  * Created by mouradkaroui on 20/10/2016.
  */
class Pharmacie(private var tab_client:Array[Client], private var tab_medicament:Array[Medicament]) {

  /** méthode achat(...) Permet à un client d'acheter un médicament.
    * Le programme demande à l'utilisateur :
    * 1- Son nom
    * 2- Le nom du médicament qu'il souhaite acheté
    * 3- Le montant qu'il souhaite payer (montant >= 0)
    * 4- La quantité qu'il souhaite achété (quantité <= stock)
    *
    * si le client est connu de la pharmacie, son crédit
    * va diminuer (ou augmenter) en fonction de son paiement.
    * Le stock associé au médicament va diminuer
    * NB : Utiliser les fonctions lireClient(...) et lireMedicament(...)
    */
  def achat(): Unit ={
    val c=lireClient()
    val m=lireMedicament()
    var mont= -1.0
    do{
      println("veuillez saisir le montant que vous souhaitez payer:")
      var montant=scala.io.StdIn.readLine()
     try{
       mont=montant.toDouble
     }
      catch {
        case e: Exception => {
          println("desole mais vous devez saisir un chiffre ")

        }
      }

     // mont=Integer.parseInt(montant).toDouble
      //if( ! Integer.parseInt(montant).isInstanceOf[Double])println("desole mais vous devez saisir un chiffre ")
      //if(mont <0) println("le montant doit etre >0")
    }while(mont<0)
    var quant= -1
    do{
      println("veuillez saisir la quantité que vous souhaitez acheter:")
      var quantite=scala.io.StdIn.readLine()
      try{
        quant=quantite.toInt
      }
      catch {
        case e: Exception => {
          println("desole mais vous devez saisir un chiffre ")

        }
      }

      if(quant>m.getValue_stock)println("desolé mais notre stock pour le medicament"+m.getValue_nom+"est de : "+m.getValue_stock)
    }while(quant>m.getValue_stock ||quant <0)

    if(quant>0){
      c.update_credit(mont-(quant*m.getValue_prix))
      m.diminue_stock(quant)
      println("felicitation votre achat a bien été effectuer")
      println("votre nouveau solde est de "+c.getValue_credit())
    }

  }

  /** méthode approvisionnement(...)
    * Permet à la pharmacie de s'approvisionner en un
    * médicament connu.
    * Le programme demande à l'utilisateur :
    * 1- Le nom du médicament pour l'approvisionnement
    * 2- La quantité de l'approvisionnement
    * Le stock associé au médicament va augmenter
    * NB : Utiliser la fonction lireMedicament(...)
    */

  def approvisionnement(): Unit ={
    val medicament=lireMedicament()
    var qte = -1
    do {

      println("veuillez sasir la quantité de l'approvisionnement pour ce médicament:"+medicament.getValue_nom)
      var quantite=scala.io.StdIn.readLine()
      try{
        qte=quantite.toInt
      }
      catch {
        case e: Exception => {
          println("ouuups ")

        }
      }
      if(qte==0 )println("desole mais la quantité de l'approvisonnement doit être numerique et non nul")
    }
    while (qte<=0)
    medicament.augment_stock(qte)
    println("l'approvisionnement pour "+medicament.getValue_nom+" à été correctement effectuer ")
    println("votre noveau stock pour "+medicament.getValue_nom+" est :"+medicament.getValue_stock)


  }


  /** méthode affichage(...)
    * Affichage des stocks et des crédits de la pharmacie
    * par exemple :
      *Affichage des stocks
      *Stock du médicament Aspiron : 4
      *Stock du médicament Rhinoplexil : 5
      *Affichage des crédits
      *Crédit du client Eric : -9.40
      *Crédit du client Florence : 2.20
    */
  def affichage(): Unit ={
    println("Affichage des stock")
    for(i<- tab_medicament){
      println("stock du medicament:"+i.getValue_nom+" : "+i.getValue_stock)
    }
    println("Affichage des credits")
    for(i<- tab_client){
      println("le credit du client:"+i.getValue_nom+" : "+i.getValue_credit)
    }


  }


  /** méthode lireClient(...)
    * Retourne l'objet Client associé à un nom (String)
    * Le nom est lu et redemandé tant qu'il ne correspond
    * pas au nom d'un client connu de la pharmacie
    */
  def lireClient():Client= {
    var test = true
    var client_ret=tab_client(0)
    var v_name=""
    while (test == true) {
      println("Entrer votre nom SVP ")
      v_name = scala.io.StdIn.readLine().toString
      for (c <- tab_client) {//on va parcourire le tableau des clients
        if (v_name == c.getValue_nom()) {
          test=false
          client_ret=c
        }
      }
      if(test==true)  println("desole mais aucun client ne correspond à ce nom")

    }
    return client_ret
  }

  /** méthode lireMédicament(...)
    * Retourne l'objet Medicament associé à un nom (String)
    * Le nom est lu et redemandé tant qu'il ne correspond
    * pas au nom d'un médicament connu de la pharmacie
    */

  def lireMedicament():Medicament= {
    var test = true
    var medicament_ret=tab_medicament(0)
    while (test == true) {
      println("Entrer le nom du medicament SVP ")
      val v_name = scala.io.StdIn.readLine().toString
      for (c <- tab_medicament) {
        if (v_name == c.getValue_nom) {
          test=false
          medicament_ret=c
        }
      }
      if(test==true)  println("desole mais aucun medicament ne correspond à ce nom")


    }
    return medicament_ret
  }


  def quitter() = {
    println("Merci et aurevoir")
  }


}


