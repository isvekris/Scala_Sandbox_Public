object FunTimes extends App{
  import doodle.core._
  import doodle.image._
  import doodle.image.syntax._
  import doodle.image.syntax.core._
  import doodle.java2d._

//var a = Image.circle(800).draw()
//var b = Image.rectangle(1000,500).draw()
//var c = Image.triangle(600, 400).draw()


//  (Image.circle(400).on(Image.circle(200))).under(Image.rectangle(200,500)).draw()
//  (Image.circle(400).above(Image.rectangle(200,500))).draw()
//  (Image.circle(400).below(Image.rectangle(200,500))).draw()
//  Image.circle(100).fillColor(Color.red).noStroke.beside(Image.circle(100).strokeColor(Color.mediumVioletRed)).beside(Image.circle(100).strokeWidth(33)).on(Image.circle(300)).draw()

  //Evil eye masterpiece
Image.circle(100).fillColor(Color.black).strokeWidth(3).on(Image.circle(200).strokeWidth(3).fillColor(Color.cornflowerBlue).strokeWidth(3)).on(Image.circle(280).fillColor(Color.white).strokeWidth(3)).on(Image.circle(500).fillColor(Color.darkBlue).strokeWidth(3)).draw()


var a = 0.degrees
  print(a)
}
