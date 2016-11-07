/**
  * Created by mouradkaroui on 20/10/2016.
  */
class Medicament(private var nom:String,private var prix: Double,var stock:Int ) {


  /* 1- Définir les deux fonctions
    qui augmentent et diminuents
    les stocks
  */

  def augment_stock(a : Int)={stock+=a}
  def diminue_stock(a:Int)={stock-=a}

  /* 2- Définisser les fonctions
  getValue(...) pour les paramétres
  de la classe
   */

  def getValue_nom:String={return (nom) }
  def getValue_prix:Double={return (prix)}
  def getValue_stock:Int={return (stock) }
  //def setnom(nom:String)={this.nom=nom}
  //def setcredit(prix:Double){this.prix=prix}
  //def setcredit(stock:Double){this.stock=stock}

}
