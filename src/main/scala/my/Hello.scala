package my

import scalafx.application
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.Label

object Hello extends JFXApp {

  stage = new application.JFXApp.PrimaryStage {
    title.value = "Hello"
    width = 600
    height = 400
    scene = new Scene {
      content = new Label("Hello, JavaFX")
    }
  }
}
