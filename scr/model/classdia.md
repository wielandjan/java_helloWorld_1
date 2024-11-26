```mermaid
classDiagram
    class TableLight {
        +TableLight()
        +TableLight(LightBulb lightBulb)
        +TableLight(LightBulb lightBulb, PlugType plugType)
        +changeLightBulb(LightBulb newLightBulb) LightBulb
        +getLightBulb() LightBulb
        +getPlugType() PlugType
        +isConnected() boolean
        +isOn() boolean
        +isShining() boolean
        +plugIn()
        +pullThePlug()
        +switchOff()
        +switchOn()
        +getNumberOfDices() int
        -{static} {final} String DESCRIPTION
        -{static} int numberOfDices
        -boolean isConnected
        -boolean isOn
        -{final} PlugType plugType
        -LightBulb lightBulb
    }
```
