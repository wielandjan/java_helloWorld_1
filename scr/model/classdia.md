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
        -DESCRIPTION : String #123;final#125;
        -numberOfDices : int #123;static#125;
        -isConnected : boolean
        -isOn : boolean
        -plugType : PlugType #123;final#125;
        -lightBulb : LightBulb
    }
```
