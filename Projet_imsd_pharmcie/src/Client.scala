/**
  * Created by mouradkaroui on 20/10/2016.
  */
class Client(private var nom:String,private var credit: Double ) {



 /* 1- Définir une fonction
    qui fait augmenter le crédit
  */
  def update_credit(cr:Double)={credit+=cr}

  /* 2- Définisser les fonctions
  getValue(...) pour les paramétres
  de la classe
   */
  //def getnom1{return (nom) }

  def getValue_nom():String={
    return(nom)
  }
  def getValue_credit():Double={
    return (credit)
  }//peut etre négative!
  //def set_nom(nom1:String)={this.nom=nom}
  //def set_credit(credit:Double)={this.credit=credit}


}
