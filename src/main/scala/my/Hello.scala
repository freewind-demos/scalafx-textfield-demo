package my

import scalafx.Includes._
import scalafx.application
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

object Hello extends JFXApp {

  stage = new application.JFXApp.PrimaryStage {
    title.value = "Hello"
    width = 600
    height = 400
    scene = new Scene {
      fill = LightGreen
      content = new Rectangle {
        x = 25
        y = 40
        width = 100
        height = 100
        fill <== when(hover) choose Green otherwise Red
      }
    }
  }
}
